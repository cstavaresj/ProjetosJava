/*8. Escreva um programa Java que calcule o per�metro de uma circunfer�ncia, sendo pedido ao
 *  usu�rio o tamanho o seu raio. (per�metro = 2 * PI * raio).

*/

package br.uniube.ex08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String args[]){
	Double perimetro, raio;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Informe o raio: ");
	raio = entrada.nextDouble();
	
	perimetro = 2 * Math.PI * raio;
	
	System.out.println("O per�metro �: "+ perimetro);
	
	}
}
