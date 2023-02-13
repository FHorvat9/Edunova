package edunova;

public class Z04 {
	// Metoda prima niz cijelih brojeva
	// Metoda vraća
	// zbroj svih parnih brojeva
	// u primljenom nizu

	public static int zbrojParnih(int polje[]) {
		int zbroj = 0;
		for (int i : polje) {
			if (i % 2 == 0) {
				zbroj += i;
			}

		}
		return zbroj;
	}
}
