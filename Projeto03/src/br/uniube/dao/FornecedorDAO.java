package br.uniube.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;

import br.uniube.model.Fornecedor;

/**
 * Classe de acesso ao banco de dados
 * 
 */
public class FornecedorDAO {
	private Session session;
	
	public void conecta() {
		session = new HibernateFactory().getSession();
	}
	public void desconecta() throws Exception{
		if (this.session != null)
			this.session.close();
	}
	public void salva (Fornecedor f) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.save(f);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao cadastrar um fornecedor. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void salvaOuEdita (Fornecedor f) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			
			this.session.update(f);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao cadastrar um fornecedor. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void remove (Fornecedor f) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.delete(f);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao excluir um fornecedor. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public void atualiza(Fornecedor f) throws Exception{
		conecta();
		Transaction tx = session.beginTransaction();
		try {
			this.session.update(f);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new Exception("Erro ao atualizar um fornecedor. Descrição:" + e.getMessage());
		} finally {
			desconecta();
		}
	}
	public Fornecedor buscaPorId(int codigo) throws Exception {
		conecta();
		Fornecedor fornecedor = (Fornecedor) this.session.load(Fornecedor.class,codigo);
		desconecta();
		return fornecedor;
	}
	public List buscaPeloExemplo(Fornecedor objFornecedor) throws Exception {
		conecta();
		Criteria crit = session.createCriteria(Fornecedor.class);
        crit.add(Example.create(objFornecedor));
        List resultado = crit.list();
        desconecta();
        return resultado;
	}
	public List pesquisar(Fornecedor objFornecedor) throws Exception {
		conecta();
		Criteria crit = session.createCriteria(Fornecedor.class);
		if (objFornecedor.getNome() != null && !objFornecedor.getNome().equals(""))
			crit.add(Expression.like("nome",objFornecedor.getNome() + "%"));
		
		if (objFornecedor.getCnpj() != null && !objFornecedor.getCnpj().equals(""))
			crit.add(Expression.like("cnpj",objFornecedor.getCnpj() + "%"));
		
		if (objFornecedor.getInscricao() != null && !objFornecedor.getInscricao().equals(""))
			crit.add(Expression.like("inscricao",objFornecedor.getInscricao() + "%"));
		
		if (objFornecedor.getEmail() != null && !objFornecedor.getEmail().equals(""))
			crit.add(Expression.like("email",objFornecedor.getEmail() + "%"));
		
		if (objFornecedor.getTelefone() != null && !objFornecedor.getTelefone().equals(""))
			crit.add(Expression.like("telefone",objFornecedor.getTelefone() + "%"));
		
		if (objFornecedor.getContato() != null && !objFornecedor.getContato().equals(""))
			crit.add(Expression.like("contato",objFornecedor.getContato() + "%"));
				
		if (objFornecedor.getEndereco() != null && !objFornecedor.getEndereco().equals(""))
			crit.add(Expression.like("endereco",objFornecedor.getEndereco() + "%"));
		
		List resultado = crit.list();		
		desconecta();
		return resultado;
	}
	public List buscaFornecedores() throws Exception{
		conecta();
		List lista = this.session.createQuery("from br.uniube.model.Fornecedor").list();
		desconecta();
		return lista;
	}
	
	
} // fim da classe FornecedorDAO
