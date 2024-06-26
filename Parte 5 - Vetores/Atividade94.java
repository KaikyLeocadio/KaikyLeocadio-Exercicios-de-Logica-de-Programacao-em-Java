package finalizacaoexercicios;


	import java.util.Scanner;

	public class Atividade94 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int[] numeros = new int[7];

	        System.out.println("Digite 7 números inteiros:");
	        for (int i = 0; i < 7; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        
	        System.out.println("Números pares:");
	        for (int i = 0; i < 7; i++) {
	            if (numeros[i] % 2 == 0) {
	                System.out.println(numeros[i]);
	            }
	        }
	    }
	}
