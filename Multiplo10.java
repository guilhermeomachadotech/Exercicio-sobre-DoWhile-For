public class Multiplo10 {
	public static void main (String[]args) {
		int i,mult;
		System.out.println ("Esses s�o os n�meros de 1 z 100 e os n�meros que s�o m�ltiplos de 10:");
		for(i=1;i<=100;i++) {
			mult=i%10;
			if(mult==0) {
				System.out.println(i+": M�ltiplo de 10.");
			}else {
				System.out.println(i);
			}
		}
	}
}
