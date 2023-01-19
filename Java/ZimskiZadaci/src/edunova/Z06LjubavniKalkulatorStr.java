package edunova;

import javax.swing.JOptionPane;

public class Z06LjubavniKalkulatorStr {
	public static void main(String[] args) {
		String imeA = obavezanString("Upisi svoje ime").replaceAll("\\s+", "");
		String imeB = obavezanString("Upisi ime simpatije").replaceAll("\\s+", "");

//----------------------Za ispis odkomentiraj + linija 42 i 62-------------
		System.out.println(imeA + " i " + imeB);
		System.out.println(brojSlova(imeA, imeB));
		System.out.println(prvikorak(brojSlova(imeA, imeB), imeA.length(), imeB.length()));
//---------------------------------------------------------

		System.out.print(imeA + " i " + imeB + " se vole "
				+ kalkulator(prvikorak(brojSlova(imeA, imeB), imeA.length(), imeB.length())) + "%");

	}
	

	public static String kalkulator(String medjuzbroj) {
		String izracun = "";
		if (Integer.parseInt(medjuzbroj) <= 100) {

			return medjuzbroj;
		}

		else {

			if (medjuzbroj.length() % 2 == 0) {
				for (int i = 0; i < medjuzbroj.length() / 2; i++) {

					izracun += (brojNaIndexu(medjuzbroj, i)
							+ brojNaIndexu(medjuzbroj, (medjuzbroj.length() - (1 + i))));

				}

				if (Integer.parseInt(izracun) <= 100) {
					return kalkulator(izracun);

				} else {
					System.out.println(izracun);
					return kalkulator(izracun);
				}

			} else {

				for (int i = 0; i < (medjuzbroj.length() / 2) + 1; i++) {
					if (i >= ((medjuzbroj.length() / 2))) {
						izracun += 0 + brojNaIndexu(medjuzbroj, i);
					} else {
						izracun += (brojNaIndexu(medjuzbroj, i)
								+ brojNaIndexu(medjuzbroj, (medjuzbroj.length() - (1 + i))));

					}

				}
				if (Integer.parseInt(izracun) <= 100) {
					return kalkulator(izracun);

				} else {
					System.out.println(izracun);
					return kalkulator(izracun);
				}

			}

		}

	}

	public static String brojSlova(String imeA, String imeB) {

		String zajedno = (imeA + imeB).toLowerCase();
		String brSlova = "";
		int counter = 0;

		for (int i = 0; i < zajedno.length(); i++) {
			counter = 0;
			for (int j = 0; j < zajedno.length(); j++) {
				if (zajedno.charAt(i) == zajedno.charAt(j)) {
					counter++;
				}
			}
			brSlova += counter;

		}

		return brSlova;

	}

	public static String prvikorak(String brojSlova, int imeADuzina, int imeBduzina) {
		String medjuzbroj = "";

		if (imeBduzina > imeADuzina) {
			for (int i = 0, counter = 0; counter < imeBduzina; counter++, i++) {
				if (counter >= imeADuzina) {
					medjuzbroj += (0 + brojNaIndexu(brojSlova, (brojSlova.length() - (1 + i))));
				} else {
					medjuzbroj += (brojNaIndexu(brojSlova, i)
							+ brojNaIndexu(brojSlova, (brojSlova.length() - (1 + i))));

				}

			}
			return medjuzbroj;

		} else {
			for (int i = 0, counter = 0; counter < imeADuzina; counter++, i++) {
				if (counter >= imeBduzina) {
					medjuzbroj += (0 + brojNaIndexu(brojSlova, (brojSlova.length() - (1 + i))));
				} else {
					medjuzbroj += (brojNaIndexu(brojSlova, i)
							+ brojNaIndexu(brojSlova, (brojSlova.length() - (1 + i))));

				}

			}
		}
		return medjuzbroj;

	}

	public static int brojNaIndexu(String unos, int index) {
		return Integer.parseInt(unos.valueOf(unos.charAt(index)));

	}

	public static String obavezanString(String poruka) {
		String s = "";
		while (s.isEmpty()) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.length() > 0) {
				return s;
			}
		}
		return "";

	}

}
