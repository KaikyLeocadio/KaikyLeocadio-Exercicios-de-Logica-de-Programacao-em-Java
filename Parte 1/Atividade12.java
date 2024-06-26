package exerciciosjavadebbs;

import java.util.Scanner;

public class Atividade12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner valor = new Scanner(System.in);
        
        System.out.println("Insira seu peso:");
        float peso = valor.nextFloat();
        
        System.out.println("Insira sua altura:");
        float altura = valor.nextFloat();
        
        // Corrigir o cálculo do IMC
        float calculoIMC = peso / (altura * altura);
        
        // Exibir o resultado com duas casas decimais
        System.out.printf("O seu IMC é: %.2f\n", calculoIMC);
        
    }
}
