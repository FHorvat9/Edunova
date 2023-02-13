package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
		// Korisnik unosi 5 brojeva
		// program ispisuje najveći

		int brojac = 1, unos = 0, max = Integer.MIN_VALUE;

		while (brojac <= 5) {

			unos = Integer.parseInt(JOptionPane.showInputDialog("Upisite " + brojac++ + ". broj"));
			if (unos > max) {
				max = unos;

			}

		}
		System.out.println("Najveci uneseni broj je " + max);
	}

}
