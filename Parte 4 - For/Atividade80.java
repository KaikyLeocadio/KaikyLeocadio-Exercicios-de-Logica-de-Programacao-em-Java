package exercicios_For;

import java.util.Scanner;

public class exer80 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String nome;
	        int soma = 0, cont = 0;
	        while (true) {
	            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
	            nome = scanner.next();
	            if (nome.equalsIgnoreCase("fim")) break;
	            System.out.print("Digite a idade: ");
	            int idade = scanner.nextInt();
	            soma += idade;
	            cont++;
	        }
	        if (cont > 0) {
	            double media = soma / (double) cont;
	            System.out.println("A m�dia das idades �: " + media);
	        } else {
	            System.out.println("Nenhuma idade foi inserida.");
	        }
	        scanner.close();
	    }
	}