package finalizacaoexercicios;


	import java.util.Scanner;
	import java.util.Arrays;
	import java.util.Collections;

	public class Atividade92 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        Integer[] numeros = new Integer[5];
	        
	        System.out.println("Digite 5 n�meros inteiros:");
	        for (int i = 0; i < 5; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        
	        Arrays.sort(numeros, Collections.reverseOrder());
	        
	        System.out.println("Os n�meros em ordem decrescente s�o:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println(numeros[i]);
	        }
	    }
	}
