package finalizacaoexercicios;

	import java.util.Scanner;

	public class Atividade25 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o n�mero de faltas do aluno:");
	        int faltas = scanner.nextInt();
	        
	        if (faltas > 15) {
	            System.out.println("O aluno est� reprovado por falta.");
	        } else {
	            System.out.println("O aluno n�o est� reprovado por falta.");
	        }
	    }
	}