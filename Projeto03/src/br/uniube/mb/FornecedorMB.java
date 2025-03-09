package br.uniube.mb;

import java.util.List;
import javax.xml.bind.ValidationException;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import br.uniube.dao.FornecedorDAO;
import br.uniube.model.Fornecedor;

public class FornecedorMB extends GenericoMB {

	private static final long serialVersionUID = 8681338268167191368L;

	private Fornecedor fornecedor = new Fornecedor();
	private Fornecedor fornecedorSelecionado;
	private List<Fornecedor> fornecedores; // arraylist da consulta
	
	public FornecedorMB() {
		setLogger(Logger.getLogger(FornecedorMB.class));
		setBundle(super.getBundle("bundle.Idioma"));
		novo();
	}
	
	public void novo() { //Limpa os campos para criar um novo Fornecedor
		limpaCampos();	
	}
	
	public void salvar() { //Salva um novo Fornecedor com os dados inseridos no formulário
		try {
			validaCampos();
			// chama o DAO para para fazer a inserção
			if (getFornecedor().getCodigo() == 0) getFornecedor().setCodigo(null); 
			FornecedorDAO dao = new FornecedorDAO();
			dao.salva(getFornecedor());
			limpaCampos();
			msgSuccess("MSG_FornecedorCadastrado");
			
		} catch (ValidationException e) {
			msgError(e.getMessage());
		} catch (Exception e) {
			msgError("MSG_FalhaAoCadastrarFornecedor");
		}	
	}
	
	public void salvaOuEdita() { //Usado para salvar uma alteração feita após editar os dados de um Fornecedor
		try {
			validaCampos();
			// chama o DAO para para fazer a inserção
			if (getFornecedor().getCodigo() == 0) getFornecedor().setCodigo(null); 
			FornecedorDAO dao = new FornecedorDAO();
			dao.salvaOuEdita(getFornecedor());
			limpaCampos();
			msgSuccess("MSG_FornecedorCadastrado");
			
		} catch (ValidationException e) {
			msgError(e.getMessage());
		} catch (Exception e) {
			msgError("MSG_FalhaAoCadastrarFornecedor");
		}
	}
	
	public void pesquisar() { //Pesquisa os Fornecedores de acordo com os campos preenchidos
		try {
			FornecedorDAO dao = new FornecedorDAO();
			List<Fornecedor> listaFornecedores = dao.pesquisar(getFornecedor());
			setFornecedores(listaFornecedores);
			msgInfo("MSG_XFornecedoresEncontrados", listaFornecedores.size());
			
		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarFornecedor");
		}
	}
	
	public void remover() { //Usado para excuir do banco de dados o Fornecedor selecionado
		try {
			if (getFornecedorSelecionado() != null) { 
				// chama o DAO para para fazer a exclusão
				FornecedorDAO dao = new FornecedorDAO();
				Fornecedor fornecedorEncontrado = dao.buscaPorId(getFornecedorSelecionado().getCodigo());
				dao.remove(fornecedorEncontrado);
				setFornecedores(dao.buscaFornecedores());
				msgInfo("MSG_FornecedorRemovido");
			} else {
				msgError("MSG_NenhumFornecedorSelecionado");
			}
			
		} catch (Exception e) {
			msgError("MSG_FalhaAoRemoverFornecedor");
		}
	}
	
	
	public void exibirParaEdicao() {  //Usado para aparecer no formulário os dados para edição do Fornecedor selecionado
		if (getFornecedorSelecionado() != null) {	
			setFornecedor(getFornecedorSelecionado());
		} else {
			msgError("MSG_NenhumFornecedorSelecionado");
		}	
	}

	private void limpaCampos() { //Limpa os campos do formulário
		try {
			FornecedorDAO dao = new FornecedorDAO();
			List<Fornecedor> Fornecedores = dao.buscaFornecedores();
			setFornecedores(Fornecedores);
			
			Fornecedor Fornecedor = new Fornecedor();
			setFornecedor(Fornecedor);
			
		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarFornecedor");
		}
	}
	
	private void validaCampos() throws ValidationException { //Valida os campos e aparece um erro na tela caso algum campo não tenha sido preenchido
		
		if (StringUtils.isEmpty(getFornecedor().getNome())) {
			throw new ValidationException("MSG_CampoNomeObrigatorio");
	
		} else if (StringUtils.isEmpty(getFornecedor().getInscricao())) {
				throw new ValidationException("MSG_CampoInscricaoObrigatorio");
			
			}else if (StringUtils.isEmpty(getFornecedor().getEmail())) {
					throw new ValidationException("MSG_CampoEmailObrigatorio");
				
				}else if (StringUtils.isEmpty(getFornecedor().getContato())) {
						throw new ValidationException("MSG_CampoContatoObrigatorio");
						
					}else if (StringUtils.isEmpty(getFornecedor().getTelefone())) {
							throw new ValidationException("MSG_CampoTelefoneObrigatorio");
		
							}else if (StringUtils.isEmpty(getFornecedor().getEndereco())) {
								throw new ValidationException("MSG_CampoEnderecoObrigatorio");
		
								}else if (StringUtils.isEmpty(getFornecedor().getCnpj())) {
								throw new ValidationException("MSG_CampoCnpjObrigatorio");
							}
	}
	
//	GETTERS AND SETTERS
	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void setFornecedores(List<Fornecedor> Fornecedores) {
		this.fornecedores = Fornecedores;
	}

	public Fornecedor getFornecedorSelecionado() {
		return fornecedorSelecionado;
	}

	public void setFornecedorSelecionado(Fornecedor FornecedorSelecionado) {
		this.fornecedorSelecionado = FornecedorSelecionado;
	}
}
