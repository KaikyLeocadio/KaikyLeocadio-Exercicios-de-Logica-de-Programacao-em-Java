package finalizacaoexercicios;


	import java.util.Scanner;

	public class Atividade90 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int[] numeros = new int[5];
	        
	        boolean encontrouZero = false;
	        
	        System.out.println("Digite 5 números inteiros:");
	        for (int i = 0; i < 5; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        
	        for (int i = 0; i < 5; i++) {
	            if (numeros[i] == 0) {
	                encontrouZero = true;
	                break;
	            }
	        }
	        
	        if (encontrouZero) {
	            System.out.println("Há pelo menos um número igual a zero.");
	        } else {
	            System.out.println("Não há números iguais a zero.");
	        }
	    }
	}
