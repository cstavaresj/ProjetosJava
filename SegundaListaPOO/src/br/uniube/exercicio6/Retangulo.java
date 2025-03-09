package br.uniube.exercicio6;

public class Retangulo {

private double largura, comprimento;
double area, perimetro;

public void setLargura()
{
	largura = 0;
}

public double getLargura()
{
	return largura;
}


public void setComprimento()
{
	comprimento = 0;
		
}

public double getComprimento()
{
	return comprimento;
}

public void setLargura(double l)
{
	largura = l;
	if (largura>0)
	{
		if (largura<20)
		{
		System.out.println("A largura está entre 0.0 e 20.0");
		}
	}
}

public void setComprimento(double c)
{
	comprimento = c;
	if (comprimento>0)
	{
		if (comprimento<20)
		{
		System.out.println("O comprimento está entre 0.0 e 20.0");
		}
	}
}

public void setArea(double a)
{
	area = a;
	
}
public double getArea()
{
	area = largura*comprimento;
	return area;
}

public void setPerimetro(double p)
{
	perimetro = p;
	
}

public double getPerimetro()
{
	perimetro = ((largura * 2)+(comprimento * 2));
	return perimetro;
}
}
