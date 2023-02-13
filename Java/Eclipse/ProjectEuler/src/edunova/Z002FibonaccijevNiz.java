package edunova;


public class Z002FibonaccijevNiz {
	public static void main(String[] args) {
//		By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
		
		int Vrijednost=0,Zbroj=1,Brclanova=2;
		int Niz[] = new int[50];
		Niz[0]=0;
		Niz[1]=1;
		
		for(int i=0;Vrijednost<4000000;i++) {
			Vrijednost=Niz[i]+Niz[i+1];
			if(Vrijednost<=4000000) {
				Niz[i+2]=Vrijednost;
				Brclanova++;
			}
			else {
				break;
			}
		}
		
		for(int i=0;i<Brclanova;i++) {
			System.out.print(Niz[i]+" ");
		}
		System.out.println();
		
		for(int i=1;i<Brclanova;i++) {
			if(Niz[i]%2==0) {
				System.out.print(Niz[i]+" ");
				Zbroj+=Niz[i];
			}
		}
		System.out.println();
		System.out.println(Zbroj);
		
		
	

			
			
	}

}
