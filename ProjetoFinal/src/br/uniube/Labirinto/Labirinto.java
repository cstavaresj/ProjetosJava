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
        	System.out.println("\nEscolha um n�vel:");
        	System.out.println("\n1. Muito F�cil");
            System.out.println("2. F�cil");
            System.out.println("3. M�dio");
            System.out.println("4. Dif�cil");
            System.out.println("5. Muito Dif�cil");
            System.out.println("0. Sair");
            System.out.println("\nDigite uma op��o: ");
            Scanner leitor = new Scanner(System.in); //l� a op�ao digitada
            opcao = leitor.nextInt();
         
            switch (opcao)
            {
                case 0: //se a opcao digitada for "0"
                	System.out.println("\nAt� Logo!");
                    break;
                    
                case 1:
                	System.out.println("\nBem vindo a fase mais f�cil do jogo! Qualquer idiota consegue encontrar a sa�da!");
                	metodo.Avancar(nivel.muitofacil(),metodo.linhaasterisco(nivel.muitofacil()),metodo.colunaasterisco(nivel.muitofacil()));
                	/* Executa o m�todo Avan�ar da classe Metodo, utilizando o objeto muitofacil para imprimir a matriz, 
                	o metodo linhaasterisco e colunaasterisco para acharem a posi��o inicial no objeto muitofacil*/
                	break;
                    
                case 2:
                	System.out.println("\nBem vindo a fase facil! Qualquer criancinha de 5 anos consegue encontrar a sa�da!");
                	metodo.Avancar(nivel.facil(),metodo.linhaasterisco(nivel.facil()),metodo.colunaasterisco(nivel.facil()));
                	break;
                    
                case 3:
                	System.out.println("\nBem vindo a fase m�dia! � preciso ser paciente para encontrar a sa�da!");
                	metodo.Avancar(nivel.medio(), metodo.linhaasterisco(nivel.medio()), metodo.colunaasterisco(nivel.medio()));
                    break;
                    
                case 4:
                	System.out.println("\nBem vindo a fase dif�cil! Aposto que vc desistir� e n�o encontrar� a sa�da!");
                	metodo.Avancar(nivel.dificil(), metodo.linhaasterisco(nivel.dificil()), metodo.colunaasterisco(nivel.dificil()));
                	break;
                	
                case 5:
                	System.out.println("\nBem vindo a fase mais dif�cil do jogo! Somente os ninjas e os disc�pulos de Chuck Norris conseguem encontrar a sa�da!");
                	metodo.Avancar(nivel.muitodificil(), metodo.linhaasterisco(nivel.muitodificil()), metodo.colunaasterisco(nivel.muitodificil()));
                	break;

                default: //Se for digitada uma op��o diferente de 0,1,2,3,4 ou 5
                    System.out.println("Op��o inv�lida!");
            }
        } 
        while (opcao != 0); //enquanto a opcao for direfente de 0, o que estiver dentro do "do" continua sendo executado
    }
}

