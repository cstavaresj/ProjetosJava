/*8. Escreva um programa Java que calcule o perímetro de uma circunferência, sendo pedido ao
 *  usuário o tamanho o seu raio. (perímetro = 2 * PI * raio).

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
	
	System.out.println("O perímetro é: "+ perimetro);
	
	}
}
