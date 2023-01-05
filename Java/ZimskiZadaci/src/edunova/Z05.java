package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Upisite Visinu Matrice"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Upisite Sirinu Matrice"));

		int Matrica[][] = new int[n][m];
		int counter = 1;

		int Maxvisina = n - 1;
		int Minvisina = 0;
		int Maxsirina = m - 1;
		int Minsirina = 0;

		vanjska: 
		for (; counter <= n * m;) {

			for (int j = Maxsirina; j >= Minsirina; j--) {
				if (counter > n * m) {
					break vanjska;
				} else {
					Matrica[Maxvisina][j] = counter++;
				}

			}
			Maxvisina--;

			for (int j = Maxvisina; j >= Minvisina; j--) {

				if (counter > n * m) {
					break vanjska;
				} else {
					Matrica[j][Minsirina] = counter++;
				}
			}
			Minsirina++;

			for (int j = Minsirina; j <= Maxsirina; j++) {

				if (counter > n * m) {
					break vanjska;
				} else {
					Matrica[Minvisina][j] = counter++;
				}
			}
			Minvisina++;

			for (int j = Minvisina; j <= Maxvisina; j++) {

				if (counter > n * m) {
					break vanjska;
				} else {
					Matrica[j][Maxsirina] = counter++;
				}
			}
			Maxsirina--;
		}

		for (

				int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(Matrica[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
