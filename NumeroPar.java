
public class NumeroPar {
	public static void main (String []args) {
		int i=0, par;
		System.out.println ("Esses s�o os n�meros pares de 0 a 500");
		do {
			par=i%2;
			if(par==0) {
				System.out.println (i);
			}
			i++;
		}while (i<=500);
	}
}
