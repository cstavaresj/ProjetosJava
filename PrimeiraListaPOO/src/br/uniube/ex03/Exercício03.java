/*3. Um cabeleireiro corta X cabelos por dia a R$ 5,00. Fa�a um programa em Java que
dado a quantidade de cabelos que ele corta por dia informa quanto o cabeleireiro ir�
ganhar, por dia, por m�s e por ano.
*/

package br.uniube.ex03;

import java.util.Scanner;

public class Exerc�cio03 {
	public static void main(String args[])
	{
	//declara��o das vari�veis
	double x, tdia, tmes, tano;
	
	//entrada de dados
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de cabelos cortados por dia:");
		x = entrada.nextDouble();
		
		//Processamento: calculos
		tdia = (x * 5.00);
		tmes = (x * 5.00) * 30;
		tano = (x * 5.00) * 365;
		
		System.out.println("Voc� ir� ganhar por dia R$ " + tdia);
		System.out.println("Voc� ir� ganhar por mes R$ " + tmes);
		System.out.println("Voc� ir� ganhar por ano R$ " + tano);
	}
}
