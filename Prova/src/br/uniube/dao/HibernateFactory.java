package br.uniube.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.uniube.model.Virus;
import br.uniube.model.Doenca;

public class HibernateFactory {
	private static SessionFactory factory;

	static {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Virus.class);
		cfg.addAnnotatedClass(Doenca.class);
		factory = cfg.buildSessionFactory();
	}

	public Session getSession() {
		return factory.openSession();
	}
}
