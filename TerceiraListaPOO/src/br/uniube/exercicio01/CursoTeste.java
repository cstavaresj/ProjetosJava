package br.uniube.exercicio01;

import java.util.Scanner;

public class CursoTeste {
	
	public static void main(String[] args) {
		// declaracao das variaveis
		int opcaoMenu=0;
		// criar um objeto da classe Curso
		Curso objCurso = new Curso();
		// entrada de dados do nome do Curso
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome do Curso:");
		String nomeCurso = entrada.next();
		
		objCurso.setNomeCurso(nomeCurso);
		
		do {
			// exibindo o menu de opção
			System.out.println("---MENU DE OPCOES---");
			System.out.println("[1]-Inserir Nota");
			System.out.println("[2]-Consultar Nota");
			System.out.println("[3]-Calcular Média");
			System.out.println("[4]-Calcular Maior nota");
			System.out.println("[5]-Sair");
			System.out.println("Digite a opção desejada:");
			opcaoMenu = entrada.nextInt();
			
			// verificar qual a opção o usuário digitou
			switch (opcaoMenu) {
				case 1:
					objCurso.inserirNota();
					break;
				case 2:
					objCurso.consultarNotas();
					break;
				case 3:
					double media = objCurso.calculaMedia();
					System.out.println("A media das notas é " + media);
					break;
				case 4:
					double maior = objCurso.calculaMaior();
					System.out.println("A maior nota é " + maior);
					break;
			}
			
		} while (opcaoMenu != 5);

	}

}
