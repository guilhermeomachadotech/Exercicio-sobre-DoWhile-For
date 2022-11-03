public class Multiplo10 {
	public static void main (String[]args) {
		int i,mult;
		System.out.println ("Esses são os números de 1 z 100 e os números que são múltiplos de 10:");
		for(i=1;i<=100;i++) {
			mult=i%10;
			if(mult==0) {
				System.out.println(i+": Múltiplo de 10.");
			}else {
				System.out.println(i);
			}
		}
	}
}
