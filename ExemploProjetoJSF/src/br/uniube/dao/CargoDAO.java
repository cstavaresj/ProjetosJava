package br.uniube.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;

import br.uniube.model.Cargo;

/**
 * Classe de acesso ao banco de dados
 * 
 */
public class CargoDAO {
	private Session session;
	
	public void conecta() {
		session = new HibernateFactory().getSession();
	}
	public void desconecta() throws Exception{
		if (this.session != null)
			this.session.close();
	}
	public void salva (Cargo c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.save(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao cadastrar um cargo. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void salvaOuEdita (Cargo c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			
			this.session.saveOrUpdate(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao cadastrar um cargo. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void remove (Cargo c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.delete(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao excluir um cargo. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void atualiza(Cargo c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.update(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao atualizar um cargo. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public Cargo buscaPorId(int codigo) throws Exception {
		conecta();
		Cargo cargo = (Cargo) this.session.load(Cargo.class,codigo);
		desconecta();
		return cargo;
	}
	public List buscaPeloExemplo(Cargo objCargo) throws Exception {
		conecta();
		Criteria crit = session.createCriteria(Cargo.class);
        crit.add(Example.create(objCargo));
        List resultado = crit.list();
        desconecta();
        return resultado;
	}
	public List pesquisar(Cargo objCargo) throws Exception {
		conecta();
		Criteria crit = session.createCriteria(Cargo.class);
		if (objCargo.getNome() != null && !objCargo.getNome().equals(""))
			crit.add(Expression.like("nome",objCargo.getNome() + "%"));
		if (objCargo.getAtivo() != null)
			crit.add(Expression.eq("ativo", objCargo.getAtivo()));
		List resultado = crit.list();		
		desconecta();
		return resultado;
	}
	public List buscaCargos() throws Exception{
		conecta();
		List lista = this.session.createQuery("from br.uniube.model.Cargo").list();
		desconecta();
		return lista;
	}
	
	
} // fim da classe CargoDAO
