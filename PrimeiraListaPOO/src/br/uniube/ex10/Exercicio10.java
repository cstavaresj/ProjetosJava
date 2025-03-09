/*10. Um professor aplica duas provas: a segunda prova tem o dobro do peso da primeira. 
	 Receba as notas das provas e calcule a média
*/

package br.uniube.ex10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String args[]){
	Double media, n1, n2;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Informe a primeira nota: ");
	n1 = entrada.nextDouble();
	
	Scanner entrada2 = new Scanner (System.in);
	System.out.println("Informe a segunda nota: ");
	n2 = entrada2.nextDouble();
	
	media = (n1 + (n2 *2)) /3;
	
	System.out.println("A média é: "+ media);
	
	}
}
