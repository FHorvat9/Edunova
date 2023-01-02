package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
	int prvi = Integer.parseInt(JOptionPane.showInputDialog("Upisi prvi broj"));
	int drugi = Integer.parseInt(JOptionPane.showInputDialog("Upisi drugi broj"));
	
	float rezultat = prvi/(float)drugi;
	
	System.out.println(rezultat);
	

	}
}
