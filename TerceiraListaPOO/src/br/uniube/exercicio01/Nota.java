package br.uniube.exercicio01;

public class Nota {
	private double nota;
	
	public void setNota(double nota)
	{
		this.nota=nota;
	}
	public double getNota()
	{
		return nota;
	}
	public Nota(double nota)
	{
		setNota(nota);
	}
}