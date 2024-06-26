package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Calculando o salário liquido!");
		
		System.out.println("Insira o salário base aqui: ");
		double salario = valor.nextDouble();
		
		double comissão = salario * 0.05;
		
		double salarioliquido =  salario + comissão;
		
		System.out.println("O salário líquido do funcionário é: R$ " + String.format("%.2f", salarioliquido));
	}

}
