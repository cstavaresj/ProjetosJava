package br.uniube.exercicio4;

import java.util.Scanner;

import br.uniube.exercicio2.Triangulo;

public class Contateste {

		public static void main (String args[])
		{
			Conta objC = new Conta();
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o valor do saldo inicial: ");
			objC.setSaldo(entrada.nextDouble());
			
			Scanner entrada2 = new Scanner(System.in);
			System.out.println("Informe o valor do credito: ");
			objC.setCredito(entrada.nextDouble());
			
			Scanner entrada3 = new Scanner(System.in);
			System.out.println("Informe o valor do debito: ");
			objC.setDebito(entrada2.nextDouble());
			
			double credito = objC.getCredito();
			System.out.println("O saldo com crédito é: "+credito);
			
			double debito = objC.getDebito();
			System.out.println("O saldo com débito é: "+debito);
			
			
			
	}

}
