package br.uniube.exercicio2;

public class Triangulo {

	private	double ladoa, ladob, ladoc;
	
	public void setLadoa(double a)
	{
		ladoa = a;
	}
	
	public double getLadoa()
	{
		return ladoa;
	}
	
	public void setLadob(double b)
	{
		ladob = b;
	}
	
	public double getLadob()
	{
		return ladob;
	}
	
	public void setLadoc(double c)
	{
		ladoc = c;
	}
	
	public double getLadoc()
	{
		return ladoc;
	}
	
	public double calcularPerimetro()
	{
		double p;
		p = (ladoa + ladob + ladoc);
		return p;
	}
		
	public double calcularSemiperimetro()
	{
		double p = calcularPerimetro();
		double s;
		s = (p/2);
		return s;
	}
	
	public double calcularArea()
	{
		double s = calcularSemiperimetro();
		double area = (Math.sqrt(s * (s-ladoa) * (s-ladob) * (s-ladoc)));
		return area;
	}

}