package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner (System.in);
		
		System.out.println("Insira o preço do produto:");
		int preco = valor.nextInt();
		
		System.out.println("Insira a quantidade comprada:");
		int quantidade = valor.nextInt();
		
		double valorcompra = preco * quantidade;
		
		if (quantidade > 10) {
			valorcompra = valorcompra * 0.9; //0.9 seria os 90% então teria o desconto de 10%
			System.out.println("Você recebeu um desconto de 10%! Terá de pagar somente: R$" + String.format("%.2f", valorcompra));
		} else { 
			System.out.println("O valor da compra é de: R$" + String.format("%.2f", valorcompra));
	}
  }
}