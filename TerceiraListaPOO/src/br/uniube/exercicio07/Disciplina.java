package br.uniube.exercicio07;

import java.util.Scanner;
import java.util.ArrayList;

public class Disciplina {
	// atributos
	private int codigo;
	private String nome;
	private ArrayList<Aluno> listaAlunos;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

	public Disciplina() {
		this.codigo = 0;
		this.nome = null;
		this.listaAlunos = new ArrayList<Aluno>();
	}

	// metedo para inserir aluno
	public void inserirAluno() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome do aluno: ");
		String nome = entrada.next();
		System.out.println("Matricula:");
		int matricula = entrada.nextInt();
		System.out.println("Nota: ");
		double nota = entrada.nextDouble();
		// criar objeto aluno
		Aluno objAluno = new Aluno(nome, matricula, nota);
		// cadastrar (inserir) na lista
		listaAlunos.add(objAluno);
	}

	// metodo para remover um aluno pela matricula
	public boolean removerAluno(int matricula) {
		boolean achou = false;
		for (int i = 0; i < listaAlunos.size(); i++) {
			Aluno objAluno = (Aluno) listaAlunos.get(i);
			if (matricula == objAluno.getMatricula()) {
				listaAlunos.remove(objAluno);
				achou = true;
				break;

			}
		}
		if (achou == true) {
			System.out.println("Aluno removido com sucesso.");
		} else {
			System.out.println("Aluno nâo encontrado.");
		}
		return achou;
	}

	public boolean alterarAluno(int mat, double novaNota) {
		boolean achou = false;
		for (int i = 0; i < listaAlunos.size(); i++) {
			Aluno a = (Aluno) listaAlunos.get(i);
			if (a.getMatricula() == mat) {
				a.setNota(novaNota);
				achou = true;
				break;
			}
		}
		if (listaAlunos.size() == 0) 
		{
			System.out.println("Não existe alunos na disciplina");
		}
		return achou;
	}

	// metodo para calcular a media das notas dos alunos
	public double calculaMedia() {
		double media, soma = 0;
		for (int i = 0; i < listaAlunos.size(); i++) {
			Aluno a = (Aluno) listaAlunos.get(i);
			soma = soma + a.getNota();

		}
		media = soma / listaAlunos.size();
		return media;
	}

	// método para consultar alunos
	public void consultarAlunos() {

		
		for (int i = 0; i < listaAlunos.size(); i++) {
			Aluno a = (Aluno) listaAlunos.get(i);
			System.out.println("ALUNO " + (i+1));
			System.out.println(" Matricula: " + a.getMatricula());			
			System.out.println(" Nome: " + a.getNome());
			System.out.println(" Nota: " + a.getNota());
		}
		
		if (listaAlunos.size() == 0) 
		{
			System.out.println("Não existe alunos na disciplina");
		}

	}
}
