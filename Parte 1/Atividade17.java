package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Insira sua idade aqui: ");
        int idade = valor.nextInt();
        
        if (idade >= 60) {
            System.out.println("Voc� � idoso!");
        } else if (idade >= 18) {
            System.out.println("Voc� � adulto!");
        } else if (idade >= 14) {
            System.out.println("Voc� � adolescente!");
        } else {
            System.out.println("Voc� � crian�a!");
        }
    }
}