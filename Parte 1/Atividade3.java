package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Calculando a �rea do tri�ngulo!");
		
		System.out.println("Insira a base do triangulo: ");
		int base = valor.nextInt();
		
		System.out.println("Insira a altura do triangulo: ");
		int altura = valor.nextInt();
		
		int area = (base * altura) / 2;
		
		System.out.println("A �rea do tri�ngulo �: " + area);
	}

}
