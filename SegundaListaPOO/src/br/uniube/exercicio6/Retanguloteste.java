package br.uniube.exercicio6;

import java.util.Scanner;

import br.uniube.exercicio2.Triangulo;

public class Retanguloteste {

		public static void main (String args[])
		{
			Retangulo objR = new Retangulo();
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o valor da largura: ");
			objR.setLargura(entrada.nextDouble());
			
			Scanner entrada2 = new Scanner(System.in);
			System.out.println("Informe o valor do comprimento: ");
			objR.setComprimento(entrada.nextDouble());
			
			double area = objR.getArea();
			System.out.println("A area é: "+area);
			
			double perimetro = objR.getPerimetro();
			System.out.println("O perimetro é: "+perimetro);
			
			
			
	}

}
