package finalizacaoexercicios;

	import java.util.Scanner;

	public class Atividade99 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Definindo as matrizes 2x2
	        int[][] matrizA = new int[2][2];
	        int[][] matrizB = new int[2][2];
	        int[][] matrizSoma = new int[2][2]; // matriz para armazenar a soma
	        
	        // Lendo os elementos da primeira matriz
	        System.out.println("Digite os elementos da primeira matriz 2x2:");
	        for (int linha = 0; linha < 2; linha++) {
	            for (int coluna = 0; coluna < 2; coluna++) {
	                matrizA[linha][coluna] = scanner.nextInt();
	            }
	        }
	        
	        // Lendo os elementos da segunda matriz
	        System.out.println("Digite os elementos da segunda matriz 2x2:");
	        for (int linha = 0; linha < 2; linha++) {
	            for (int coluna = 0; coluna < 2; coluna++) {
	                matrizB[linha][coluna] = scanner.nextInt();
	            }
	        }
	        
	        // Calculando a soma das matrizes
	        for (int linha = 0; linha < 2; linha++) {
	            for (int coluna = 0; coluna < 2; coluna++) {
	                matrizSoma[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
	            }
	        }
	        
	        // Exibindo a matriz resultante (soma das duas matrizes)
	        System.out.println("A matriz resultante da soma é:");
	        for (int linha = 0; linha < 2; linha++) {
	            for (int coluna = 0; coluna < 2; coluna++) {
	                System.out.print(matrizSoma[linha][coluna] + " ");
	            }
	            System.out.println(); // nova linha para cada linha da matriz
	        }
	    }
	}
