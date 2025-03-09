package br.uniube.exercicio03;

import java.util.Scanner;
import java.util.ArrayList;

public class Produto {
	private String nome, codigo;
	private ArrayList<Preco>listaPrecos;
	private double preco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public ArrayList<Preco> getListaPrecos() {
		return listaPrecos;
	}

	public void setListaPrecos(ArrayList<Preco> listaPrecos) {
		this.listaPrecos = listaPrecos;
	}
	
	public Produto() {
		this.nome = null;
		this.codigo = null;
		this.listaPrecos = new ArrayList<Preco>();
	}
	
	// metedo para inserir precos
		public void inserirPreco() {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Preço: ");
			double preco = entrada.nextDouble();
			// criar objeto nota
			Preco objPreco = new Preco(preco);
			// cadastrar (inserir) na lista
			listaPrecos.add(objPreco);
		}
	
		
		
	// metodo para calcular a media dos precos
		public double calculaMedia() {
			double media, soma = 0;
			for (int i = 0; i < listaPrecos.size(); i++) {
				Preco a = (Preco) listaPrecos.get(i);
				soma = soma + a.getPreco();

			}
			media = soma / listaPrecos.size();
			return media;
		}
		
		// metodo para calcular a maior preco
				public double calculaMaior() {
					double maior = 0;
					for (int i = 0; i < listaPrecos.size(); i++) {
						Preco a = (Preco) listaPrecos.get(i);
						 if(a.getPreco() > maior)  
		                   {   
		                   maior = a.getPreco();    
		                   }    
		           
					}
					return maior;
				}
				
		// metodo para calcular a maior preco
				public double calculaMenor() {
				double menor = 9999;
				for (int i = 0; i < listaPrecos.size(); i++) {
					Preco b = (Preco) listaPrecos.get(i);
					 if(b.getPreco() < menor)  
		                {   
		                 menor = b.getPreco();    
		                }    
		           
					}
					return menor;
				}
}
