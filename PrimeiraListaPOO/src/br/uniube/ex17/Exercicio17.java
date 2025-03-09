/*17. Desenvolva uma classe que receba um número e uma letra e mostre a letra repetida o números
 de vezes correspondente ao número recebido. Exemplo: Se o for informado: 10 A o resultado 
 será AAAAAAAAAA
*/

package br.uniube.ex17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String args[]){
		int numero, i;
		String letra;
		
        
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre com um número: ");
		numero = entrada.nextInt();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Entre com a letra: ");
		letra = entrada2.next();
		
		for (i = 1; i <= numero; i++) {  
                	
			System.out.println(letra);  
        }  
          
      
          
   }  
}  
