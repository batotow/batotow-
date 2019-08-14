package q2;

import java.util.Scanner;

public class InteiroApp 
{
	public static void main(String[] args) {
		Inteiro inteiro = new Inteiro();
		System.out.print("Escreva o numero");
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		inteiro.setNumero(numero);
		System.out.println("Dezena :" + inteiro.getNumero());
	}

}
