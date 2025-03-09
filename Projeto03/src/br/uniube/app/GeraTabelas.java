package br.uniube.app;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.uniube.model.Cliente;
import br.uniube.model.Fornecedor;

public class GeraTabelas {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration(); // Cria  uma configuração para as classes Cliente e Fornecedor
		cfg.addAnnotatedClass(Cliente.class); // Adiciona a classe Cliente
		cfg.addAnnotatedClass(Fornecedor.class); // Adiciona a classe Fornecedor
		new SchemaExport(cfg).create(true,true);
	}
}
