package br.uniube.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.uniube.model.Cliente;

public class ClienteForm extends ActionForm {
	// model
	private Cliente cliente = new Cliente();
	
	public  Cliente getCliente() {
		return this.cliente;
	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {	
	}

}