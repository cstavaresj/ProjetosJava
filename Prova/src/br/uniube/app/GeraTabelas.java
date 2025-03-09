package br.uniube.app;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.uniube.model.Virus;
import br.uniube.model.Doenca;

public class GeraTabelas {
	public static void main(String[] args) {
		// Cria  uma configuração para a classe cargo
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		// Adiciona a classe cargo
		cfg.addAnnotatedClass(Doenca.class);
		cfg.addAnnotatedClass(Virus.class);
		new SchemaExport(cfg).create(true,true);
	}
}
