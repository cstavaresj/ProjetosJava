package br.uniube.mb;

import java.util.List;

import javax.xml.bind.ValidationException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import br.uniube.dao.DoencaDAO;
import br.uniube.model.Doenca;

public class DoencaMB extends GenericoMB {

	private static final long serialVersionUID = 8681338268167191368L;

	private Doenca doenca = new Doenca();
	private Doenca doencaSelecionado;
	private List<Doenca> doencas;

	public DoencaMB() {

		setLogger(Logger.getLogger(DoencaMB.class));
		setBundle(super.getBundle("bundle.Idioma"));
		novo();
	}

	public void novo() {

		limpaCampos();
	}

	public void salvar() {
		try {
			validaCampos();

			// chama o DAO para para fazer a inserção
			// if (getDoenca().getRa() == 0) getDoenca().setRa(null);
			DoencaDAO daoDoenca = new DoencaDAO();
			daoDoenca.salvaOuEdita(getDoenca());
			limpaCampos();
			msgSuccess("MSG_DoencaCadastrado");

		} catch (ValidationException e) {
			msgError(e.getMessage());
		} catch (Exception e) {
			msgError("MSG_FalhaAoCadastrarDoenca");
		}
	}

	private void limpaCampos() {

		try {
			DoencaDAO dao = new DoencaDAO();
			List<Doenca> Doencas = dao.buscaDoencas();
			setDoencas(Doencas);

			Doenca Doenca = new Doenca();
			setDoenca(Doenca);

		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarDoenca");
		}
	}

	private void validaCampos() throws ValidationException {

		if (StringUtils.isEmpty(getDoenca().getNome())) {

			throw new ValidationException("MSG_CampoDoencaObrigatorio");
		}
	}

	/** Remove o Doenca selecionado. **/
	public void remover() {

		try {

			if (getDoencaSelecionado() != null) {

				// chama o DAO para para fazer a exclusão
				DoencaDAO dao = new DoencaDAO();
				Doenca doencaEncontrado = dao.buscaPorId(getDoencaSelecionado()
						.getId());
				dao.remove(doencaEncontrado);
				setDoencas(dao.buscaDoencas());
				msgInfo("MSG_DoencaRemovido");

			} else {
				msgError("MSG_NenhumDoencaSelecionado");
			}

		} catch (Exception e) {
			msgError("MSG_FalhaAoRemoverDoenca");
		}
	}

	/** * Altera o Doenca selecionado. */
	public void editar() {

		try {

			validaCampos();
			// chama o DAO para para fazer a alteração
			DoencaDAO dao = new DoencaDAO();
			dao.atualiza(getDoenca());
			limpaCampos();
			msgSuccess("MSG_DoencaAlterado");

		} catch (ValidationException e) {
			msgError(e.getMessage());
		} catch (Exception e) {
			msgError("MSG_FalhaAoAlterarDoenca");
		}
	}

	/** Exibe o Doenca selecionado para edicao. **/
	public void exibirParaEdicao() {

		if (getDoencaSelecionado() != null) {

			setDoenca(getDoencaSelecionado());

		} else {
			msgError("MSG_NenhumDoencaSelecionado");
		}
	}

	/** Pesquisa os Doencas de acordo com os campos preenchidos. **/
	public void pesquisar() {

		try {

			DoencaDAO dao = new DoencaDAO();
			List<Doenca> listaDoencas = dao.pesquisar(getDoenca());
			setDoencas(listaDoencas);
			msgInfo("MSG_XDoencasEncontrados", listaDoencas.size());

		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarDoenca");
		}
	}

	// GETTERS AND SETTERS

	public Doenca getDoenca() {
		return doenca;
	}

	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}

	public Doenca getDoencaSelecionado() {
		return doencaSelecionado;
	}

	public void setDoencaSelecionado(Doenca doencaSelecionado) {
		this.doencaSelecionado = doencaSelecionado;
	}

	public List<Doenca> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}
}
