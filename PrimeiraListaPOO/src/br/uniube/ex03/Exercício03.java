/*3. Um cabeleireiro corta X cabelos por dia a R$ 5,00. Faça um programa em Java que
dado a quantidade de cabelos que ele corta por dia informa quanto o cabeleireiro irá
ganhar, por dia, por mês e por ano.
*/

package br.uniube.ex03;

import java.util.Scanner;

public class Exercício03 {
	public static void main(String args[])
	{
	//declaração das variáveis
	double x, tdia, tmes, tano;
	
	//entrada de dados
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de cabelos cortados por dia:");
		x = entrada.nextDouble();
		
		//Processamento: calculos
		tdia = (x * 5.00);
		tmes = (x * 5.00) * 30;
		tano = (x * 5.00) * 365;
		
		System.out.println("Você irá ganhar por dia R$ " + tdia);
		System.out.println("Você irá ganhar por mes R$ " + tmes);
		System.out.println("Você irá ganhar por ano R$ " + tano);
	}
}
