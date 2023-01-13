package edunova;



public class Z06LjubavniKalkulator {
	public static void main(String[] args) {
		String imeA = "Iva";
		String imeB = "Emanueleduardodasilva";

		int brojslova[] = brojSlova(imeA, imeB);
		

		System.out.println(ljubavniKalkulator(brojslova));

	}

	public static int ljubavniKalkulator(int brojslova[]) {
		int counter;
		
		
		
		
	
		
		
		
		
		


		return 0;
	}
	
	
	

	public static int[] brojSlova(String ime1, String ime2) {

		// Unosimo dva stringa i metoda vraca broj ponavljanja svakog slova u polju


		String zajedno = ime1 + ime2;
		int counter = 0;

		char a[] = (zajedno.toLowerCase()).toCharArray();
//		obrisi
		for (char c : a) {
			System.out.print(c);

		}
		System.out.println();
//		---
		int brojevi[] = new int[zajedno.length()];

		for (int i = 0; i <= (zajedno.length() - 1); i++) {
			counter = 0;
			for (int j = 0; j <= (zajedno.length() - 1); j++) {
				if (a[i] == a[j]) {
					counter++;
				}

			}
			brojevi[i] = counter;
		}
//		obrisi
		for (int i : brojevi) {
			System.out.print(i);
		}
		System.out.println();
//		------

		return brojevi;
	}

}
