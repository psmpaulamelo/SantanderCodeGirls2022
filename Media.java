import java.util.Scanner;
public class Media {
	
public static void main(String[] args) {
 
	
		Scanner scan = new Scanner(System.in);
		String  nome;
		int nota1,nota2,nota3,nota4;
		double media ;
		
		System.out.println("Digite o nome do Aluno");
		nome = scan.next();
		
		System.out.println("Digite a 1º nota do aluno ");
		nota1 = scan.nextInt();	
		
		System.out.println("Digite a 2º nota do aluno ");
		nota2 = scan.nextInt();			
		
		System.out.println("Digite a 3º nota do aluno ");
		nota3 = scan.nextInt();	
		
		System.out.println("Digite a 4º nota do aluno ");
		nota4 = scan.nextInt();	
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		if (media > 7) {
		System.out.println("Aluno aprovado ");
		}
		else if (media < 7) {
		System.out.println("Aluno reprovado");
		} 
		System.out.println("O Aluno "+nome + " teve a media "+ media );	
		}
			
		}

		

		
	


