package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Calculando a média aritmética!");
		
		System.out.println("Insira o primeiro valor: ");
		int valor1 = valor.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		int valor2 = valor.nextInt();
		
		System.out.println("Insira o terceiro valor: ");
		int valor3 = valor.nextInt();
		
		int media = (valor1 + valor2 + valor3) / 3;
		
		System.out.println("A média aritmética é: " + media);
	}

}
