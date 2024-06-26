package finalizacaoexercicios;


	import java.util.Scanner;

	public class Atividade91 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int[] numeros = new int[10];
	        
	        int somaPositivos = 0;
	        int somaNegativos = 0;
	        
	        System.out.println("Digite 10 n�meros inteiros:");
	        for (int i = 0; i < 10; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        
	        for (int i = 0; i < 10; i++) {
	            if (numeros[i] > 0) {
	                somaPositivos += numeros[i];
	            } else if (numeros[i] < 0) {
	                somaNegativos += numeros[i];
	            }
	        }
	        
	        System.out.println("Soma dos valores positivos: " + somaPositivos);
	        System.out.println("Soma dos valores negativos: " + somaNegativos);
	    }
	}
