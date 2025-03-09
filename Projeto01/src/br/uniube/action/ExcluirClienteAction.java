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

public class ExcluirClienteAction extends Action {
	public ActionForward execute(ActionMapping map, ActionForm form,
						HttpServletRequest request, HttpServletResponse response)
						throws Exception {
		System.out.println("Tentando  excluir  um  novo  contato...");
		
		String id = request.getParameter("id");
		
		if (id != null) {
			// adiciona  ao  banco  de  dados usando hibernate
			Session session = new HibernateFactory().getSession();
			ClienteDAO dao = new ClienteDAO(session);
			Cliente cliente = dao.buscaPorId(new Long(id));
			dao.remove(cliente); // é realizada a remoção do cliente
			
			List clientes = dao.buscaClientes();
			session.close();
			request.setAttribute("clientes", clientes);
			// ok.... visualização
			return map.findForward("ok");
		} else {
			return map.findForward("erro");
		}
	}
}