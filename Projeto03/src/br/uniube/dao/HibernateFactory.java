package br.uniube.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.uniube.model.Cliente;
import br.uniube.model.Fornecedor;


public class HibernateFactory {
	private static SessionFactory factory;
	
	static {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Cliente.class);
		cfg.addAnnotatedClass(Fornecedor.class);
		factory = cfg.buildSessionFactory();
	}
	public Session getSession() {
		return factory.openSession();
	}
}
