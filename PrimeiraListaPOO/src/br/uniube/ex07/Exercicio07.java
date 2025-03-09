/*7. Escreva um programa Java que calcule o volume da embalagem, a partir da sua
altura, comprimento e largura (volume = comprimento * altura * largura)

*/

package br.uniube.ex07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String args[]){
	Double volume, altura, comprimento, largura;
	
		Scanner entrada = new Scanner (System.in);
	System.out.println("Informe o comprimento: ");
	comprimento = entrada.nextDouble();
	
	Scanner entrada2 = new Scanner (System.in);
	System.out.println("Informe a altura: ");
	altura = entrada2.nextDouble();
	
	Scanner entrada3 = new Scanner (System.in);
	System.out.println("Informe a largura: ");
	largura = entrada3.nextDouble();
	
	volume = comprimento * altura * largura;
	
	System.out.println("O volume da embalagem é: "+ volume);
	
	}
}
