package br.uniube.model;

import java.io.Serializable;

import javax.persistence.*;

/** * The persistent class for the tb_virus database table. */
@Entity
@Table(name = "tb_virus")
@NamedQuery(name = "Virus.findAll", query = "SELECT a FROM Virus a")
public class Virus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String nome;

	public String tipo;

	private Boolean existe_vacina;

	// bi-directional many-to-one association to Doenca
	@ManyToOne
	@JoinColumn(name = "id_doenca")
	private Doenca tbDoenca;

	public Virus() {
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getExiste_vacina() {
		return existe_vacina;
	}

	public void setExiste_vacina(Boolean existe_vacina) {
		this.existe_vacina = existe_vacina;
	}

	public String getStatus() {
		return (getExiste_vacina() ? "SIM" : "NÃO");
	}

	public Doenca getTbDoenca() {
		return this.tbDoenca;
	}

	public void setTbDoenca(Doenca tbDoenca) {
		this.tbDoenca = tbDoenca;
	}

}