package br.uniube.exercicio3;

import java.util.Scanner;

import br.uniube.exercicio1.Retangulo;

public class Funcionario {

	private	boolean estaEmpresa;
	private	double salario,aumento;
	private String nome, departamento, dataEntrada, RG;  
	
	
	
	public String getDataEntrada() {  
        return dataEntrada;  
    }  
  
    public void setDataEntrada(String dataEntrada) {  
        this.dataEntrada = dataEntrada;  
    }  
  
    public String getDepartamento() {  
        return departamento;  
    }  
  
    public void setDepartamento(String departamento) {  
        this.departamento = departamento;  
    }  
  
    public boolean estaEmpresa() {  
        return estaEmpresa;  
    }  
  
    public void setestaEmpresa(boolean naEmpresa) {  
        this.estaEmpresa = estaEmpresa;  
    }  
  
    public String getNome() {  
        return nome;  
    }  
  
    public void setNome(String nome) {  
        this.nome = nome;  
    }  
  
    public String getRG() {  
        return RG;  
    }  
  
    public void setRG(String rg) {  
        RG = rg;  
    }  
  
    public double getSalario() {  
        return salario;  
    }  
  
    public void setSalario(double salario) {  
        this.salario = salario;  
    }  
  
    public void bonificaFuncionario(double valorBeneficio) {  
        setSalario(getSalario() + valorBeneficio);  
  
    }  
  
    public void demiteFuncionario() {  
        setestaEmpresa(false);  
    }  
  
}  