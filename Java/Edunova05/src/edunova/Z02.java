package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	public static void main(String[] args) {

		// Korisnik unosi 5 brojeva
		// između 2 i 4
		// Program ispisuje njihov umnožak
		int brojac = 1, unos = 0, umnozak = 1;

		while (brojac <= 5) {
			do {
				unos = Integer
						.parseInt(JOptionPane.showInputDialog("Upisite " + brojac + ". broj u rasponu od 2 do 4"));
			} while (unos < 2 || unos > 4);
			umnozak *= unos;
			brojac++;
		}
		System.out.println(umnozak);

	}

}
