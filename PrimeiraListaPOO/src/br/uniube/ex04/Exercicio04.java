/* 4. Considere o seguinte código Java:
int i= 5, j, k;
j = --i;
k = j++;
i += 10;
Depois da execução do código, qual será os valores das variáveis i, j e k?
*/


package br.uniube.ex04;

public class Exercicio04 {
	public static void main(String args[])
	{
	//declaração das variáveis
		int i= 5, j, k;
		
		//Processamento: calculos
		j = --i;
		k = j++;
		i += 10;
		
		System.out.println("O valor de i: " + i);
		System.out.println("O valor de j: " + j);
		System.out.println("O valor de k: " + k);
	}
}
