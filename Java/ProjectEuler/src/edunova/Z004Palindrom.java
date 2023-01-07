package edunova;

public class Z004Palindrom {
	public static void main(String[] args) {

//		Find the largest palindrome made from the product of two 3-digit numbers.

		String broj, okrenutibrojS;
		int maxpalindrom = 0;

		for (int x = 100; x < 1000; x++) {
			for (int y = 100; y < 1000; y++) {
//		Prebacuje int u string, a zatim string u polje slova
				broj = Integer.toString(x * y);
				char[] okrenutibroj = broj.toCharArray();

//		Puni polje slova slovima Iz stringa od zadnjeg prema prvom
				for (int i = (broj.length() - 1), j = 0; i >= 0; i--, j++) {
					okrenutibroj[i] = broj.charAt(j);

				}

//		Polje slova vraca u string
				okrenutibrojS = String.valueOf(okrenutibroj);

//				Usporedjuje vrjednosti stringova i ako su jednaki znaci da je pocetni broj palindrom
				if (okrenutibrojS.equalsIgnoreCase(broj)) {

					if (maxpalindrom < Integer.parseInt(broj)) {
						maxpalindrom = Integer.parseInt(broj);

					}

				}
			}
		}
		System.out.println(maxpalindrom);
	}
}
