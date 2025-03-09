package br.uniube.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe que representa o model (entidade Cargo no banco de dados)
 * 
 */
@Entity // Mapeia classe em tabela
@Table(name="tb_cargo")
public class Cargo {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) // Mapeia chave primária ou composta
	private Integer codigo;
	
	@Column(name ="nome", nullable=false,length=150)
	private String nome;
	
	private Boolean ativo;

	// Métodos get e set
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getStatus() { 
        return (getAtivo() ? "Sim" : "Não");
	}

	
}
