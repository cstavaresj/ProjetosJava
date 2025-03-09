package br.uniube.exercicio01;

import java.util.Scanner;
import java.util.ArrayList;

public class Curso {
	private String nomeCurso;
	private ArrayList<Nota>listaNotas;
	
	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public ArrayList<Nota> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(ArrayList<Nota> listaNotas) {
		this.listaNotas = listaNotas;
	}
	
	public Curso() {
		this.nomeCurso = null;
		this.listaNotas = new ArrayList<Nota>();
	}
	
	// metedo para inserir nota
		public void inserirNota() {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Nota: ");
			double nota = entrada.nextDouble();
			// criar objeto nota
			Nota objNota = new Nota(nota);
			// cadastrar (inserir) na lista
			listaNotas.add(objNota);
		}
	
		// método para consultar notas
		public void consultarNotas() {

			for (int i = 0; i < listaNotas.size(); i++) {
				Nota a = (Nota) listaNotas.get(i);
				System.out.println("Notas: " + a.getNota());
			}
			
			if (listaNotas.size() == 0) 
			{
				System.out.println("Não existe notas no curso!");
			}

		}
		
	// metodo para calcular a media das notas
		public double calculaMedia() {
			double media, soma = 0;
			for (int i = 0; i < listaNotas.size(); i++) {
				Nota a = (Nota) listaNotas.get(i);
				soma = soma + a.getNota();

			}
			media = soma / listaNotas.size();
			return media;
		}
		
		// metodo para calcular a maior nota
				public double calculaMaior() {
					double maior = 0;
					for (int i = 0; i < listaNotas.size(); i++) {
						Nota a = (Nota) listaNotas.get(i);
						 if(a.getNota() > maior)  
		                   {   
		                   maior = a.getNota();    
		                   }    
		           
					}
					return maior;
				}
}
