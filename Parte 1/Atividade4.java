package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Calculando a média ponderada!");

        System.out.print("Insira a primeira nota: ");
        int nota1 = valor.nextInt();
        
        System.out.print("Insira a segunda nota: ");
        int nota2 = valor.nextInt();
        
        System.out.print("Insira a terceira nota: ");
        int nota3 = valor.nextInt();
        
        if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)) {
            System.out.println("Insira notas válidas entre 0 e 10!");
        } else {
            
            int peso1 = 2;
            int peso2 = 3;
            int peso3 = 5;
            
            int somapesos = peso1 + peso2 + peso3;
            double mediaponderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (double) somapesos;
            
            System.out.println("A média ponderada das notas é: " + String.format("%.2f", mediaponderada));
        }

    }
}
