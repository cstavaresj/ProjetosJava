package br.uniube.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;

import br.uniube.dao.HibernateFactory;
import br.uniube.dao.ClienteDAO;
import br.uniube.form.ClienteForm;
import br.uniube.model.Cliente;

public class ListaClientesAction extends Action {
	
	public ActionForward execute(ActionMapping map, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		ClienteForm formulario = (ClienteForm) form;
		// acessa  o  bean
		Cliente cliente = formulario.getCliente();
		
		// pesquisa  no  banco  de  dados  a  lista  completa
		Session session = new HibernateFactory().getSession();
		ClienteDAO dao = new ClienteDAO(session);
		List lista = dao.buscaClientesByName(cliente);
		request.setAttribute("clientes",lista);
		// redireciona
		return map.findForward("lista");
	}
}