package finalizacaoexercicios;

	import java.util.Scanner;
	import java.util.Arrays;

	public class Atividade95 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        String[] nomes = new String[5];
	        
	        System.out.println("Digite 5 nomes:");
	        for (int i = 0; i < 5; i++) {
	            nomes[i] = scanner.nextLine();
	        }
	        
	        Arrays.sort(nomes);
	        
	        System.out.println("Nomes em ordem alfab�tica:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println(nomes[i]);
	        }
	    }
	}
