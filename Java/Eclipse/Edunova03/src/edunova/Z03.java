package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
		// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veći od 10
		// inače ispisuje Edunova
		
		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Upisite prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Upisite drugi broj"));
		
		if (prvi+drugi > 10) {
			System.out.println("Osijek");
		}
		else {
			System.out.println("Edunova");
		}
	}
}
