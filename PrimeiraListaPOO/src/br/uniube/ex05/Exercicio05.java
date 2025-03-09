/*5. Crie um programa Java que contenha uma classe chamada Calculadora, que possua
métodos para realizar as 4 operações básicas com números do tipo double. Cada um
dos quatro métodos da classe deve apenas retornar o valor da operação realizada,
recebendo apenas 2 números como parâmetros
*/

package br.uniube.ex05;
//Programa que ler dois números e calcula as operações básicas de soma, subtração, multiplicação e divisão

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String args[]){
	Scanner entrada = new Scanner(System.in); //cria objeto de leitura
	int numero1, numero2, soma, subtracao, multiplicacao;
	double divisao; //o double serve para converter o numero para fracionário
	System.out.println("Entre com o primeiro número:");
	numero1 = entrada.nextInt();
	System.out.println("Entre com o segundo número:");
	numero2 = entrada.nextInt();
	soma = numero1 + numero2;
	subtracao = numero1 - numero2;
	multiplicacao = numero1 * numero2;
	divisao = (double) numero1 / numero2;
	System.out.printf("A Soma é %d\n", soma);
	System.out.printf("A Subtracao é %d\n", subtracao);
	System.out.printf("A Multiplicação é %d\n", multiplicacao);
	System.out.printf("A Divisão é  %f\n", divisao);
}
}