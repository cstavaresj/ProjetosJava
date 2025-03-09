/*12. Entrar com o nome da capital do Brasil. Se a resposta estiver correta, imprimir PARABÉNS, caso contrário, ERROU. 
 * (Considerar: BRASÍLIA ou Brasília).
*/

package br.uniube.ex12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String args[]){
	String capital, correta, correta2;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Informe a capital do Brasil: ");
	capital = entrada.next();
	
	correta = "brasília";
	correta2 = "BRASÍLIA";
			
	if (capital.equals(correta))
		{
		System.out.println("PARABÉNS!");
		}
	else if(capital.equals(correta2))
	{
	System.out.println("PARABÉNS!");
	}
	else{
		System.out.println("ERROU!");
	}
		
	
	}
}