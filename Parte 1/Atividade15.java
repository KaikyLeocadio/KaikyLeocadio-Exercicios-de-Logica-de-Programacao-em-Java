package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Insira o seu sal�rio aqui:");
		double salario = valor.nextDouble();
		
		double aumento = (salario * 0.15) + salario;
		
		System.out.println("O seu sal�rio com aumento de 15% � de: R$" + aumento);
	}

}