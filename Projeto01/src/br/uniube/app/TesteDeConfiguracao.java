package br.uniube.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.uniube.model.Cliente;

public class TesteDeConfiguracao {
	public static void main(String[] args) {
		///�Cria �uma configura��o para a classe Cliente
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Cliente.class);
		SessionFactory factory = cfg.buildSessionFactory();
		// Cria a sess�o
		Session session = factory.openSession();
		// Fecha a sess�o
		session.close();
		factory.close();

	}
}