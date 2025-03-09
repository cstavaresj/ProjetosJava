/*20. Elabore um código em Java que dada a idade de um nadador classifica-o em uma das seguintes categorias
– infantil A = 5 - 7 anos
– infantil B = 8-10 anos
– juvenil A = 11-13 anos
– juvenil B = 14-17 anos
– adulto = maiores de 18 anos
*/

package br.uniube.ex20;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String args[]){
		int idade;
				
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre com a idade do nadador: ");
		idade = entrada.nextInt();
		
		if (idade<18)
		{
			if (idade>=14)
			{
				System.out.println("A categoria do nadador é Juvenil B!");
			}
			else if (idade>=11)
			{
				System.out.println("A categoria do nadador é Juvenil A!");
			}
				 else if (idade>=8)
					{
						System.out.println("A categoria do nadador é Infantil B!");
					}
				 	   else if (idade>=5)
				 	   		{
				 		   	System.out.println("A categoria do nadador é Infantil A!");
				 	   		}
				 	   		else
				 	   		{
					 		System.out.println("Não existe categoria para o nadador!");
					 	   	}
					
		}
		else
		{
		System.out.println("A categoria do nadador é Adulto!");
	 	   		
		}
		

	}
}