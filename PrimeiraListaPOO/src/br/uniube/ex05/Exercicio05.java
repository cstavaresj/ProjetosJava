/*5. Crie um programa Java que contenha uma classe chamada Calculadora, que possua
m�todos para realizar as 4 opera��es b�sicas com n�meros do tipo double. Cada um
dos quatro m�todos da classe deve apenas retornar o valor da opera��o realizada,
recebendo apenas 2 n�meros como par�metros
*/

package br.uniube.ex05;
//Programa que ler dois n�meros e calcula as opera��es b�sicas de soma, subtra��o, multiplica��o e divis�o

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String args[]){
	Scanner entrada = new Scanner(System.in); //cria objeto de leitura
	int numero1, numero2, soma, subtracao, multiplicacao;
	double divisao; //o double serve para converter o numero para fracion�rio
	System.out.println("Entre com o primeiro n�mero:");
	numero1 = entrada.nextInt();
	System.out.println("Entre com o segundo n�mero:");
	numero2 = entrada.nextInt();
	soma = numero1 + numero2;
	subtracao = numero1 - numero2;
	multiplicacao = numero1 * numero2;
	divisao = (double) numero1 / numero2;
	System.out.printf("A Soma � %d\n", soma);
	System.out.printf("A Subtracao � %d\n", subtracao);
	System.out.printf("A Multiplica��o � %d\n", multiplicacao);
	System.out.printf("A Divis�o �  %f\n", divisao);
}
}