package edunova;

public class Z012TriangularNumber {
	public static void main(String[] args) {
		long rezultat;
		for(long i=1;;i++) {
			rezultat=brojDjelitelja(triangularBroj(i));
			if(rezultat>500) {
				System.out.println(triangularBroj(i));
				break;
			}
		}
		

		
	}
	
	public static long triangularBroj(long koliko) {
		long broj=0;
		for(int i=1;i<=koliko;i++) {
			broj=(i*(i+1))/2;
			
		}
		return broj;
	}
	
	public static int brojDjelitelja(long broj) {
		int counter=0;
		for(int i=1;i*i<=broj;i++) {
			if(broj%i==0) {
				counter++;
			}
		}
		return counter*2;
	}
	
}
