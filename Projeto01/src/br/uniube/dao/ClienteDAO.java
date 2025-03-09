package br.uniube.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.uniube.model.Cliente;

public class ClienteDAO {
	private Session session;
	public ClienteDAO (Session session){
		this.session = session;
	}
	public void salva (Cliente p){
		Transaction tx = session.beginTransaction();
		try {
			this.session.save(p); // gera o insert no banco de dados (hibernate)
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}
	public void remove (Cliente p){
		Transaction tx = session.beginTransaction();
		try {
			this.session.delete(p);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}	
	}
	public Cliente buscaPorId(Long id){
		return (Cliente)this.session.load(Cliente.class,id);
	}
	public void atualiza(Cliente p){
		Transaction tx = session.beginTransaction();
		try {
			this.session.update(p);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}
	public List buscaClientes() {
		// gera um select
		List lista = this.session.createQuery("from br.uniube.model.Cliente").list();
		for(int i=0; i < lista.size();i++) {
			Cliente atual = (Cliente) lista.get(i);
			System.out.println(atual.getNome());
		}
		return lista;
	}
	public List buscaClientesByName(Cliente prod) {
		List lista = this.session.createQuery("from br.uniube.model.Cliente where nome like '" + prod.getNome() + "%'").list();
		
		return lista;
	}

}