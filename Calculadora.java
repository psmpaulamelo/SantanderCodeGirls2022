import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		
		System.out.println("Digite o 1 numero");
		a= scan.nextInt();
		System.out.println("Digite o 2 numero");
		b=scan.nextInt();
		
		int soma= soma (a,b);
		int subtracao = subtracao (a,b);
		int divisao = divisao (a,b);
		int multiplicacao = multiplicacao (a,b);
		
		
		System.out.println("Soma é: " + soma );
		System.out.println("Subtração  é: " + subtracao );
		System.out.println("Divisao é: " + divisao );
		System.out.println("Multiplicacao é: " + multiplicacao );
		
		
		
	}

	

	private static int multiplicacao(int a, int b) {
		return a*b;
	}

	private static int divisao(int a, int b) {
		return a/b;
	}

	private static int subtracao(int a, int b) {
		return a-b;
	}

	private static int soma(int a, int b) {
		return a+b;
	}

	}
	

