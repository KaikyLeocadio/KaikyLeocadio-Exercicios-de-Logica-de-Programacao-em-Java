package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor aqui: ");
		int valor1 = valor.nextInt();
		
		System.out.println("Insira o segundo valor aqui: ");
		int valor2 = valor.nextInt();
		
		int troca1 = valor2;
		int troca2 = valor2 = valor1;
		
		System.out.println("Primeiro valor:" + troca1 + " Segundo valor:" + troca2);
	}

}
