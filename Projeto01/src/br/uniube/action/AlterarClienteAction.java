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

public class AlterarClienteAction extends Action {
	public ActionForward execute(ActionMapping map, ActionForm form,
						HttpServletRequest request, HttpServletResponse response)
						throws Exception {
		System.out.println("Tentando  alterar  um  novo  contato...");
		// formul á rio  de  cliente
		ClienteForm formulario = (ClienteForm) form;
		// acessa  o  bean
		Cliente cliente = formulario.getCliente();
		// adiciona  ao  banco  de  dados usando hibernate
		Session session = new HibernateFactory().getSession();
		ClienteDAO dao = new ClienteDAO(session);
		dao.atualiza(cliente); // alteração -> update
		
		List clientes = dao.buscaClientes();
		session.close();
		request.setAttribute("clientes", clientes);
		// ok.... visualização
		return map.findForward("ok");
	}
}