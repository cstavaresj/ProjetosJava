/*6. DDesenvolver programa que solicite ao usuário para cadastrar uma senha; na
sequencia, deve pedir ao usuário que digite duas variáveis reais, e ira calcular a
divisão da primeira pela segunda. O programa ira pedir ao usuário que digite sua
senha: Se estiver correta ela mostra o resultado da divisão. Senão da mensagem de
erro e encerra o aplicativo.
*/

package br.uniube.ex06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String args[]){
	String senha, novasenha;
	double numero1, numero2, div;
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Informe a senha: ");
	novasenha = entrada.next();
	
	Scanner entrada2 = new Scanner (System.in);
	System.out.println("Entre com o primeiro número:");
	numero1 = entrada2.nextInt();
	Scanner entrada3 = new Scanner (System.in);
	System.out.println("Entre com o segundo número:");
	numero2 = entrada3.nextInt();
	
	div = numero1/numero2;
	
	Scanner entrada4 = new Scanner (System.in);
	System.out.println("Informe sua senha: ");
	senha = entrada4.next();
	
	if (senha.equals(novasenha))
		{
		System.out.println("Adivisao e: " + div);
		}
	
	else
		{	
		System.out.println("A senha esta errada!");
		}
	}
}
