//9. Escreva um programa Java que receba três números reais e mostre a média aritmética

package br.uniube.ex09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String args[]){
	Double media, n1, n2, n3;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Informe o primeiro numero: ");
	n1 = entrada.nextDouble();
	
	Scanner entrada2 = new Scanner (System.in);
	System.out.println("Informe o segundo numero: ");
	n2 = entrada2.nextDouble();
	
	Scanner entrada3 = new Scanner (System.in);
	System.out.println("Informe o terceiro numero: ");
	n3 = entrada3.nextDouble();
	
	media = (n1 + n2 + n3) /3;
	
	System.out.println("A média é: "+ media);
	
	}
}
