package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo n�mero inteiro: ");
        int num2 = input.nextInt();

        // Verifica se num1 � m�ltiplo de num2
        if (num1 % num2 == 0) { //verifica se h� resto na divis�o, caso tenha, n�o � multiplo
            System.out.println(num1 + " � m�ltiplo de " + num2);
        } else {
            System.out.println(num1 + " n�o � m�ltiplo de " + num2);
        }
    }
}