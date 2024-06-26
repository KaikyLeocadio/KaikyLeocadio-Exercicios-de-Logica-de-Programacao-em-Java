package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Verificando se o número é par ou impar!");
		
		System.out.println("Insira um número aqui: ");
		int numero = valor.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número: " + numero + " é par");
		} else {
			System.out.println("O número: " + numero + " é impar");
		}
	}

}
