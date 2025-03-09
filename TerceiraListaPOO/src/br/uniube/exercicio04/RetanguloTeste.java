package br.uniube.exercicio04;

import java.util.Scanner;

import br.uniube.exercicio03.Produto;

public class RetanguloTeste {
	
	 public static void main(String[] args)
     {
             Retangulo retangulo = new Retangulo();          
             
             System.out.println("Comprimento = "+retangulo.getComprimento()+"\nLargura = "+retangulo.getLargura());
             System.out.println("Area = " + retangulo.getArea());
             System.out.println("Perimetro = " + retangulo.getPerimetro());
                       
            Retangulo objRet = new Retangulo();
     		Scanner entrada = new Scanner(System.in);
     		System.out.println("Informe o comprimento:");
     		double comprimento = entrada.nextDouble();
     		
     		objRet.setComprimento(comprimento);
     		
     		Scanner entrada2 = new Scanner(System.in);
     		System.out.println("Informe a largura:");
     		double largura = entrada.nextDouble();
     		
     		objRet.setLargura(largura);

             System.out.println("Area = " + objRet.getArea());
             System.out.println("Perimetro = " + objRet.getPerimetro());
     }

}
