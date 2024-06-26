package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Calculando a área e perímetro do círculo!");
		
		System.out.println("Insira o raio do círculo: ");
		int raio = valor.nextInt();
		
		double area = (raio * raio) * Math.PI;
	    double perimetro = 2 * Math.PI * raio;
		
		System.out.println("O valor da área é: " + String.format("%.2f", area));
		System.out.println("O valor do perímetro é: " + String.format("%.2f", perimetro));
	}

}
