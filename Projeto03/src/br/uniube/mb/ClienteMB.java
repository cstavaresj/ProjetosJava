package br.uniube.mb;

import java.util.List;
import javax.xml.bind.ValidationException;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import br.uniube.dao.ClienteDAO;
import br.uniube.model.Cliente;

public class ClienteMB extends GenericoMB {

	private static final long serialVersionUID = 8681338268167191368L;

	private Cliente cliente = new Cliente();
	private Cliente clienteSelecionado;
	private List<Cliente> clientes; // arraylist da consulta
	
	public ClienteMB() {
		setLogger(Logger.getLogger(ClienteMB.class));
		setBundle(super.getBundle("bundle.Idioma"));
		novo();
	}
	
	public void novo() { //Limpa os campos para criar um novo Cliente
		limpaCampos();	
	}
	
	public void salvar() { //Salva um novo Cliente com os dados inseridos no formulário
		try {
			validaCampos();
			// chama o DAO para para fazer a inserção
			if (getCliente().getCodigo() == 0) getCliente().setCodigo(null); 
			ClienteDAO dao = new ClienteDAO();
			dao.salva(getCliente());
			limpaCampos();
			msgSuccess("MSG_ClienteCadastrado");
			
		} catch (ValidationException e) {
			msgError(e.getMessage());
		} catch (Exception e) {
			msgError("MSG_FalhaAoCadastrarCliente");
		}	
	}
	
	public void salvaOuEdita() { //Usado para salvar uma alteração feita após editar os dados de um Cliente
		try {
			validaCampos();
			// chama o DAO para para fazer a inserção
			if (getCliente().getCodigo() == 0) getCliente().setCodigo(null); 
			ClienteDAO dao = new ClienteDAO();
			dao.salvaOuEdita(getCliente());
			limpaCampos();
			msgSuccess("MSG_ClienteCadastrado");
			
		} catch (ValidationException e) {
			msgError(e.getMessage());
		} catch (Exception e) {
			msgError("MSG_FalhaAoCadastrarCliente");
		}
	}
	
	public void pesquisar() { //Pesquisa os Clientes de acordo com os campos preenchidos
		try {
			ClienteDAO dao = new ClienteDAO();
			List<Cliente> listaClientes = dao.pesquisar(getCliente());
			setClientes(listaClientes);
			msgInfo("MSG_XClientesEncontrados", listaClientes.size());
			
		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarCliente");
		}
	}
	
	public void remover() { //Usado para excuir do banco de dados o Cliente selecionado
		try {
			if (getClienteSelecionado() != null) { 
				// chama o DAO para para fazer a exclusão
				ClienteDAO dao = new ClienteDAO();
				Cliente clienteEncontrado = dao.buscaPorId(getClienteSelecionado().getCodigo());
				dao.remove(clienteEncontrado);
				setClientes(dao.buscaClientes());
				msgInfo("MSG_ClienteRemovido");
			} else {
				msgError("MSG_NenhumClienteSelecionado");
			}
			
		} catch (Exception e) {
			msgError("MSG_FalhaAoRemoverCliente");
		}
	}
	
	
	public void exibirParaEdicao() {  //Usado para aparecer no formulário os dados para edição do Cliente selecionado
		if (getClienteSelecionado() != null) {	
			setCliente(getClienteSelecionado());
		} else {
			msgError("MSG_NenhumClienteSelecionado");
		}	
	}

	private void limpaCampos() { //Limpa os campos do formulário
		try {
			ClienteDAO dao = new ClienteDAO();
			List<Cliente> Clientes = dao.buscaClientes();
			setClientes(Clientes);
			
			Cliente Cliente = new Cliente();
			Cliente.setSexo(true);
			setCliente(Cliente);
			
		} catch (Exception e) {
			msgError("MSG_FalhaAoConsultarCliente");
		}
	}
	
	private void validaCampos() throws ValidationException { //Valida os campos e aparece um erro na tela caso algum campo não tenha sido preenchido
		
		if (StringUtils.isEmpty(getCliente().getNome())) {
			throw new ValidationException("MSG_CampoNomeObrigatorio");
	
		} else if (getCliente().getSexo() == null) {		
				throw new ValidationException("MSG_CampoSexoObrigatorio");
			
			}else if (getCliente().getNascimento() == null) {
					throw new ValidationException("MSG_CampoNascimentoObrigatorio");
			
				}else if (StringUtils.isEmpty(getCliente().getEmail())) {
					throw new ValidationException("MSG_CampoEmailObrigatorio");
				
					}else if (StringUtils.isEmpty(getCliente().getTelefone())) {
						throw new ValidationException("MSG_CampoTelefoneObrigatorio");
		
						}else if (StringUtils.isEmpty(getCliente().getEndereco())) {
							throw new ValidationException("MSG_CampoEnderecoObrigatorio");
		
							}else if (StringUtils.isEmpty(getCliente().getCpf())) {
								throw new ValidationException("MSG_CampoCpfObrigatorio");
							}
	}
	
//	GETTERS AND SETTERS
	public List<Cliente> getClientes() {
		return clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setClientes(List<Cliente> Clientes) {
		this.clientes = Clientes;
	}

	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(Cliente ClienteSelecionado) {
		this.clienteSelecionado = ClienteSelecionado;
	}
}
