package finalizacaoexercicios;


	import java.util.Scanner;

	public class Atividade98 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        //definindo a matriz 3x3
	        int[][] matriz = new int[3][3];
	        
	        System.out.println("Digite os elementos da matriz 3x3:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matriz[i][j] = scanner.nextInt();
	            }
	        }
	        
	        int somaDiagonal = 0;
	        for (int i = 0; i < 3; i++) {
	            somaDiagonal += matriz[i][i]; //soma os elementos matriz[0][0], matriz[1][1], matriz[2][2]
	        }
	        
	        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonal);
	    }
	}
