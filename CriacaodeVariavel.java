import java.util.Scanner;

public class CriacaodeVariavel {

	// Exemplo de criação de variavel 
	
	public static void main(String[] args) {

		String nome = new String ();
		String sobrenome = new String ();
		int idade;
		float peso ;
		String  sexo = "feminino";
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Digite o nome do usuario ");
		nome = scan.next();
		
		System.out.println("Digite o sobrenome do usuario ");
		sobrenome = scan.next();
		
		System.out.println(" Digite a idade do usuario");
		idade= scan.nextInt();
		
		System.out.println("Digite  o peso do usuario");
		peso= scan.nextFloat();
		
		System.out.println("Digite o sexo do usuario");
		sexo = scan.next();
		sexo.equals(sexo);
		
		System.out.println("Usurario cadastro com sucesso ");
			
		
			
		}
}
	

