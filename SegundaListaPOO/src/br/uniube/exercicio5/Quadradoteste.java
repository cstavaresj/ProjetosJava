package br.uniube.exercicio5;

import java.util.Scanner;

import br.uniube.exercicio2.Triangulo;

public class Quadradoteste {

		public static void main (String args[])
		{
			Quadrado objQ = new Quadrado();
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o valor do lado: ");
			objQ.setLado(entrada.nextDouble());
			
			double area = objQ.getArea();
			System.out.println("A area é: "+area);
			
			double perimetro = objQ.getPerimetro();
			System.out.println("O perimetro é: "+perimetro);
			
			
			
	}

}
