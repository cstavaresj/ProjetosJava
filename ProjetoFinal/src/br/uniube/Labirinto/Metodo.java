package br.uniube.Labirinto;

import java.util.Scanner;

public class Metodo
{
	public void imprimirMatriz(String[][] matriz) //M�todo para exibir a Matriz
	{
        for (int i = 0; i < matriz.length; i++) //passa pelas linhas
        {
            for (int j = 0; j < matriz[0].length; j++) //passa pelas colunas
            {
                System.out.print(matriz[i][j] + " "); //coloca espa�o entre cada coluna para melhorar o layout do labirinto
            }
            System.out.println(); //d� enter a cada linha
        }
    }
    public int linhaasterisco(String[][] matriz) //m�todo que descobre qual a linha que est� o asterisco "*"
    {
        int linha = 0; //cria a variavel linha
        for (int i = 0; i < matriz.length; i++) //passa pelas linhas da matriz
        {
            for (int j = 0; j < matriz[0].length; j++) //passa pelas colunas
            {
                if (matriz[i][j].equals("*")) //Se a posi��o encontrada for igual a "*"
                {
                    linha = i;	
                }
            }
        }
        return linha; //retorna o valor da linha correspondente a posi��o do "*"
    }
    
    public int colunaasterisco(String[][] matriz) //m�todo que descobre qual a coluna que est� o asterisco "*"
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
    
    public int [] posicaoX(String [][]matriz) //Descobre qual a posi��o da sa�da do labirinto "X"
    {
         for (int i = 0; i < matriz.length; i++) //passa pelas linhas
         {
             for (int j = 0; j < matriz[0].length; j++) //passa pelas colunas
             {
                 if (matriz[i][j].equals("X")) //se a posi��o da matriz[i][j] for igual a "X"
                 {
                     saida[0]=i; //o primeiro valor do vetor "saida" � igual ao valor correspondente da linha onde est� o "X
                     saida[1]=j; //o segundo valor do vetor "saida" � igual ao valor correspondente da colna nonde est� o "X
                 }
             }
         }
         return saida; //retorna o vetor saida
     }
    
    public void Avancar(String[][] matriz, int linhas, int colunas) //M�todo para movimentar-se
    {
      int [] saida = posicaoX(matriz); //chama o vetor "saida" referente a posi��o do "X"
      System.out.println("Para movimentar-se, utilize as teclas 'A' 'S' 'D' 'W' e em seguida pressione 'Enter'!\nVoc� pode arregar e sair desse n�vel pressionando '0' a qualquer momento!\n");
      int contador=0; //vari�vel que contar� a quantidade de movimentos
      
      while (matriz[linhas][colunas]!=matriz[saida[0]][saida[1]]) //enquanto a posi��o do "*" for diferente da posi��o do "X"...
      {
    	  imprimirMatriz(matriz); //exibe a matriz toda vez que um movimento for executado
          System.out.print("   Dire��o: "); //Pede a dire��o
          Scanner leitor = new Scanner(System.in); //l� o que foi digitado
          String direcao = leitor.next(); //cria a String direcao que le a letra referente ao movimento
          
          //movimenta para a direita
          if (direcao.equalsIgnoreCase("d")) //Se a dire��o digitada for igual a "d"...
        	  		//"equalsIgnoreCase" verifica se a tecla digitada � igual a "d" ou "D", independente de ser minuscula ou maiuscula 
          {
        	  if (!matriz[linhas][colunas + 1].equals("  ")) //Se depois de movimentar para a direita, a posi��o n�o for igual a "dois espa�os"... 
        		  //"!" significa nega��o, ou seja, nega o que est� a sua frente
        	  {
        		  if (!matriz[linhas][colunas + 1].equals("1")) //Se depois de movimentar para a direita, a posi��o n�o for igual a "1"... 
        		  { 
        		  matriz[linhas][colunas + 1] = "*"; //o "*" passa para a posi��o do espa�o " "
                  matriz[linhas][colunas] = " ";	//o espa�o passa para a posi��o do "*"
                  colunas++; //posi��o final ao se movimentar para a direita
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
        	  System.out.println("\nPARAB�NS! VOC� � UM ARREG�O!");
        	  break; //para o while
          }
      } // fim do while
      
      if (matriz[linhas][colunas] == matriz[saida[0]][saida[1]]) //Se a posi��o atual for igual a posi��o da saida...
      {
    	  imprimirMatriz(matriz); //exibe a matriz com o asterisco na posi��o do "X"
    	  System.out.println("\nPARAB�NS! VOC� CONSEGUIU ENCONTRAR A SAIDA DO LABIRINTO EM "+contador+" MOVIMENTOS!\n\nQue tal jogar novamente?"); //exibe a mensagem de parab�ns
      }
    } //fim do metodo Avancar
} //fim da classe Metodo
