package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Insira um valor aqui:");
		int numero = valor.nextInt();
		
		if (numero < 0) {
			System.out.println("O n�mero � negativo");
		} else if (numero > 0) {
			System.out.println("O n�mero � positivo");
		} else {
			System.out.println("O n�mero � zero");
		}
	}

}
