package finalizacaoexercicios;

	import java.util.Scanner;

	public class Atividade93 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int[] numeros = new int[10];
	        
	        int contador = 0;
	        
	        System.out.println("Digite 10 números inteiros:");
	        for (int i = 0; i < 10; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        
	        for (int i = 0; i < 10; i++) {
	            if (numeros[i] >= 10 && numeros[i] <= 50) {
	                contador++;
	            }
	        }
	        
	        System.out.println("Quantidade de números no intervalo de 10 a 50: " + contador);
	    }
	}
