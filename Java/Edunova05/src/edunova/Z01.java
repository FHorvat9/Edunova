package edunova;

public class Z01 {
	public static void main(String[] args) {
		// while petljom ispisati 
		// zbroj prvih 100 brojeva
		int i=1,zbroj=0;
		
		while(i<=100) {
			zbroj+=i++;
		}
		System.out.println(zbroj);
	}

}
