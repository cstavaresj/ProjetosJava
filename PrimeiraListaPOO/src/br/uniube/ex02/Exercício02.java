/* 2. Implemente um programa Java para calcular a área de um trapézio, onde:
 h = altura
 b = base menor
 B = base maior
 Área = (h . (b + B)) / 2
*/

package br.uniube.ex02;

import java.util.Scanner;

public class Exercício02 {
	public static void main(String args[])
	{
	//declaração das variáveis
	double h, b, B, area;
	//entrada de dados
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe a altura:");
	h = entrada.nextDouble();
	System.out.println("Informe a base menor:");
	b = entrada.nextDouble();
	System.out.println("Informe a base maior:");
	B = entrada.nextDouble();
	
	//Processamento: calculos
	area = (h * (b + B)) / 2;
	System.out.println("A area e " + area);
	}
}
