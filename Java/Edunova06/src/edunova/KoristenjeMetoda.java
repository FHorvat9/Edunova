package edunova;

import javax.swing.JOptionPane;

public class KoristenjeMetoda {
	public static void main(String[] args) {

//		--------------------------Zadatak 1----------------------------------
		System.out.println("najveci uneseni broj je: "
				+ Z01.najveciBroj(Integer.parseInt(JOptionPane.showInputDialog("Upisite Prvi broj")),
						Integer.parseInt(JOptionPane.showInputDialog("Upisite Drugi broj")),
						Integer.parseInt(JOptionPane.showInputDialog("Upisite Treci broj"))));

//		--------------------------Zadatak 2----------------------------------		
		System.out.println(Z02.broj());

//		--------------------------Zadatak 3----------------------------------		
		System.out.println(Z03.brojZnakova(JOptionPane.showInputDialog("Ime"), JOptionPane.showInputDialog("Prezime")));

//		--------------------------Zadatak 4----------------------------------
		int polje[] = { 1, 2, 5, 7, 8 };
		System.out.println(Z04.zbrojParnih(polje));

//		--------------------------Zadatak 5----------------------------------
		System.out.println("decimalna vrijednost zbroja unesenih brojeva je: "
				+ Z05.decimalnaVr(Double.parseDouble(JOptionPane.showInputDialog("Upisite prvi decimalni broj")),
						Double.parseDouble(JOptionPane.showInputDialog("Upisite drugi decimalni broj"))));

	}

}
