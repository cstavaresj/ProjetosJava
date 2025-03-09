package br.uniube.exercicio07;

import java.util.Scanner;

public class DisciplinaTeste {

	public static void main(String[] args) {
		// declaracao das variaveis
		int opcaoMenu=0;
		// criar um objeto da classe Universidade
		Disciplina objDisc = new Disciplina();
		// entrada de dados do nome da Universidade
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o código da Disciplina:");
		int codigo = entrada.nextInt();
		System.out.println("Informe o nome da Disciplina:");
		String nome = entrada.next();
		
		objDisc.setCodigo(codigo);
		objDisc.setNome(nome);
		
		do {
			// exibindo o menu de opção
			System.out.println("---MENU DE OPCOES---");
			System.out.println("[1]-Inserir Aluno");
			System.out.println("[2]-Consultar Aluno");
			System.out.println("[3]-Remover Aluno");
			System.out.println("[4]-Alterar Aluno");
			System.out.println("[5]-Calcular Média");
			System.out.println("[6]-Sair");
			System.out.println("Digite a opção desejada:");
			opcaoMenu = entrada.nextInt();
			
			// verificar qual a opção o usuário digitou
			switch (opcaoMenu) {
				case 1:
					objDisc.inserirAluno();
					break;
				case 2:
					objDisc.consultarAlunos();
					break;
				case 3:
					System.out.println("Matricula do aluno que deseja remover:");
					int matRemover = entrada.nextInt();
					objDisc.removerAluno(matRemover);
					break;
				case 4:
					System.out.println("Matricula do aluno que deseja alterar:");
					int matAlterar = entrada.nextInt();
					System.out.println("Nova nota do aluno:");
					double novaNota = entrada.nextDouble();
					boolean achou = objDisc.alterarAluno(matAlterar, novaNota);
					if (achou == true) {
						System.out.println("Aluno alterado com sucesso");
					} else {
						System.out.println("Aluno não encontrado");
					}
					break;
				case 5:
					double media = objDisc.calculaMedia();
					System.out.println("A media das notas é " + media);
					break;
			}
			
		} while (opcaoMenu != 6);

	}

}
