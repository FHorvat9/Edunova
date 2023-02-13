package edunova;

public class Z02 {

	// Program unosi imena dvije osobe
	// i ispisujue koliko se vole
	// metodom slučajnog broja od 10 do 90
	
	public static void main(String[] args) {
		
		String imeA=Pomocno.obavezanUnosStringa("Upisi svoje ime");
		String imeB=Pomocno.obavezanUnosStringa("Unesi ime svoje simpatije");
		
		System.out.println(imeA+" i "+imeB+" vole se "+Pomocno.slucajniBrojUrasponu(10, 90)+"%");
		
	}

}
