package br.uniube.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Mapeia classe em tabela
@Table(name="tb_fornecedor")
public class Fornecedor {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) // Mapeia chave primária ou composta
	private Integer codigo;
	
	@Column(name ="nome", nullable=false,length=150)
	private String nome;
	
	@Column(name ="cnpj", nullable=false,length=18)
	private String cnpj;
	
	@Column(name ="inscricao", nullable=false,length=15)
	private String inscricao;
	
	@Column(name ="telefone", nullable=false, length=15)
	private String telefone;
	
	@Column(name ="contato", nullable=false,length=150)
	private String contato;
	
	@Column(name ="email", nullable=false)
	private String email;
	
	@Column(name ="endereco", nullable=false, length=100)
	private String endereco;

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
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
