package br.uniube.app;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.uniube.model.Cargo;

public class GeraTabelas {
	public static void main(String[] args) {
		//�Cria �uma configura��o para a classe cargo
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		// Adiciona a classe cargo
		cfg.addAnnotatedClass(Cargo.class);
		new SchemaExport(cfg).create(true,true);
	}
}
