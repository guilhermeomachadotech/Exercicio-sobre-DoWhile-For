import java.util.Scanner;
public class IdadeVelhoIdadeNovo {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int maiorIdade=-1,menorIdade=1000, idade, i, anoAtual,anoNascto;
		System.out.println("Digite o ano atual:");
		anoAtual=ler.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println("Digite o ano de nascimento do "+i+"� usu�rio:");
			anoNascto=ler.nextInt();
			idade=anoAtual-anoNascto;
			System.out.println("A idade do "+i+"� usu�rio � "+idade);
			if(idade>maiorIdade) {
				maiorIdade=idade;
			}else if(idade<menorIdade) {
				menorIdade=idade;
			}
		}
		System.out.println ("A idade mais velha � "+maiorIdade+" anos e a idade mais novo � "+menorIdade+" anos");
		ler.close();
	}
}
