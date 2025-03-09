/*15. Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e a 
 multiplicação dos números pares entre 0 e 30.
*/

package br.uniube.ex15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String args[]){
		int soma = 0, i;  
        long produto = 1;  
        for (i = 1; i <= 30; i = i+2) {  
            
        	soma = i+soma;  
            produto = produto * (i+1);  
        }  
          
        System.out.println(soma);  
        System.out.println(produto);  
   }  
}  