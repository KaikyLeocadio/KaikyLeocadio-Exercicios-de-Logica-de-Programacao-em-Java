package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        // Verifica se num1 é múltiplo de num2
        if (num1 % num2 == 0) { //verifica se há resto na divisão, caso tenha, não é multiplo
            System.out.println(num1 + " é múltiplo de " + num2);
        } else {
            System.out.println(num1 + " não é múltiplo de " + num2);
        }
    }
}