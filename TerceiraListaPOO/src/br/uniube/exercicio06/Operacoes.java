package br.uniube.exercicio06;

import java.util.ArrayList;
import java.util.Scanner;

import br.uniube.exercicio01.Nota;

public class Operacoes {
	
		    private int valor1, valor2;
		       
	        public double getValor1()
	        {
	                return valor1;
	        }
	        
	        public void setValor1(int valor1)
	        {
	               this.valor1 = valor1;
	        }
	        
	        public double getValor2()
	        {
	                return valor2;
	        }
	        
	        public void setValor2(int valor2)
	        {
	               this.valor2 = valor2;
	        }
	        
	     public int calculaSoma() {
	    	 	int soma = valor1 + valor2;
	    	 	System.out.println("A soma �: "+soma);
	    	 	return soma;
			}
	     
	     public int calculaSubtracao() {
	    	 	int subtracao = valor1 - valor2;
	    	 	System.out.println("A subtracao �: "+subtracao);
				return subtracao;
			}

	     public int calculaMultiplicacao() {
	    	 	int multiplicacao = valor1 * valor2;
	    	 	System.out.println("A multiplicacao �: "+multiplicacao);
				return multiplicacao;
			}
	     public double calculaDivisao() {
	    	 	double divisao = valor1 / valor2;
	    	 	System.out.println("A divisao �: "+divisao);
				return divisao;
			}
	}
