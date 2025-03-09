package br.uniube.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity // Mapeia classe em tabela
@Table(name="tb_cliente")
public class Cliente {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) // Mapeia chave primária ou composta
	private Integer codigo;
	
	@Column(name ="nome", nullable=false,length=150)
	private String nome;
	
	private Boolean sexo;
	
	@Column(name ="nascimento", nullable=false, length=10)
	private Date nascimento;
	
	@Column(name ="cpf", nullable=false,length=14)
	private String cpf;
	
	@Column(name ="telefone", nullable=false, length=15)
	private String telefone;
	
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

	public Boolean getSexo() {
		return sexo;
	}

	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}
	public String getStatus() { 
        return (getSexo() ? "Masculino" : "Feminino");
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
