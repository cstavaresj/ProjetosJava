package br.uniube.model;

import java.io.Serializable;
import javax.persistence.*;

/** The persistent class for the tb_doenca database table. */
@Entity
@Table(name = "tb_doenca")
@NamedQuery(name = "Doenca.findAll", query = "SELECT c FROM Doenca c")
public class Doenca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String nome;

	public Doenca() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}