/*12. Entrar com o nome da capital do Brasil. Se a resposta estiver correta, imprimir PARAB�NS, caso contr�rio, ERROU. 
 * (Considerar: BRAS�LIA ou Bras�lia).
*/

package br.uniube.ex12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String args[]){
	String capital, correta, correta2;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Informe a capital do Brasil: ");
	capital = entrada.next();
	
	correta = "bras�lia";
	correta2 = "BRAS�LIA";
			
	if (capital.equals(correta))
		{
		System.out.println("PARAB�NS!");
		}
	else if(capital.equals(correta2))
	{
	System.out.println("PARAB�NS!");
	}
	else{
		System.out.println("ERROU!");
	}
		
	
	}
}