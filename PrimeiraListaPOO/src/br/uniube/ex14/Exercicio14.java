/*14. Verifique quem entre duas pessoas faz anivers�rio primeiro. Exiba o nome do primeiro 
aniversariante considerando que estamos no dia 1 de janeiro. Use como entrada o nome, 
o dia e o m�s de nascimento de cada pessoa.
*/

package br.uniube.ex14;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String args[]){
		int mes1, mes2, dia, dia2;
       String nome1, nome2;
        
   Scanner entrada = new Scanner (System.in);
	System.out.println("Informe o nome da primeira pessoa: ");
	nome1 = entrada.next();
	
	Scanner entrada2 = new Scanner (System.in);
	System.out.println("Informe o dia de anivers�rio da primeira pessoa: ");
	dia = entrada2.nextInt();
	
	Scanner entrada3 = new Scanner (System.in);
	System.out.println("Informe o m�s de anivers�rio da primeira pessoa: ");
	mes1 = entrada3.nextInt();
	
	Scanner entrada4 = new Scanner (System.in);
	System.out.println("Informe o nome da segunda pessoa: ");
	nome2 = entrada4.next();
	
	Scanner entrada5 = new Scanner (System.in);
	System.out.println("Informe o dia de anivers�rio da segunda pessoa: ");
	dia2 = entrada5.nextInt();
	
	Scanner entrada6 = new Scanner (System.in);
	System.out.println("Informe o m�s de anivers�rio da segunda pessoa: ");
	mes2 = entrada6.nextInt();
	
	
	if (mes1 < mes2)
	{
		System.out.println("Quem faz anivers�rio primeiro �: "+nome1);
	}
	else if (mes1 > mes2)
	{
		System.out.println("Quem faz anivers�rio primeiro �: "+nome2);
	}
		else if (dia < dia2) 
		{
		System.out.println("Quem faz anivers�rio primeiro �: "+nome1);
		}
			else if (dia > dia2) 
			{
			System.out.println("Quem faz anivers�rio primeiro �: "+nome2);
			}
				else
				{
				System.out.print("O "+nome1+" e o "+nome2+" fazem anivers�rio no mesmo dia.");
				}
	}
}