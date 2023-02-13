package edunova;

public class Z007NPrime {
	public static void main(String[] args) {
		int provjera=0;
		int counter=0;
		int Djelitelji[] = new int[10001];
		
		
		
		for (int i = 0; counter<10001; i++) {

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					provjera++;
				}
				if (provjera > 2) {
					provjera = 0;
					break;

				}

			}
//			Upisivanje prostih brojeva u polje
			if (provjera == 2) {
				Djelitelji[counter] = i;
				provjera = 0;
				counter++;
				continue;

			}
			provjera = 0;

		}
		
		System.out.println(Djelitelji[10000]);

	}
	

}
