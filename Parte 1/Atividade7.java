package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Calculando o sal�rio liquido!");
		
		System.out.println("Insira o sal�rio base aqui: ");
		double salario = valor.nextDouble();
		
		double comiss�o = salario * 0.05;
		
		double salarioliquido =  salario + comiss�o;
		
		System.out.println("O sal�rio l�quido do funcion�rio �: R$ " + String.format("%.2f", salarioliquido));
	}

}
