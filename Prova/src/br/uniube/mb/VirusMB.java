//Back-end ManegedBean Controlador

package br.uniube.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;
import javax.xml.bind.ValidationException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import br.uniube.dao.VirusDAO;
import br.uniube.dao.DoencaDAO;
import br.uniube.model.Virus;
import br.uniube.model.Doenca;

public class VirusMB extends GenericoMB { 

	private static final long serialVersionUID = 8681338268167191368L;

	private Virus virus = new Virus(); 				// Cria um novo objeto Vírus
	private Virus virusSelecionado;					// Classe usada para edição de um objeto vírus
	private List<Virus> viruss;						// Lista todos os objetos vírus para mostrar na tabela de consulta
	private List<Doenca> doencas; 					// Lista todos os objetos doenças
	private List<SelectItem> listaDoencasCombobox;	// Lista as doenças no combobox
	private int idDoencaSelecionado;				// Identifica a doença selecionada

	public VirusMB() {

		setLogger(Logger.getLogger(VirusMB.class));
		setBundle(super.getBundle("bundle.Idioma"));
		novo();
	}

	public void novo() { 	//função criar novo Vírus

		limpaCampos();
		buscaDoencas();
	}

	
	public void buscaDoencas() { 				//Função que busca as doenças para preencher no combobox

		try {
			listaDoencasCombobox = new ArrayList<SelectItem>();		//Cria uma lista
			DoencaDAO dao = new DoencaDAO();						//Manda a informaçao para a classe DoencaDAO
			List<Doenca> listaDoencas = dao.buscaDoencas();			//O DAO busca no banco de dados
			setDoencas(listaDoencas);								
			SelectItem vazio = new SelectItem(0, "");
			listaDoencasCombobox.add(vazio);
			// mosta o arraylist para poder incluir no combobox
			for (int i = 0; i < listaDoencas.size(); i++) {
				Doenca objDoenca = listaDoencas.get(i);
				SelectItem si = new SelectItem(objDoenca.getId(),
						objDoenca.getNome());
				listaDoencasCombobox.add(si);
			}
			System.out.println("Buscou os doencas:" + listaDoencas.size());
		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarVirus");
		}
	}

	public void salvar() {						//Função que salva um novo objeto
		try {
			validaCampos();
			// chama o DAO para buscar o doenca
			DoencaDAO daoDoenca = new DoencaDAO();
			Doenca objDoenca = daoDoenca.buscaPorId(idDoencaSelecionado);
			getVirus().setTbDoenca(objDoenca);
			// chama o DAO para para fazer a inserção
			VirusDAO daoVirus = new VirusDAO();
			daoVirus.salvaOuEdita(getVirus());
			limpaCampos();
			msgSuccess("MSG_VirusCadastrado");

		} catch (ValidationException e) {
			msgError(e.getMessage());
		} catch (Exception e) {
			msgError("MSG_FalhaAoCadastrarVirus");
		}
	}

	private void limpaCampos() {		//Função que limpa os campos

		try {
			VirusDAO dao = new VirusDAO();
			List<Virus> Viruss = dao.buscaViruss();
			setViruss(Viruss);

			Virus Virus = new Virus();
			Virus.setExiste_vacina(true);
			setVirus(Virus);

		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarVirus");
		}
	}

	private void validaCampos() throws ValidationException {

		if (StringUtils.isEmpty(getVirus().getNome())) {
			throw new ValidationException("MSG_CampoNomeObrigatorio");
		} else if (StringUtils.isEmpty(getVirus().getTipo())){
				throw new ValidationException("MSG_CampoTipoObrigatorio");
			} else if (getVirus().getExiste_vacina() == null) {
					throw new ValidationException("MSG_CampoNomeObrigatorio");
				}else if (idDoencaSelecionado == 0) {
					throw new ValidationException("MSG_CampoDoencaObrigatorio");
					}
	}

	public void remover() { 		//fução que apaga o vírus selecionado

		try {

			if (getVirusSelecionado() != null) {

				// chama o DAO para para fazer a exclusão
				VirusDAO dao = new VirusDAO();
				Virus virusEncontrado = dao.buscaPorId(getVirusSelecionado()
						.getId());
				dao.remove(virusEncontrado);
				setViruss(dao.buscaViruss());
				msgInfo("MSG_VirusRemovido");

			} else {
				msgError("MSG_NenhumVirusSelecionado");
			}

		} catch (Exception e) {
			msgError("MSG_FalhaAoRemoverVirus");
		}
	}

	public void editar() { 		//fução que altera o vírus selecionado

		try {

			validaCampos();
			// chama o DAO para para fazer a alteração
			VirusDAO dao = new VirusDAO();
			dao.atualiza(getVirus());
			limpaCampos();
			msgSuccess("MSG_VirusAlterado");

		} catch (ValidationException e) {
			msgError(e.getMessage());
		} catch (Exception e) {
			msgError("MSG_FalhaAoAlterarVirus");
		}
	}

	/** * Exibe o Virus selecionado para edicao. */
	public void exibirParaEdicao() {

		if (getVirusSelecionado() != null) {

			setVirus(getVirusSelecionado());
			// acrescentado para setar o combobox
			setIdDoencaSelecionado(getVirusSelecionado().getTbDoenca().getId());

		} else {
			msgError("MSG_NenhumVirusSelecionado");
		}
	}

	/** * Pesquisa os Viruss de acordo com os campos preenchidos. */
	public void pesquisar() {

		try {
			// acrescentado para considerar o filtro do combobox
			Doenca objDoenca = new Doenca();
			objDoenca.setId(idDoencaSelecionado);
			getVirus().setTbDoenca(objDoenca);

			VirusDAO dao = new VirusDAO();
			List<Virus> listaViruss = dao.pesquisar(getVirus());
			setViruss(listaViruss);
			msgInfo("MSG_XVirussEncontrados", listaViruss.size());

		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarVirus");
		}
	}

	// GETTERS AND SETTERS

	public List<Virus> getViruss() { 		//retorna os valores da lista
		return viruss;
	}
	
	public void setViruss(List<Virus> Viruss) {		//altera os valores da lista	
		this.viruss = Viruss;
	}

	
	public List<SelectItem> getListaDoencasCombobox() { 		
		return listaDoencasCombobox;
	}

	public void setListaDoencasCombobox(List<SelectItem> listaDoencasCombobox) { 
		this.listaDoencasCombobox = listaDoencasCombobox;
	}

	
	public Virus getVirus() {	
		return virus;
	}

	public void setVirus(Virus virus) { 	//atribui (modifica) os valores da variável virus
		this.virus = virus;
	}

	
	public Virus getVirusSelecionado() {
		return virusSelecionado;
	}

	public void setVirusSelecionado(Virus VirusSelecionado) {
		this.virusSelecionado = VirusSelecionado;
	}

	
	public List<Doenca> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}

	
	public int getIdDoencaSelecionado() {
		return idDoencaSelecionado;
	}

	public void setIdDoencaSelecionado(int idDoencaSelecionado) {
		this.idDoencaSelecionado = idDoencaSelecionado;
	}
}
