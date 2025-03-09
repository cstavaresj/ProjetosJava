package br.uniube.Labirinto;

import java.util.Scanner;

public class Labirinto
{
   public static void main(String[] args)
    {
        Niveis nivel = new Niveis(); //Cria a variavel "nivel" para executar a classe "Niveis" 
        Metodo metodo = new Metodo(); //Cria a variavel "metodo" para executar a classe "Metodo"
        int opcao; //cria a variavel opcao
        System.out.println("BEM VINDO AO JOGO LABIRINTO!"); //Frase de boas vindas do jogo
        
        do //executa pelo menos uma vez
        {
        	System.out.println("\nEscolha um nível:");
        	System.out.println("\n1. Muito Fácil");
            System.out.println("2. Fácil");
            System.out.println("3. Médio");
            System.out.println("4. Difícil");
            System.out.println("5. Muito Difícil");
            System.out.println("0. Sair");
            System.out.println("\nDigite uma opção: ");
            Scanner leitor = new Scanner(System.in); //lê a opçao digitada
            opcao = leitor.nextInt();
         
            switch (opcao)
            {
                case 0: //se a opcao digitada for "0"
                	System.out.println("\nAté Logo!");
                    break;
                    
                case 1:
                	System.out.println("\nBem vindo a fase mais fácil do jogo! Qualquer idiota consegue encontrar a saída!");
                	metodo.Avancar(nivel.muitofacil(),metodo.linhaasterisco(nivel.muitofacil()),metodo.colunaasterisco(nivel.muitofacil()));
                	/* Executa o método Avançar da classe Metodo, utilizando o objeto muitofacil para imprimir a matriz, 
                	o metodo linhaasterisco e colunaasterisco para acharem a posição inicial no objeto muitofacil*/
                	break;
                    
                case 2:
                	System.out.println("\nBem vindo a fase facil! Qualquer criancinha de 5 anos consegue encontrar a saída!");
                	metodo.Avancar(nivel.facil(),metodo.linhaasterisco(nivel.facil()),metodo.colunaasterisco(nivel.facil()));
                	break;
                    
                case 3:
                	System.out.println("\nBem vindo a fase média! É preciso ser paciente para encontrar a saída!");
                	metodo.Avancar(nivel.medio(), metodo.linhaasterisco(nivel.medio()), metodo.colunaasterisco(nivel.medio()));
                    break;
                    
                case 4:
                	System.out.println("\nBem vindo a fase difícil! Aposto que vc desistirá e não encontrará a saída!");
                	metodo.Avancar(nivel.dificil(), metodo.linhaasterisco(nivel.dificil()), metodo.colunaasterisco(nivel.dificil()));
                	break;
                	
                case 5:
                	System.out.println("\nBem vindo a fase mais difícil do jogo! Somente os ninjas e os discípulos de Chuck Norris conseguem encontrar a saída!");
                	metodo.Avancar(nivel.muitodificil(), metodo.linhaasterisco(nivel.muitodificil()), metodo.colunaasterisco(nivel.muitodificil()));
                	break;

                default: //Se for digitada uma opção diferente de 0,1,2,3,4 ou 5
                    System.out.println("Opção inválida!");
            }
        } 
        while (opcao != 0); //enquanto a opcao for direfente de 0, o que estiver dentro do "do" continua sendo executado
    }
}

