/*19. Crie um programa para simular uma urna de vota��o para exatamente 3 candidatos.
 Logo no in�cio deve-se perguntar ao usu�rio os nomes dos candidatos. Permita votos em branco.
 Ao t�rmino de toda a entrada, apresente o nome, a quantidade de votos e o percentual de cada 
 candidato. Apresente tamb�m a quantidade e o percentual dos votos em branco e quem foi o 
 ganhador da elei��o.
*/

package br.uniube.ex19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String args[]){
		String cand1, cand2, cand3;
		int voto, totalcand1=0, totalcand2=0, totalcand3=0, totalbranco=0;
		double total=0, percentual1=0, percentual2=0, percentual3=0, percentualbranco=0;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre com o primeiro candidato: ");
		cand1 = entrada.next();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Entre com o segundo candidato: ");
		cand2 = entrada2.next();
		
		Scanner entrada3 = new Scanner (System.in);
		System.out.println("Entre com o terceiro candidato: ");
		cand3 = entrada.next();
		
		Scanner entrada4 = new Scanner (System.in);
		System.out.println("Vote em uma op��o: \n 01 - "+cand1+"\n 02 - "+cand2+"\n 03 - "+cand3+"\n 00 - Voto em branco \n Para encerrar a vota��o digite 11");
		voto = entrada4.nextInt();
		
		while (voto!=11)
		{
								
			if (voto == 01)
			{
			totalcand1 = totalcand1 +1;
			}
			else if (voto == 02)
				 {
				totalcand2 = totalcand2 +1;
				 }
				 else if (voto == 03)
				 	  {
					  totalcand3 = totalcand3 +1;
				 	  }
				 	  else
				 	  {
				 	  totalbranco = totalbranco +1;
				 	  }
			Scanner entrada5 = new Scanner (System.in);
			System.out.println("Vote em uma op��o: \n 01 - "+cand1+"\n 02 - "+cand2+"\n 03 - "+cand3+"\n 00 - Voto em branco \n Para encerrar a vota��o digite 11");
			voto = entrada5.nextInt();
			
			total = totalcand1 + totalcand2 + totalcand3 +  totalbranco;
			percentual1 = ((totalcand1 * 100)/total);
			percentual2 = ((totalcand2 * 100)/total);
			percentual3 = ((totalcand3 * 100)/total);
			percentualbranco = ((totalbranco * 100)/total);
			
		}
		System.out.println("Vota��o encerrada! \n\n Total de votos:");
		System.out.println(cand1+": "+totalcand1+" votos "+percentual1+" %");
		System.out.println(cand2+": "+totalcand2+" votos "+percentual2+" %");
		System.out.println(cand3+": "+totalcand3+" votos "+percentual3+" %");
		System.out.println("Votos em branco: "+totalbranco+" votos "+percentualbranco+" %");
		
		if (percentual1>percentual2)
		{
			if (percentual1>percentual3)
			{
				System.out.println("O vencedor da vota��o foi o candidato "+cand1);	
			}
			else
			{
				System.out.println("O vencedor da vota��o foi o candidato "+cand3);	
			}
		}
		else
		{
			System.out.println("O vencedor da vota��o foi o candidato "+cand2);
		}
		
	}
}	