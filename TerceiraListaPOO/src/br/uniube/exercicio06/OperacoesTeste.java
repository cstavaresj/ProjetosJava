package br.uniube.exercicio06;

import java.util.Scanner;

import br.uniube.exercicio01.Curso;
import br.uniube.exercicio03.Produto;

public class OperacoesTeste {
	
	public static void main(String[] args) {
		// declaracao das variaveis
		int opcaoMenu=0;
		// criar um objeto da classe Curso
		Operacoes objOpr = new Operacoes();
		// entrada de dados
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int valor1 = entrada.nextInt();
		
		objOpr.setValor1(valor1);
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Informe o segundo valor: ");
		int valor2 = entrada2.nextInt();
		
		objOpr.setValor2(valor2);
		
		do {
			// exibindo o menu de opção
			System.out.println("---MENU DE OPCOES---");
			System.out.println("[1]-Calcular Soma");
			System.out.println("[2]-Calcular Subtracao");
			System.out.println("[3]-Calcular Multiplicacao");
			System.out.println("[4]-Calcular Divisao");
			System.out.println("[5]-Sair");
			System.out.println("Digite a opção desejada:");
			opcaoMenu = entrada.nextInt();
			
			// verificar qual a opção o usuário digitou
			switch (opcaoMenu) {
				case 1:
					objOpr.calculaSoma();
					break;
				case 2:
					objOpr.calculaSubtracao();
					break;
				case 3:
					objOpr.calculaMultiplicacao();
					break;
				case 4:
					objOpr.calculaDivisao();
					break;
			}
			
		} while (opcaoMenu != 5);

	}

}
