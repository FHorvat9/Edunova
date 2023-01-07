package edunova;

public class Z005SmallestMultiple {
	public static void main(String[] args) {

//		What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
		int provjera = 0;

		for (int i = 1;; i++) {
			for (int j = 1; j <= 20; j++) {
				if (i % j == 0) {
					provjera++;
				} else {
					provjera = 0;
					break;
				}

			}
			if (provjera == 20) {
				System.out.println(i);
				break;

			} else {
				continue;
			}

		}

	}

}
