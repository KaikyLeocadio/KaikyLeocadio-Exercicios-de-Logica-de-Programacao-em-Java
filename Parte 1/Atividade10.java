package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Calculando a tabuada!");
		
		System.out.println("Insira a tabuada desejada aqui: ");
		int tabuada = valor.nextInt();
		
		int contador = 0;
		for (contador = 1; contador <= 10; contador++) {
			System.out.println(tabuada + " X " + contador+ " = " + tabuada * contador);
		}
	}
}