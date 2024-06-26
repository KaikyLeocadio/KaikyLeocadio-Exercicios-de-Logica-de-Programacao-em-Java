package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner (System.in);
		
		System.out.println("Exibindo a soma, subtração, multiplicação e divisão!");
		
		System.out.println("Insira o primeiro número");
		int numero1 = numero.nextInt();
		
		System.out.println("Insira o segundo número");
		int numero2 = numero.nextInt();
		
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A subtração dos números é: " + subtracao);
		System.out.println("A multiplicação dos números é: " + multiplicacao);
		System.out.println("A divisão dos números é: " + divisao);
	}

}
