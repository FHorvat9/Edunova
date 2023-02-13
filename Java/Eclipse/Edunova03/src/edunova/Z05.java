package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	public static void main(String[] args) {
		// Za upisana 3 cijela broja
		// program ispisuje najveći

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Upisite prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Upisite drugi broj"));
		int treci = Integer.parseInt(JOptionPane.showInputDialog("Upisite treci broj"));

		if (prvi != drugi || prvi != treci) {
			if (prvi >= drugi && prvi >= treci) {
				System.out.println(prvi);
			} 
			else {
				if (drugi >= prvi && drugi >= treci) {
					System.out.println(drugi);
				}
				else {
					System.out.println(treci);
				}
			}

		} else {
			System.out.println("Upisani brojevi nisu razliciti");
		}
	}
}
