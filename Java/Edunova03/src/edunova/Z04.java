package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	public static void main(String[] args) {
		// Za unesena dva cijela broj
		// program ispisuje veći
		// 3 i 5 -> 5
		// 5 i 3 -> 3
		// 5 i 5 ->

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Upisite prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Upisite drugi broj"));

		if (prvi != drugi) {
			if (prvi > drugi) {
				System.out.println(prvi);
			} 
			else {
				System.out.println(drugi);
			}
		} 
		else {
			System.out.println("Unesevi brojevi nisu razliciti");
		}
	}

}
