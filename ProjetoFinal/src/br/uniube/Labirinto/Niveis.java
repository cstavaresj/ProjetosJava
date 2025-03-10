package br.uniube.Labirinto;

public class Niveis
{
   public String[][] muitofacil() //cria a matriz do labirinto nivel muito facil
    {
        String[][] matriz = {
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
            {"  ","1", " ", " ", " ", " ", "1", " ", " ", " ", " ", "1", " ", " ", " ", " ", "1"},
            {"  ","1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","*", " ", "1", "1", " ", " ", " ", "1", "1", " ", " ", " ", "1", "1", " ", "1"},
            {"  ","1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","1", " ", " ", " ", " ", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","1", " ", "1", "1", "1", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","1", " ", "1", "1", "1", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","1", " ", "1", "1", "1", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","1", " ", "1", "1", "1", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","1", " ", "1", "1", "1", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","1", " ", "1", "1", "1", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","1", " ", "1", "1", "1", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1"},
            {"  ","1", " ", "1", "1", "1", "1", " ", " ", " ", " ", "1", " ", " ", " ", " ", "X"},
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"}};
        return matriz;
    }

    public String[][] facil() //cria a matriz do labirinto nivel facil
    {
        String[][] matriz = {
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
            {"  ","1", "1", "1", "1", "1", "1", " ", " ", "1", " ", "1", " ", "1", "1", "1", "1", "1"},
            {"  ","1", "1", " ", " ", " ", "1", "1", " ", " ", " ", " ", " ", " ", " ", " ", " ", "1"},
            {"  ","1", "1", " ", "1", "1", " ", " ", " ", "1", "1", " ", "1", "1", " ", "1", "1", "1"},
            {"  ","1", " ", " ", " ", " ", " ", "1", "1", "1", " ", " ", "1", " ", " ", " ", " ", "X"},
            {"  ","1", "1", " ", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", " ", "1", "1"},
            {"  ","1", "1", " ", "1", "1", "1", " ", " ", " ", " ", "1", " ", "1", "1", " ", "1", "1"},
            {"  ","1", " ", " ", " ", " ", " ", "1", "1", "1", " ", " ", " ", "1", " ", " ", "1", "1"},
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", " ", "1", " ", "1", "1", "1"},
            {"  ","1", "1", "1", " ", "1", " ", " ", " ", " ", " ", "1", " ", "1", " ", " ", " ", "1"},
            {"  ","1", "1", " ", " ", " ", " ", "1", "1", "1", " ", " ", " ", " ", "1", "1", " ", "1"},
            {"  ","1", "1", " ", "1", "1", " ", "1", "1", " ", " ", "1", "1", "1", "1", " ", " ", "1"},
            {"  ","1", "1", " ", "1", "1", " ", "1", "1", "1", " ", "1", "1", "1", " ", " ", "1", "1"},
            {"  ","*", " ", " ", "1", "1", " ", " ", " ", " ", " ", " ", " ", " ", " ", "1", "1", "1"},
            {"  ","1", " ", "1", "1", "1", " ", "1", " ", "1", " ", "1", " ", "1", "1", "1", "1", "1"},
            {"  ","1", " ", "1", "1", "1", " ", "1", " ", "1", " ", "1", " ", "1", " ", " ", "1", "1"},
            {"  ","1", " ", "1", " ", " ", " ", "1", " ", "1", " ", " ", " ", "1", "1", " ", "1", "1"},
            {"  ","1", " ", "1", "1", "1", "1", "1", " ", " ", " ", "1", " ", " ", "1", " ", "1", "1"},
            {"  ","1", " ", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", " ", " ", " ", "1", "1"},
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"}};
        return matriz;
    }

	public String[][] medio() //cria a matriz do labirinto nivel medio
    {
        String[][] matriz = {
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1","1","1", "1"},
            {"  ","1", "1", " ", " ", " ", " ", "1", "1", " ", " ", " ", "1", "1", "1", "1", "1","1","1", "1"},
            {"  ","1", "1", " ", "1", "1", " ", " ", " ", " ", "1", " ", "1", "1", "1", "1", "1","1","1", "1"},
            {"  ","1", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1", "1", " ", " ", " "," "," ", "1"},
            {"  ","1", "1", " ", "1", "1", " ", "1", "1", "1", "1", " ", "1", "1", " ", "1", "1","1"," ", "1"},
            {"  ","1", "1", " ", "1", "1", "1", "1", " ", "1", "1", " ", " ", "1", " ", " ", " "," "," ", "1"},
            {"  ","1", "1", " ", "1", " ", " ", " ", " ", " ", " ", "1", "1", "1", " ", "1", "1","1"," ", "1"},
            {"  ","1", "1", " ", "1", " ", "1", "1", " ", "1", " ", " ", "1", " ", " ", " ", "1","1"," ", "1"},
            {"  ","1", " ", " ", " ", " ", "1", "1", " ", "1", "1", " ", " ", " ", "1", " ", "1","1"," ", "1"},
            {"  ","1", " ", "1", "1", " ", "1", "1", " ", " ", "1", "1", " ", "1", "1", " ", " "," "," ", "1"},
            {"  ","1", " ", "1", "1", " ", "1", "1", " ", "1", "1", " ", " ", " ", "1", " ", "1"," ","1", "1"},
            {"  ","1", " ", "1", "1", "1", " ", " ", " ", "1", "1", "1", "1", "1", "1", " ", "1"," ","1", "1"},
            {"  ","1", " ", " ", " ", "1", "1", "1", "1", "1", "1", "1", "1", "1", " ", " ", "1"," ","1", "1"},
            {"  ","1", "1", "1", " ", "1", "1", " ", " ", "1", " ", " ", " ", "1", "1", " ", " ","1","1", "1"},
            {"  ","1", "1", "1", " ", " ", " ", "1", " ", "1", " ", "1", " ", " ", "1", "1", " "," "," ", "1"},
            {"  ","1", "1", "1", "1", " ", "1", "1", " ", " ", " ", "1", "1", " ", "1", " ", " ","1","1", "1"},
            {"  ","1", "1", "1", "1", " ", "1", "1", " ", "1", "1", "1", "1", " ", " ", " ", "1","1","1", "1"},
            {"  ","1", "1", " ", " ", " ", "1", " ", " ", "1", "1", " ", "1", " ", "1", " ", "1","1","1", "1"},
            {"  ","1", "1", " ", "1", "1", "1", "1", " ", "1", " ", " ", "1", " ", " ", " ", " "," "," ", "1"},
            {"  ","*", " ", " ", "1", "1", "1", "1", " ", " ", "1", " ", "1", " ", "1", "1", "1","1","1", "1"},
            {"  ","1", "1", " ", " ", " ", "1", " ", "1", " ", " ", " ", "1", " ", "1", "1", " ","1","1", "1"},
            {"  ","1", "1", "1", "1", " ", " ", " ", "1", "1", "1", " ", "1", " ", " ", " ", " ","1","1", "1"},
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "X", "1", "1", "1", "1", "1","1","1", "1"}};
        return matriz;
    }
    
	public String[][] dificil() //cria a matriz do labirinto nivel dificil
    {
        String[][] matriz = {
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1","1"},
            {"  ","1", "1", " ", " ", " ", " ", " ", " ", " ", " ", " ", "1", "1", "1", "1", "1","1", "1", "1", "1", "1"},
            {"  ","1", "1", " ", "1", "1", "1", " ", "1", "1", "1", " ", " ", " ", " ", " ", " ","1", "1", "1", "1", "1"},
            {"  ","*", " ", " ", "1", "1", "1", " ", " ", " ", " ", "1", " ", "1", "1", "1", " "," ", " ", " ", "1", "1"},
            {"  ","1", "1", " ", " ", " ", " ", " ", "1", "1", "1", "1", " ", "1", "1", "1", "1","1", "1", " ", "1", "1"},
            {"  ","1", "1", " ", "1", "1", "1", "1", "1", "1", "1", "1", " ", "1", "1", "1", "1"," ", " ", " ", "1", "1"},
            {"  ","1", "1", " ", " ", " ", " ", " ", "1", " ", " ", " ", " ", " ", "1", "1", "1","1", "1", " ", "1", "1"},
            {"  ","1", "1", " ", "1", "1", "1", "1", "1", "1", "1", " ", "1", " ", "1", "1", "1","1", "1", " ", " ", "1"},
            {"  ","1", "1", " ", "1", "1", "1", "1", "1", "1", "1", " ", "1", " ", "1", "1", " "," ", " ", " ", "1", "1"},
            {"  ","1", "1", " ", " ", " ", "1", "1", "1", "1", "1", " ", "1", " ", "1", "1", " ","1", "1", " ", "1", "1"},
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", " ", " ", " ", " ", " ","1", "1", " ", " ", "1"},
            {"  ","1", " ", " ", " ", "1", " ", "1", " ", " ", " ", "1", "1", "1", "1", " ", "1","1", "1", "1", " ", "1"},
            {"  ","1", "1", "1", " ", "1", " ", "1", " ", "1", " ", "1", "1", "1", "1", " ", "1","1", "1", "1", " ", "1"},
            {"  ","1", "1", "1", " ", "1", " ", "1", " ", "1", " ", "1", "1", "1", "1", " ", "1","1", "1", "1", " ", "1"},
            {"  ","1", "1", " ", " ", " ", " ", " ", " ", "1", " ", " ", " ", " ", "1", " ", "1","1", "1", "1", " ", "1"},
            {"  ","1", "1", " ", "1", "1", "1", "1", "1", "1", " ", "1", "1", " ", "1", " ", " ","1", "1", "1", " ", "1"},
            {"  ","1", " ", " ", "1", " ", "1", " ", " ", " ", " ", "1", "1", " ", " ", " ", " ","1", " ", " ", " ", "1"},
            {"  ","1", " ", "1", "1", " ", "1", "1", "1", "1", "1", "1", "1", " ", "1", "1", " ","1", "1", " ", "1", "1"},
            {"  ","1", " ", "1", " ", " ", " ", " ", " ", " ", " ", "1", "1", " ", "1", "1", " ","1", "1", " ", "1", "1"},
            {"  ","1", " ", " ", " ", "1", "1", " ", "1", "1", " ", " ", "1", " ", "1", "1", " ","1", "1", " ", " ", "1"},
            {"  ","1", "1", "1", " ", " ", " ", " ", "1", " ", " ", " ", " ", "1", " ", "1", " ","1", "1", "1", "1", "1"},
            {"  ","1", "1", "1", " ", "1", "1", "1", "1", " ", "1", " ", "1", "1", " ", "1", " "," ", " ", " ", "1", "1"},
            {"  ","1", "1", "1", " ", " ", "1", " ", " ", " ", "1", " ", "1", " ", " ", "1", " ","1", " ", "1", "1", "1"},
            {"  ","X", " ", " ", "1", "1", " ", " ", "1", " ", "1", " ", "1", " ", "1", "1", "1"," ", " ", " ", " ", "1"},
            {"  ","1", "1", " ", " ", " ", " ", "1", "1", " ", " ", "1", " ", " ", " ", " ", " "," ", "1", " ", "1", "1"},
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1","1", "1", "1", "1", "1"}};
        return matriz;
    }

   	public String[][] muitodificil() //cria a matriz do labirinto nivel muito dificil
    {
    	String[][] matriz = {
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1","1", "1", "1","1","  "},
            {"  ","1", "1", " ", "1", " ", "1", "1", "1", " ", " ", "1", " ", "1", "1", " ", "1", "1", "1", " "," ", " ", "1","1","  "},
            {"  ","1", " ", " ", " ", " ", " ", " ", "1", " ", "1", "1", " ", " ", " ", " ", " ", "1", " ", " ","1", " ", " ","1","  "},
            {"  ","1", " ", "1", "1", "1", "1", " ", "1", " ", " ", " ", " ", "1", "1", "1", " ", "1", "1", " ","1", "1", " ","1","  "},
            {"  ","1", " ", " ", " ", " ", "1", " ", "1", " ", "1", "1", "1", "1", " ", " ", " ", "1", "1", " "," ", " ", " ","1","  "},
            {"  ","1", " ", "1", "1", " ", "1", " ", "1", " ", "1", "1", " ", " ", " ", " ", " ", "1", " ", " ","1", "1", " ","1","  "},
            {"  ","1", " ", " ", "1", "1", "1", " ", "1", " ", "1", " ", " ", "1", "1", " ", "1", " ", " ", " ","1", " ", " ","1","  "},
            {"  ","1", "1", " ", " ", " ", "1", " ", " ", " ", "1", " ", "1", "1", " ", "1", " ", "1", " ", " ","1", " ", "1","1","  "},
            {"  ","1", "1", " ", "1", " ", "1", " ", "1", " ", "1", " ", " ", "1", " ", "1", " ", "1", " ", "1","1", " ", "1","1","  "},
            {"  ","1", "1", "1", "1", " ", "1", "1", " ", "1", "1", "1", " ", "1", " ", "1", " ", "1", " ", " ","1", " ", "1","1","  "},
            {"  ","1", " ", " ", " ", " ", " ", "1", " ", "1", " ", " ", " ", " ", " ", " ", " ", "1", " ", "1"," ", " ", " ","1","  "},
            {"  ","1", "1", " ", "1", "1", " ", "1", " ", " ", "1", "1", " ", "1", " ", "1", " ", "1", " ", " ","1", " ", "1","1","  "},
            {"  ","1", " ", " ", " ", "1", "1", "1", " ", "1", "1", "1", "1", "1", "1", " ", " ", "1", " ", "1"," ", " ", "1","1","  "},
            {"  ","1", " ", "1", " ", "1", " ", "1", " ", "1", "1", "1", " ", "1", " ", "1", " ", "1", " ", "1","1", " ", " ","1","  "},
            {"  ","1", " ", "1", " ", " ", " ", "1", " ", "1", " ", " ", " ", "1", " ", "1", " ", "1", " ", "1","1", " ", "1","1","  "},
            {"  ","1", " ", "1", "1", "1", "1", " ", " ", "1", "1", "1", " ", " ", " ", "1", " ", " ", " ", " ","1", " ", " ","X","  "},
            {"  ","1", " ", "1", "1", " ", "1", "1", " ", "1", "1", "1", " ", "1", " ", "1", "1", "1", "1", "1","1", "1", "1","1","  "},
            {"  ","1", " ", " ", " ", " ", "1", " ", " ", " ", " ", " ", " ", "1", " ", " ", " ", " ", " ", " ","1", " ", " ","*","  "},
            {"  ","1", "1", " ", "1", "1", "1", "1", "1", "1", " ", "1", "1", " ", "1", " ", "1", "1", " ", "1","1", " ", "1","1","  "},
            {"  ","1", "1", " ", "1", "1", " ", "1", " ", "1", " ", "1", "1", " ", "1", "1", "1", "1", " ", "1","1", " ", " ","1","  "},
            {"  ","1", " ", " ", " ", " ", " ", " ", " ", "1", " ", "1", "1", " ", " ", " ", " ", "1", " ", "1"," ", " ", "1","1","  "},
            {"  ","1", "1", "1", "1", "1", "1", " ", " ", "1", " ", " ", " ", " ", "1", " ", "1", " ", " ", " ","1", " ", "1","1","  "},
            {"  ","1", " ", " ", " ", "1", " ", " ", " ", "1", "1", "1", "1", "1", "1", " ", "1", " ", "1", "1","1", " ", " ","1","  "},
            {"  ","1", " ", "1", "1", "1", " ", "1", " ", " ", " ", "1", " ", " ", " ", " ", "1", " ", " ", " ","1", " ", "1","1","  "},
            {"  ","1", " ", " ", " ", " ", " ", "1", "1", "1", " ", " ", " ", "1", " ", "1", "1", " ", "1", "1","1", " ", "1","1","  "},
            {"  ","1", "1", "1", " ", "1", "1", "1", "1", "1", " ", "1", " ", "1", " ", "1", "1", " ", "1", " "," ", " ", "1","1","  "},
            {"  ","1", "1", "1", " ", "1", "1", "1", "1", "1", " ", "1", " ", "1", " ", " ", "1", " ", "1", " ","1", "1", "1","1","  "},
            {"  ","1", " ", " ", " ", "1", "1", "1", "1", "1", " ", "1", " ", " ", " ", "1", " ", " ", "1", " ","1", "1", "1","1","  "},
            {"  ","1", "1", "1", " ", "1", "1", "1", "1", "1", " ", "1", " ", "1", " ", "1", "1", " ", " ", " ","1", "1", "1","1","  "},
            {"  ","1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1","1", "1", "1","1","  "}};
        return matriz;
    }
}