package finalizacaoexercicios;


	import java.util.Scanner;

	public class Atividade24 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o primeiro n�mero:");
	        int num1 = scanner.nextInt();
	        
	        System.out.println("Digite o segundo n�mero:");
	        int num2 = scanner.nextInt();
	        
	        System.out.println("Digite o terceiro n�mero:");
	        int num3 = scanner.nextInt();
	        
	        int temp;

	        // Ordenando os n�meros usando compara��o direta
	        if (num1 > num2) {
	            temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }

	        if (num1 > num3) {
	            temp = num1;
	            num1 = num3;
	            num3 = temp;
	        }

	        if (num2 > num3) {
	            temp = num2;
	            num2 = num3;
	            num3 = temp;
	        }

	        System.out.println("Os n�meros em ordem crescente s�o: " + num1 + ", " + num2 + ", " + num3);
	    }
	}
