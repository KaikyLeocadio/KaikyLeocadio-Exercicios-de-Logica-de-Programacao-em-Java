package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Calculando a �rea e per�metro do c�rculo!");
		
		System.out.println("Insira o raio do c�rculo: ");
		int raio = valor.nextInt();
		
		double area = (raio * raio) * Math.PI;
	    double perimetro = 2 * Math.PI * raio;
		
		System.out.println("O valor da �rea �: " + String.format("%.2f", area));
		System.out.println("O valor do per�metro �: " + String.format("%.2f", perimetro));
	}

}
