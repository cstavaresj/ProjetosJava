/*18. O fatorial de um n�mero � calculado multiplicando-se os valores de um at� o valor 
 especificado. Um n�mero fatorial � representado pelo n�mero do fatorial seguido de um 
 ponto de exclama��o. Por exemplo, o fatorial de 4 � representado por 4! e � igual 
 a: 1 x 2 x 3 x 4 = 24. Fa�a um programa Java que calcule o fatorial de um n�mero.
*/

package br.uniube.ex18;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String args[]){
		int numero, fat=1, cont=1;
		        
		 do
		 {
			Scanner entrada = new Scanner (System.in);
			System.out.println("Entre com um n�mero: ");
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