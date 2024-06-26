package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Insira sua idade aqui: ");
        int idade = valor.nextInt();
        
        if (idade >= 60) {
            System.out.println("Você é idoso!");
        } else if (idade >= 18) {
            System.out.println("Você é adulto!");
        } else if (idade >= 14) {
            System.out.println("Você é adolescente!");
        } else {
            System.out.println("Você é criança!");
        }
    }
}