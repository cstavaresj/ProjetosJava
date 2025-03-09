/*13. Crie um programa que leia 3 valores (0 ou 1) e que apresente as saídas de acordo
 com a tabela.
*/

package br.uniube.ex13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String args[]){
	int num1, num2, num3;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Informe a primeira entrada (0 ou 1): ");
	num1 = entrada.nextInt();
	
	Scanner entrada2 = new Scanner (System.in);
	System.out.println("Informe a segunda entrada (0 ou 1): ");
	num2 = entrada2.nextInt();
	
	Scanner entrada3 = new Scanner (System.in);
	System.out.println("Informe a terceira entrada (0 ou 1): ");
	num3 = entrada3.nextInt();
	
	
	if (num1 == 0)
	{
		if (num2 == 0)
		{
			if (num3 == 0)
			{
			System.out.println("Nenhum");
			}
			else
			{
			System.out.println("Direita");
			}
		}
		else
		{
			if (num3 == 0)
			{
			System.out.println("Centro");
			}
			else
			{
			System.out.println("Centro-direita");
			}
		}
	}
	else
	{
		if (num2 == 0)
		{
			if (num3 == 0)
			{
			System.out.println("Esquerda");
			}
			else
			{
			System.out.println("Esquerda-direita");
			}
		}
		else
		{
			if (num3 == 0)
			{
			System.out.println("Centro-esquerda");
			}
		}
	}
	
	}
}