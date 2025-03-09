package br.uniube.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;

import br.uniube.model.Cliente;

/**
 * Classe de acesso ao banco de dados
 * 
 */
public class ClienteDAO {
	private Session session;
	
	public void conecta() {
		session = new HibernateFactory().getSession();
	}
	public void desconecta() throws Exception{
		if (this.session != null)
			this.session.close();
	}
	public void salva (Cliente c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.save(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao cadastrar um cliente. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void salvaOuEdita (Cliente c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			
			this.session.update(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao cadastrar um cliente. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void remove (Cliente c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.delete(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao excluir um cliente. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void atualiza(Cliente c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.update(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao atualizar um cliente. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public Cliente buscaPorId(int codigo) throws Exception {
		conecta();
		Cliente cliente = (Cliente) this.session.load(Cliente.class,codigo);
		desconecta();
		return cliente;
	}
	public List buscaPeloExemplo(Cliente objCliente) throws Exception {
		conecta();
		Criteria crit = session.createCriteria(Cliente.class);
        crit.add(Example.create(objCliente));
        List resultado = crit.list();
        desconecta();
        return resultado;
	}
	public List pesquisar(Cliente objCliente) throws Exception {
		conecta();
		Criteria crit = session.createCriteria(Cliente.class);
		if (objCliente.getNome() != null && !objCliente.getNome().equals(""))
			crit.add(Expression.like("nome",objCliente.getNome() + "%"));
		
		if (objCliente.getCpf() != null && !objCliente.getCpf().equals(""))
			crit.add(Expression.like("cpf",objCliente.getCpf() + "%"));
		
		if (objCliente.getEmail() != null && !objCliente.getEmail().equals(""))
			crit.add(Expression.like("email",objCliente.getEmail() + "%"));
		
		if (objCliente.getTelefone() != null && !objCliente.getTelefone().equals(""))
			crit.add(Expression.like("telefone",objCliente.getTelefone() + "%"));
				
		if (objCliente.getEndereco() != null && !objCliente.getEndereco().equals(""))
			crit.add(Expression.like("endereco",objCliente.getEndereco() + "%"));
		
		List resultado = crit.list();		
		desconecta();
		return resultado;
	}
	public List buscaClientes() throws Exception{
		conecta();
		List lista = this.session.createQuery("from br.uniube.model.Cliente").list();
		desconecta();
		return lista;
	}
	
	
} // fim da classe ClienteDAO
