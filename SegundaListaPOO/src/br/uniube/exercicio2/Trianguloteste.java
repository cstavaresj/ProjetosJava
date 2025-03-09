package br.uniube.exercicio2;

import java.util.Scanner;
public class Trianguloteste {
	
	public static void main (String args[])
	{
		Triangulo objT = new Triangulo();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o lado a: ");
		objT.setLadoa(entrada.nextDouble());
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Informe o lado b: ");
		objT.setLadob(entrada2.nextDouble());
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Informe o lado c: ");
		objT.setLadoc(entrada3.nextDouble());
		
		double p = objT.calcularPerimetro();
		System.out.println("O perímetro é: "+p);
		
		double area = objT.calcularArea();
		System.out.println("A area do triangulo é: "+area);
		
		
		
	}
	
}
