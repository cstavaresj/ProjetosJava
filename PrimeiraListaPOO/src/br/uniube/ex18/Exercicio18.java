/*18. O fatorial de um número é calculado multiplicando-se os valores de um até o valor 
 especificado. Um número fatorial é representado pelo número do fatorial seguido de um 
 ponto de exclamação. Por exemplo, o fatorial de 4 é representado por 4! e é igual 
 a: 1 x 2 x 3 x 4 = 24. Faça um programa Java que calcule o fatorial de um número.
*/

package br.uniube.ex18;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String args[]){
		int numero, fat=1, cont=1;
		        
		 do
		 {
			Scanner entrada = new Scanner (System.in);
			System.out.println("Entre com um número: ");
			numero = entrada.nextInt();
		 
		 for(int i = 1;i <= numero; i++)
		 {
		 fat = fat * i;
		 }
		 System.out.println("!" + numero + " = " + fat);
		 cont++;
		 }
		 while(cont < 2);
	}
} 