package br.uniube.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;

import br.uniube.model.Virus;

/** * Classe de acesso ao banco de dados */
public class VirusDAO {
	private Session session;

	public void conecta() {
		session = new HibernateFactory().getSession();
	}

	public void desconecta() throws Exception {
		if (this.session != null)
			this.session.close();
	}

	public void salva(Virus c) throws Exception {
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.save(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao cadastrar um virus. Descrição:"
					+ e.getMessage());
		} finally {
			desconecta();
		}
	}

	public void salvaOuEdita(Virus c) throws Exception {
		conecta();
		Transaction tx = session.beginTransaction();
		try {

			this.session.saveOrUpdate(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao cadastrar um virus. Descrição:"
					+ e.getMessage());
		} finally {
			desconecta();
		}
	}

	public void remove(Virus c) throws Exception {
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.delete(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao excluir um virus. Descrição:"
					+ e.getMessage());
		} finally {
			desconecta();
		}
	}

	public void atualiza(Virus c) throws Exception {
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.update(c);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao atualizar um virus. Descrição:"
					+ e.getMessage());
		} finally {
			desconecta();
		}
	}

	public Virus buscaPorId(int codigo) throws Exception {
		conecta();
		Virus virus = (Virus) this.session.load(Virus.class, codigo);
		desconecta();
		return virus;
	}

	public List buscaPeloExemplo(Virus objVirus) throws Exception {
		conecta();
		Criteria crit = session.createCriteria(Virus.class);
		crit.add(Example.create(objVirus));
		List resultado = crit.list();
		desconecta();
		return resultado;
	}

	public List pesquisar(Virus objVirus) throws Exception {
		conecta();
		Criteria crit = session.createCriteria(Virus.class);
		if (objVirus.getNome() != null && !objVirus.getNome().equals(""))
			crit.add(Expression.like("nome", objVirus.getNome() + "%"));
		if (objVirus.getTbDoenca().getId() != 0)
			crit.add(Expression.eq("tbDoenca.id", objVirus.getTbDoenca()
					.getId()));
		List resultado = crit.list();
		desconecta();
		return resultado;
	}

	public List buscaViruss() throws Exception {
		conecta();
		List lista = this.session.createQuery("from br.uniube.model.Virus")
				.list();
		desconecta();
		return lista;
	}

} // fim da classe VirusDAO
