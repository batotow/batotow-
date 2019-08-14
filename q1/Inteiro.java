package q1;

public class Inteiro 
{
	private int numero;
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	public int getAlgarismo() 
	{
		int algaritmo = this.numero; 
		return algaritmo % 10;
	}
	public int getDezena() 
	{
		int dezena = this.numero;
		return ((dezena % 100) - (dezena % 10)) / 10 ;
	}
	public int getCentena() 
	{
		int centena = this.numero;
		return (centena % 1000)  / 100;
		
	}
	
}
