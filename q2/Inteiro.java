package q2;

public class Inteiro 
{
	private int numero;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		int dezena = this.numero; 
		return ((dezena % 100) - (dezena % 10)) / 10 ;
		
	}
	
}