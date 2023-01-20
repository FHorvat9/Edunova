package edunova;

public class Z01 {
	// Program od korisnika traži ukupan broj
	// predmeta u školi
	// Program unosi ocjene za svaki predmet
	// i ispisuje prosjek ocjena

	public static void main(String[] args) {
		
		int brPredmeta = Pomocno.ucitajCijeliPozitivniBroj("Upisi broj ocjena");
		int zbroj=0;
		
		for (int i=0;i<brPredmeta;i++) {
			
			zbroj+= Pomocno.ucitajCijeliPozitivniBroj("Upisi ocjenu "+(i+1)+". predmeta");
			
		}
		
		System.out.println(zbroj/(double)brPredmeta);
		
	}
}
