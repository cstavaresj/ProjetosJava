package br.uniube.exercicio03;

import java.util.Scanner;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		// declaracao das variaveis
		int opcaoMenu=0;
		// criar um objeto da classe Produto
		Produto objProd = new Produto();
		// entrada de dados do nome do Curso
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome do Produto:");
		String nome = entrada.next();
		
		objProd.setNome(nome);
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Informe o codigo do Produto:");
		String codigo = entrada2.next();
		
		objProd.setCodigo(codigo);
		
		do {
			// exibindo o menu de opção
			System.out.println("---MENU DE OPCOES---");
			System.out.println("[1]-Inserir Preço");
			System.out.println("[2]-Calcular Maior preço");
			System.out.println("[3]-Calcular Menor preço");
			System.out.println("[4]-Calcular Média");
			System.out.println("[5]-Sair");
			System.out.println("Digite a opção desejada:");
			opcaoMenu = entrada.nextInt();
			
			// verificar qual a opção o usuário digitou
			switch (opcaoMenu) {
				case 1:
					objProd.inserirPreco();
					break;
				case 2:
					double maior = objProd.calculaMaior();
					System.out.println("O maior preço de "+nome+" é: "+maior);
					break;
				case 3:
					double menor = objProd.calculaMenor();
					System.out.println("O menor preço de "+nome+" é: "+menor);
					break;
				case 4:
					double media = objProd.calculaMedia();
					System.out.println("O preco medio de "+nome+" é: "+media);
					break;
			}
			
		} while (opcaoMenu != 5);

	}

}
