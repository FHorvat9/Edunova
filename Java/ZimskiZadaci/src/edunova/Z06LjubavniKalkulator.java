package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z06LjubavniKalkulator {
	public static void main(String[] args) {
		String imeA = JOptionPane.showInputDialog("Upisi prvo ime");
		String imeB = JOptionPane.showInputDialog("Upisi drugo ime");

//		System.out.println(prviKorak(brojSlova(imeA, imeB), imeA.length(), imeB.length()));
		System.out.println(imeA + imeB);
		System.out.println(Arrays.toString(brojSlova(imeA, imeB)));
		System.out.println(Arrays.toString(prviKorak(brojSlova(imeA, imeB), imeA.length(), imeB.length())));
		ljubavniKalkulator(prviKorak(brojSlova(imeA, imeB), imeA.length(), imeB.length()));

	}

	public static int[] prviKorak(int brojslova[], int imeADuzina, int imeBDuzina) {

		if (imeADuzina >= imeBDuzina) {
			int medjuzbroj[] = new int[imeADuzina];
			for (int i = 0, j = 0, c = 0; c < imeADuzina; i++, j++, c++) {
				if (i >= imeBDuzina) {
					medjuzbroj[c] = 0 + brojslova[brojslova.length - (j + 1)];
				} else {
					medjuzbroj[c] = brojslova[i] + brojslova[brojslova.length - (j + 1)];
				}

			}

			return medjuzbroj;

		} else {
			int medjuzbroj[] = new int[imeBDuzina];
			for (int i = 0, j = 0, c = 0; c < imeBDuzina; i++, j++, c++) {
				if (i >= imeADuzina) {
					medjuzbroj[c] = 0 + brojslova[brojslova.length - (j + 1)];
				} else {
					medjuzbroj[c] = brojslova[i] + brojslova[brojslova.length - (j + 1)];
				}

			}
			return medjuzbroj;

		}

	}

	public static int[] brojSlova(String ime1, String ime2) {

		// Unosimo dva stringa i metoda vraca broj ponavljanja svakog slova u polju

		String zajedno = ime1 + ime2;
		int counter = 0;

		char a[] = (zajedno.toLowerCase()).toCharArray();

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

		return brojevi;
	}

	public static int[] ljubavniKalkulator(int brojslova[]) {
		int[] aa = new int[2];
		if (brojslova.length < 2) {
		} else {
			if (brojslova.length % 2 == 0) {
				int[] medjubroj = new int[brojslova.length / 2];
				for (int i = 0, j = 0; i < brojslova.length / 2; i++, j++) {
					medjubroj[i] = brojslova[i] + brojslova[brojslova.length - (1 + j)];

				}
				System.out.println(Arrays.toString(medjubroj));

				ljubavniKalkulator(medjubroj);
			}

			else {
				int[] medjubroj = new int[(brojslova.length / 2) + 1];
				for (int i = 0, j = 0; i <= brojslova.length / 2; i++, j++) {
					if(i==(brojslova.length / 2) + 1) {
						medjubroj[i]=0+brojslova[i];
					}else {
						medjubroj[i] = brojslova[i] + brojslova[brojslova.length - (1 + j)];
					}
					
					

				}
				System.out.println(Arrays.toString(medjubroj));
				ljubavniKalkulator(medjubroj);
			}

		}
		return aa;
	}

}