package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Insira o valor a ser depositado mensalmente: ");
		double money = valor.nextDouble();
		
		System.out.println("Insira a taxa de juros mensal em porcentagem: ");
		double tax = valor.nextDouble() /100; //transformando o valor em decimal, tipo: 5 vira 0.05
		
		double montante = 0;
		for (int i = 1; i <= 12; i++) {
			montante = (montante + money) * (1 + tax); //o 1 é para o calculo ser feito corretamente, em vez de 0.05, fica 1.05 e sequencialmente...
		}
		
		System.out.println("O montante após 12 meses é: " + String.format("%.2f", montante));
		
	}

}
