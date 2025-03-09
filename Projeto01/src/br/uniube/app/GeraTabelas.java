package br.uniube.app;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.uniube.model.Cliente;

public class GeraTabelas {
	public static void main(String[] args) {
		// Cria  uma configuração para a classe Cliente
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Cliente.class);
		// Cria tabela
		new SchemaExport(cfg).create(true,true);
	}

}
