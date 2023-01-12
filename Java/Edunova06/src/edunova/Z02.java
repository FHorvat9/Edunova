package edunova;

import javax.swing.JOptionPane;

public class Z02 {
		// Metoda od korisnika traži
		// unos broja između 1 i 10
		// te vraća ispravno unesen broj
	
		public static int broj() {
			int a;
			do {
				a=Integer.parseInt(JOptionPane.showInputDialog("Upisite broj izmedju 1 i 10"));
			}while(a<1 || a>10);
			
			
			return a;
		}

}
