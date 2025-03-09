package br.uniube.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.uniube.model.Cliente;

public class TesteDeConfiguracao {
	public static void main(String[] args) {
		/// Cria  uma configuração para a classe Cliente
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Cliente.class);
		SessionFactory factory = cfg.buildSessionFactory();
		// Cria a sessão
		Session session = factory.openSession();
		// Fecha a sessão
		session.close();
		factory.close();

	}
}