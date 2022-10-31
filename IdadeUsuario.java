import java.util.Scanner;
public class IdadeUsuario {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int i=1, anoNascto, anoAtual, idade;
		do {
			System.out.println("Digite o ano de nascimento:");
			anoNascto=ler.nextInt();
			System.out.println("Digite o ano atual:");
			anoAtual=ler.nextInt();
			idade=anoAtual-anoNascto;
			System.out.println("O usuário tem "+idade+" anos.");
			if (idade<18) {
				System.out.println("Menor de idade.");
			}else {
				System.out.println("Maior de idade.");
			}
			System.out.println("Deseja continuar a execução? (Digite 1-para SIM ou 2-para NÃO).");
			i=ler.nextInt();
		}while(i==1);
		System.out.println("Fim do programa.");
		ler.close();
	}
}
