package br.uniube.exercicio3;

import java.util.Scanner;

import br.uniube.exercicio1.Retangulo;
public class Funcionarioteste {
	
	public static void main(String[] args) {  
	Funcionario funcionario = new Funcionario();  
	  
   
    funcionario.setNome("Joaquim Silvério");
    funcionario.setDataEntrada("05/03/2010");
    funcionario.setDepartamento("Informatica"); 
    funcionario.setestaEmpresa(true);  
    funcionario.setRG("9876543210");  
    funcionario.setSalario(1000);  

    funcionario.bonificaFuncionario(400);  

    funcionario.demiteFuncionario();  

    System.out.println("Nome...........: " + funcionario.getNome());  
    System.out.println("RG.............: " + funcionario.getRG());  
    System.out.println("Departamento...: " + funcionario.getDepartamento());  
    System.out.println("Salario........: " + funcionario.getSalario());  
    System.out.println("Data de Entrada: " + funcionario.getDataEntrada());  
    System.out.println("Está na empresa: " + funcionario.estaEmpresa());  

}  

}  