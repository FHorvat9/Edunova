package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	public static void main(String[] args) {
		
		int Prva[][]= new int [4][4];
		int Druga[][]= new int [4][4];
		int Zbroj[][]= new int [4][4];
		
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<4;j++) {
				Prva[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Upisite broj na mjestu: "+(i+1)+"-"+(j+1)));
						}
			
		}
		
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<4;j++) {
				Druga[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Upisite broj na mjestu: "+(i+1)+"-"+(j+1)));
						}
			
		}
		
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<4;j++) {
				Zbroj[i][j]=(Prva[i][j]+Druga[i][j]);
						}
			
		}
		
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<4;j++) {
				System.out.print(Zbroj[i][j]+" ");
						}
			System.out.println();
			
		}

	}
}
