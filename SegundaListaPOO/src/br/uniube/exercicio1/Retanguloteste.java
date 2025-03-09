package br.uniube.exercicio1;

import java.util.Scanner;
public class Retanguloteste {
	
	public static void main (String args[])
	{
		Retangulo objR = new Retangulo();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a base do retangulo: ");
		objR.setBase(entrada.nextDouble());
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Informe a altura do retangulo: ");
		objR.setAltura(entrada2.nextDouble());
		
		double area = objR.calcularArea();
		System.out.println("A area do retangulo é: "+area);
		
	}
	
}
