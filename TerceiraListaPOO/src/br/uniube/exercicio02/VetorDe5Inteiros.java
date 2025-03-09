package br.uniube.exercicio02;

import java.util.Scanner;

import br.uniube.exercicio01.Nota;

public class VetorDe5Inteiros
{
	
public static void main(String[] args){
    int[] numero = new int[5];
    Scanner entrada = new Scanner(System.in);
    
    //recebendo os números
    for(int i=0 ; i < 5 ; i++){
        System.out.print("Entre com o número " + (i+1) + ": ");
        numero[i] = entrada.nextInt();
    }
    
 // metodo para calcular a soma
 			int soma = 0;
 			for (int i = 0; i < 5; i++) {
 				soma = soma + numero[i];
 			}
 				System.out.println("A soma dos numeros é: "+soma);
 				
 	// metodo para calcular a maior nota
			int maior = 0;
			for (int i = 0; i < 5; i++) 
			{
				if(numero[i] > maior)  
		        {   
		        maior = numero[i];    
		        }    
		    }
			System.out.println("O maior numero é: "+maior);
			

	// metodo para calcular a posicao da menor nota
			int menor = 100, posicao=0;
			for (int i = 0; i < 5; i++) 
			{
				if(numero[i] < menor)  
					     {   
					     menor = numero[i];
					     posicao = i+1;
					     }    
			}
			System.out.println("A posição do menor numero é: "+posicao); 			
 			
			
	// metodo para retornar o ultumo elemento
			int ultimo = numero[4];				    
			System.out.println("O N-ésimo elemento é: "+ultimo); 		
 		
	// metodo para verificar se o número X existe na lista
			int x;
			Scanner entrada2 = new Scanner(System.in);
			System.out.println("Digite o numero a ser verificado: ");
			x= entrada.nextInt();
			
			for (int i = 0; i < 5; i++) 
			{
				if(x == numero[i])  
				{   
					System.out.println("O numero "+x+" pertence a lista."); 
				}
										
			}
								
	}

}