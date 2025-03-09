package br.uniube.exercicio04;

import java.util.Scanner;

public class Retangulo {
	
		    private double comprimento;
		    private double largura;
	       
	               
	        public double getComprimento()
	        {
	                return  comprimento;
	        }
	        
	        public void setComprimento(double comprimento)
	        {
	                if( comprimento > 0.0 & comprimento < 20.0 )
	                        this.comprimento = comprimento;
	        }
	        
	        public double getLargura()
	        {
	                return largura;
	        }
	        
	        public void setLargura(double largura)
	        {
	                if( largura > 0.0 & largura < 20.0 )
	                        this.largura = largura;
	        }
	        
	        public double getPerimetro()
	        {
	                return (comprimento*2 + largura*2);
	        }
	        
	        public double getArea()
	        {
	                return (comprimento * largura);
	        }

	}
