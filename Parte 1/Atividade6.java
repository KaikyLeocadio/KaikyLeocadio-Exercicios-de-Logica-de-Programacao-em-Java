package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Verificando se o n�mero � par ou impar!");
		
		System.out.println("Insira um n�mero aqui: ");
		int numero = valor.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O n�mero: " + numero + " � par");
		} else {
			System.out.println("O n�mero: " + numero + " � impar");
		}
	}

}
