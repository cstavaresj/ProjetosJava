/*17. Desenvolva uma classe que receba um n�mero e uma letra e mostre a letra repetida o n�meros
 de vezes correspondente ao n�mero recebido. Exemplo: Se o for informado: 10 A o resultado 
 ser� AAAAAAAAAA
*/

package br.uniube.ex17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String args[]){
		int numero, i;
		String letra;
		
        
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre com um n�mero: ");
		numero = entrada.nextInt();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Entre com a letra: ");
		letra = entrada2.next();
		
		for (i = 1; i <= numero; i++) {  
                	
			System.out.println(letra);  
        }  
          
      
          
   }  
}  
