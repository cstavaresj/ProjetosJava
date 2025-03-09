package br.uniube.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;

import br.uniube.model.Doenca;

/** * Classe de acesso ao banco de dados */
public class DoencaDAO {
	private Session session;
	
	public void conecta() {
		session = new HibernateFactory().getSession();
	}
	public void desconecta() throws Exception{
		if (this.session != null)
			this.session.close();
	}
	public void salva (Doenca c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.save(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao cadastrar um Doenca. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void salvaOuEdita (Doenca c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			
			this.session.saveOrUpdate(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao cadastrar um Doenca. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void remove (Doenca c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.delete(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao excluir um Doenca. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void atualiza(Doenca c) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.update(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao atualizar um Doenca. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public Doenca buscaPorId(int codigo) throws Exception {
		conecta();
		Doenca Doenca = (Doenca) this.session.load(Doenca.class,codigo);
		desconecta();
		return Doenca;
	}
	public List buscaPeloExemplo(Doenca objDoenca) throws Exception {
		conecta();
		Criteria crit = session.createCriteria(Doenca.class);
        crit.add(Example.create(objDoenca));
        List resultado = crit.list();
        desconecta();
        return resultado;
	}
	public List pesquisar(Doenca objDoenca) throws Exception {
		conecta();
		Criteria crit = session.createCriteria(Doenca.class);
		if (objDoenca.getNome() != null && !objDoenca.getNome().equals(""))
			crit.add(Expression.like("nome",objDoenca.getNome() + "%"));
		
		
		List resultado = crit.list();
		desconecta();
		return resultado;
	}
	public List buscaDoencas() throws Exception{
		conecta();
		List lista = this.session.createQuery("from br.uniube.model.Doenca").list();
		desconecta();
		return lista;
	}	
	
} // fim da classe DoencaDAO
