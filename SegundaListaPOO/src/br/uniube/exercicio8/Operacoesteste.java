package br.uniube.exercicio8;

import java.util.Scanner;

public class Operacoesteste {

		public static void main (String args[])
		{
			Operacoes objO = new Operacoes();
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o primeiro valor:: ");
			objO.setValor1((int) entrada.nextDouble());
			
			Scanner entrada2 = new Scanner(System.in);
			System.out.println("Informe o segundo valor: ");
			objO.setValor2((int) entrada.nextDouble());
			
			int soma = objO.soma();
			System.out.println("A soma é: "+soma);
			
			int subtracao = objO.subtracao();
			System.out.println("A subtracao é: "+subtracao);
			
			double multiplicacao = objO.multiplicacao();
			System.out.println("A multiplicacao é: "+multiplicacao);
			
			double divisao = objO.divisao();
			System.out.println("A divisao é: "+divisao);
			
			
	}

}
