package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {
		// Korisnik unosi dva cijela broja
		// Program ispisuje
		// zbroj svih parnih brojeva
		// između dva unesena broja

		int min = Integer.parseInt(JOptionPane.showInputDialog("Upisite prvi broj"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Upisite drugi broj"));
		int temp = 0, zbroj = 0;

		if (max == min) {
			System.out.println("Brojevi nisu razliciti");
		}

		if (max < min) {
			temp = min;
			min = max;
			max = temp;
		}

		for (int i = min; i < max; i++) {
			if (i % 2 == 0) {
				zbroj += i;
			}
		}

		System.out.println("Zbroj svih parnih brojeva izmedju brojva " + min + " i " + max + " je " + zbroj);

	}
}
