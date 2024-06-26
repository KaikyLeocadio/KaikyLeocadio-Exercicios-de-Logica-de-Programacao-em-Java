package finalizacaoexercicios;

	import java.util.Scanner;

	public class Atividade89 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Vetor para armazenar os 10 n�meros inteiros
	        int[] numeros = new int[10];
	        
	        int positivos = 0;
	        int negativos = 0;
	        
	        //Lendo os 10 n�meros inteiros
	        System.out.println("Digite 10 n�meros inteiros:");
	        for (int i = 0; i < 10; i++) {
	            numeros[i] = scanner.nextInt();
	        }
	        
	        //Verificando se os n�meros s�o positivos ou negativos
	        for (int i = 0; i < 10; i++) {
	            if (numeros[i] > 0) {
	                positivos++;
	            } else if (numeros[i] < 0) {
	                negativos++;
	            }
	        }
	        
	        System.out.println("Quantidade de n�meros positivos: " + positivos);
	        System.out.println("Quantidade de n�meros negativos: " + negativos);
	    }
	}
