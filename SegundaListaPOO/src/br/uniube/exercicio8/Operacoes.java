package br.uniube.exercicio8;

public class Operacoes {

int v1,v2,valor1, valor2, soma, subtracao;
double multiplicacao, divisao;

public void valor1(int v1)
{
	this.valor1=v1;
}

public void valor2(int v2)
{
	this.valor2=v2;
}


public void setValor1(int v1)
{
	this.valor1=v1;
}

public int getValor1()
{
	return this.valor1;
}

public void setValor2(int v2)
{
	this.valor2=v2;
}

public int getValor2()
{
	return this.valor2;
}



public int soma()
{
return soma = this.valor1+this.valor2;
}

public int subtracao()
{
return subtracao = this.valor1-this.valor2;
}

public double multiplicacao()
{
return multiplicacao = this.valor1*this.valor2;
}

public double divisao()
{
return divisao = this.valor1/this.valor2;
}

}
