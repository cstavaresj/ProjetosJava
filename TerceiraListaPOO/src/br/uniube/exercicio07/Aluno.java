package br.uniube.exercicio07;

public class Aluno {
	private String nome;
	private int matricula;
	private double nota;
	// get e set 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nota ==0 )
		{
			System.out.println("A Nota nao pode ser zero.");
		}else {
			this.nome = nome;	
		}
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	//construtor
	
	public Aluno(String nome, int matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
	
}
