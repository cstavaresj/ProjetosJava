package br.uniube.exercicio1;

public class Retangulo {

	private	double base, altura;
	public void setBase(double l)
	{
		base = l;
	}
	
	public double getBase()
	{
		return base;
	}
	
	public void setAltura(double a)
	{
		altura = a;
	}
	
	public double getAltura()
	{
		return altura;
	}

	public double calcularArea()
	{
		double area;
		return(base * altura);
	}

}