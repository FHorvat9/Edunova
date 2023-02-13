package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	public static void main(String[] args) {
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Upisite dvoznamenkasti broj"));
		
		System.out.println(broj%10);
	}
}
