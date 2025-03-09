package br.uniube.exercicio4;

public class Conta {

double saldo;
double credito, debito, valor;

public void setSaldo(double s)
{
	saldo = s;
}

public double getSaldo()
{
	return saldo;
}


public void setCredito(double c)
{
	valor = c;
		
}

public double getCredito()
{
	credito = saldo + valor;
	return credito;
}

public void setDebito(double d)
{
	valor = d;
	
}

public double getDebito()
{
	debito = saldo - valor;
	return debito;
}
}
