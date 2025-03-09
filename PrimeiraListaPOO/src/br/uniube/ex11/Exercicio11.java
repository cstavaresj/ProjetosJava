/*11. Faça um programa Java que calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor 
 da despesa de um cliente.
*/

package br.uniube.ex11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String args[]){
	Double comissao, despesa;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Informe a despesa do cliente: ");
	despesa = entrada.nextDouble();
	
	comissao = (despesa * 10)/100;
	
	System.out.println("A comissao do garçon é: "+ comissao);
	
	}
}
