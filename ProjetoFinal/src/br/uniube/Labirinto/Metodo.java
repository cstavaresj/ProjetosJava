package br.uniube.Labirinto;

import java.util.Scanner;

public class Metodo
{
	public void imprimirMatriz(String[][] matriz) //Método para exibir a Matriz
	{
        for (int i = 0; i < matriz.length; i++) //passa pelas linhas
        {
            for (int j = 0; j < matriz[0].length; j++) //passa pelas colunas
            {
                System.out.print(matriz[i][j] + " "); //coloca espaço entre cada coluna para melhorar o layout do labirinto
            }
            System.out.println(); //dá enter a cada linha
        }
    }
    public int linhaasterisco(String[][] matriz) //método que descobre qual a linha que está o asterisco "*"
    {
        int linha = 0; //cria a variavel linha
        for (int i = 0; i < matriz.length; i++) //passa pelas linhas da matriz
        {
            for (int j = 0; j < matriz[0].length; j++) //passa pelas colunas
            {
                if (matriz[i][j].equals("*")) //Se a posição encontrada for igual a "*"
                {
                    linha = i;	
                }
            }
        }
        return linha; //retorna o valor da linha correspondente a posição do "*"
    }
    
    public int colunaasterisco(String[][] matriz) //método que descobre qual a coluna que está o asterisco "*"
    {
        int coluna = 0; 
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                if (matriz[i][j].equals("*"))
                {
                    coluna = j;
                }
            }
        }
        return coluna;
    }
    
    int [] saida= new int[2]; //cria um vetor com 2 valores
    
    public int [] posicaoX(String [][]matriz) //Descobre qual a posição da saída do labirinto "X"
    {
         for (int i = 0; i < matriz.length; i++) //passa pelas linhas
         {
             for (int j = 0; j < matriz[0].length; j++) //passa pelas colunas
             {
                 if (matriz[i][j].equals("X")) //se a posição da matriz[i][j] for igual a "X"
                 {
                     saida[0]=i; //o primeiro valor do vetor "saida" é igual ao valor correspondente da linha onde está o "X
                     saida[1]=j; //o segundo valor do vetor "saida" é igual ao valor correspondente da colna nonde está o "X
                 }
             }
         }
         return saida; //retorna o vetor saida
     }
    
    public void Avancar(String[][] matriz, int linhas, int colunas) //Método para movimentar-se
    {
      int [] saida = posicaoX(matriz); //chama o vetor "saida" referente a posição do "X"
      System.out.println("Para movimentar-se, utilize as teclas 'A' 'S' 'D' 'W' e em seguida pressione 'Enter'!\nVocê pode arregar e sair desse nível pressionando '0' a qualquer momento!\n");
      int contador=0; //variável que contará a quantidade de movimentos
      
      while (matriz[linhas][colunas]!=matriz[saida[0]][saida[1]]) //enquanto a posição do "*" for diferente da posição do "X"...
      {
    	  imprimirMatriz(matriz); //exibe a matriz toda vez que um movimento for executado
          System.out.print("   Direção: "); //Pede a direção
          Scanner leitor = new Scanner(System.in); //lê o que foi digitado
          String direcao = leitor.next(); //cria a String direcao que le a letra referente ao movimento
          
          //movimenta para a direita
          if (direcao.equalsIgnoreCase("d")) //Se a direção digitada for igual a "d"...
        	  		//"equalsIgnoreCase" verifica se a tecla digitada é igual a "d" ou "D", independente de ser minuscula ou maiuscula 
          {
        	  if (!matriz[linhas][colunas + 1].equals("  ")) //Se depois de movimentar para a direita, a posição não for igual a "dois espaços"... 
        		  //"!" significa negação, ou seja, nega o que está a sua frente
        	  {
        		  if (!matriz[linhas][colunas + 1].equals("1")) //Se depois de movimentar para a direita, a posição não for igual a "1"... 
        		  { 
        		  matriz[linhas][colunas + 1] = "*"; //o "*" passa para a posição do espaço " "
                  matriz[linhas][colunas] = " ";	//o espaço passa para a posição do "*"
                  colunas++; //posição final ao se movimentar para a direita
                  contador++; //acrescenta +1 ao contador de movimentos
        		  }
               }
          }

          //movimenta para a esquerda
          if (direcao.equalsIgnoreCase("a"))
          {
        	  if (!matriz[linhas][colunas - 1].equals("  "))
              {
        		  if (!matriz[linhas][colunas - 1].equals("1"))
        		  {
        		  matriz[linhas][colunas - 1] = "*";
                  matriz[linhas][colunas] = " ";
                  colunas--;
                  contador++;
        		  }
              }
          }
          
          //movimenta para cima
          if (direcao.equalsIgnoreCase("w"))
          {
        	  if (!matriz[linhas - 1][colunas].equals("1"))
    		  {
        		  matriz[linhas - 1][colunas] = "*";
                  matriz[linhas][colunas] = " ";
                  linhas--;
                  contador++;
              }
           }
          
          //movimenta para baixo
          if (direcao.equalsIgnoreCase("s"))
          {
        	  if (!matriz[linhas + 1][colunas].equals("1"))
              {
        		  matriz[linhas + 1][colunas] = "*";
                  matriz[linhas][colunas] = " ";
                  linhas++;
                  contador++;
              }
          }
          
          //sai do while
          if (direcao.equals("0")) //se a tecla digitada for "0" o programa volta para o menu inicial
          {
        	  System.out.println("\nPARABÉNS! VOCÊ É UM ARREGÃO!");
        	  break; //para o while
          }
      } // fim do while
      
      if (matriz[linhas][colunas] == matriz[saida[0]][saida[1]]) //Se a posição atual for igual a posição da saida...
      {
    	  imprimirMatriz(matriz); //exibe a matriz com o asterisco na posição do "X"
    	  System.out.println("\nPARABÉNS! VOCÊ CONSEGUIU ENCONTRAR A SAIDA DO LABIRINTO EM "+contador+" MOVIMENTOS!\n\nQue tal jogar novamente?"); //exibe a mensagem de parabéns
      }
    } //fim do metodo Avancar
} //fim da classe Metodo
