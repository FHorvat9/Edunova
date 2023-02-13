package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
//		Kreirati program koji za dva unesena broja ispisuje sve prim brojeve između njih.
		int provjera = 0;

		int min = Integer.parseInt(JOptionPane.showInputDialog("Upisite prvi broj"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Upisite drugi broj"));
		int temp = 0;

		if (max == min) {
			System.out.println("Brojevi nisu razliciti");
		}

		if (max < min) {
			temp = min;
			min = max;
			max = temp;
		}
		
		for (int i = min; i <= max; i++) {

			for (int j = 1; j <= max; j++) {
				if (i % j == 0) {
					provjera++;
				}

			}
			if (provjera == 2) {
				System.out.print(i+" ");
				provjera=0;
				continue;

			}
			provjera = 0;

		}
	}
}
