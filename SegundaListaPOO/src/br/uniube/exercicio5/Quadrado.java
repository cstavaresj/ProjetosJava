package br.uniube.exercicio5;

public class Quadrado {

private double lado;
double area, perimetro;

public void setLado(double l)
{
	lado = l;
}

public double getLado()
{
	return lado;
}


public void setArea(double a)
{
	area = a;
		
}

public double getArea()
{
	area = lado*lado;
	return area;
}

public void setPerimetro(double p)
{
	perimetro = p;
	
}

public double getPerimetro()
{
	perimetro = lado * 4;
	return perimetro;
}
}
