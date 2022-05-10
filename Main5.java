package media;
import java.util.Scanner;

public class Main5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao boletim eletronico");
		System.out.println();
		System.out.println("Informe o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Cadastre seu login com os tres primeiros digitos do seu CPF: ");
		int login = sc.nextInt();
		System.out.println("Cadastre uma senha com quatro números: ");
		int senha = sc.nextInt();
		
		System.out.println("Informe o seu login cadastrado: ");
		int loginCadastrado = sc.nextInt();
		while(login != loginCadastrado) {
		    System.out.println("Informe o seu login novamente: ");
		    loginCadastrado = sc.nextInt();
		}
		System.out.println("Informe a sua senha cadastrada: ");
		int senhaCadastrada = sc.nextInt();		
		while(senhaCadastrada != senha) {
		    System.out.println("Informe a sua senha cadastrada novamente: ");
		    senhaCadastrada = sc.nextInt();
		}
		System.out.println("Dados:");
		System.out.printf("LOGIN: %s %nSENHA: %d %n",login,senha);
		System.out.println("Informe a disciplina: 'digite 1 para matematica, 2 para fisica' ");
		int disciplina = sc.nextInt();
		if(disciplina == 1) {
		    System.out.println("Informe o numero de faltas: ");
		    int falta = sc.nextInt();
		    if(falta > 7){
		        System.out.println("Reprovado por falta");
		        System.exit(0);
		    }
		    System.out.println("Informe a primeira nota: ");
		    double nota1 = sc.nextDouble();
		    System.out.println("Informe a segunda nota: ");
		    double nota2 = sc.nextDouble();
		    System.out.println("Informe a terceira nota: ");
		    double nota3 = sc.nextDouble();
		    double media = (nota1+nota2+nota3)/3;
		    if(media < 5){
		        System.out.printf("Média: %.2f - Reprovado por média",media);
		    }
		    else if(media < 7){
		        System.out.printf("Média: %.2f - Recuperação",media);
		    }
		    else{
		        System.out.printf("Média: %.2f - Aprovado por média",media);
		    }
		}
		else if(disciplina == 2) {
		    System.out.println("Informe a primeira nota: ");
		    double nota1 = sc.nextDouble();
		    System.out.println("Informe a segunda nota: ");
		    double nota2 = sc.nextDouble();
		    System.out.println("Informe a terceira nota: ");
		    double nota3 = sc.nextDouble();
		    double media = (nota1+nota2+nota3)/3;
		    if(media < 5){
		        System.out.printf("Média: %.2f - Reprovado por média",media);
		    }
		    else if(media < 7){
		        System.out.printf("Média: %.2f - Recuperação",media);
		    }
		    else{
		        System.out.printf("Média: %.2f - Aprovado por média",media);
		    }
		
		
		
		sc.close();
	}
}
}
