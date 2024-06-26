package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		System.out.println("Insira sua idade em anos aqui:");
		int idade = valor.nextInt();
		
		System.out.println("Insira sua idade em meses aqui:");
		int idademes = valor.nextInt();
		
		System.out.println("Insira sua idade em dias:");
		int idadedias = valor.nextInt();
		
		int tempovida = (idade * 365) + (idademes * 30) + idadedias;
		
		System.out.println("Você tem " + tempovida + " dias de vida");
	}

}
