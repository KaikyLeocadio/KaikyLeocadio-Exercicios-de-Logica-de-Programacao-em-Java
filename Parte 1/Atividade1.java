package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner (System.in);
		
		System.out.println("Exibindo a soma, subtra��o, multiplica��o e divis�o!");
		
		System.out.println("Insira o primeiro n�mero");
		int numero1 = numero.nextInt();
		
		System.out.println("Insira o segundo n�mero");
		int numero2 = numero.nextInt();
		
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
		
		System.out.println("A soma dos n�meros �: " + soma);
		System.out.println("A subtra��o dos n�meros �: " + subtracao);
		System.out.println("A multiplica��o dos n�meros �: " + multiplicacao);
		System.out.println("A divis�o dos n�meros �: " + divisao);
	}

}
