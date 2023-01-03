package edunova;

import javax.swing.JOptionPane;

public class DZ1 {
	public static void main(String[] args) {
		String povlake = "-------------------------------";
		String ime;

		for (;;) {
			ime = "By: " + JOptionPane.showInputDialog("Upišite svoje ime:");
			if (ime.length() > povlake.length()) {
				System.out.println("Upisite krace ime");
			} else {
				break;
			}

		}

		System.out.println(povlake);
		System.out.println(": : :  TABLICA  MNOZENJA  : : :");
		System.out.println(povlake);
		System.out.println(" * |  1  2  3  4  5  6  7  8  9");
		System.out.println(povlake);

		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i + " |");
			for (int j = 1; j <= 9; j++) {
				if (i * j >= 10) {
					System.out.print(" " + i * j);
				} else {
					System.out.print("  " + i * j);
				}

			}
			System.out.println();

		}
		System.out.println(povlake);

		for (int i = 0, j = 0; i < (povlake.length() - ime.length()); i++) {
			if (i == 0 || i == j) {
				System.out.print(":");
				j += 3;
			} else {
				System.out.print(" ");
			}

		}
		System.out.print(ime);
		System.out.println();
		System.out.println(povlake);

	}

}
