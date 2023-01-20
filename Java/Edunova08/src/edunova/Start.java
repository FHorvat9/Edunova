package edunova;

import java.util.Date;

public class Start {
	public static void main(String[] args) {
		
		
//		*********************************ZADATAK 1.*********************************************************
		Racunalo[] racunalo = new Racunalo[2];
		racunalo[0]=kreirajRacunalo(
				Pomocno.obavezanUnosStringa("Upisi ime racunala"),
				Pomocno.ucitajCijeliBroj("Upisi broj jezgri procesora"),
				Pomocno.ucitajDecimalniBroj("Upisi brzinu procesora u Ghz"),
				Pomocno.ucitajBoolean("Vanjska graficka?"),
				Pomocno.ucitajDugiCijeliBroj("Upisi serijski broj racunala")
				);
		
		racunalo[1]=kreirajRacunalo(
				Pomocno.obavezanUnosStringa("Upisi ime racunala"),
				Pomocno.ucitajCijeliBroj("Upisi broj jezgri procesora"),
				Pomocno.ucitajDecimalniBroj("Upisi brzinu procesora u Ghz"),
				Pomocno.ucitajBoolean("Vanjska graficka?"),
				Pomocno.ucitajDugiCijeliBroj("Upisi serijski broj racunala")
				);
		
		System.out.println("["+racunalo[0].getImeProcesora()+", "+
						   racunalo[0].getBrojJezgri()+", "+
						   racunalo[0].getBrzinaProcesora()+", "+
						   racunalo[0].isVanjskaGraficka()+", "+
						   racunalo[0].getSerijskiBrojRacunala()+"]");
		
		System.out.println("["+racunalo[1].getImeProcesora()+", "+
							racunalo[1].getBrojJezgri()+", "+
							racunalo[1].getBrzinaProcesora()+", "+
							racunalo[1].isVanjskaGraficka()+", "+
							racunalo[1].getSerijskiBrojRacunala()+"]");
		
//		*********************************ZADATAK 2.*********************************************************
		
		Kupac filip = kreirajKupca("Filip Horvat", "Istarska 3");
		Kupac iva = kreirajKupca("Iva Horvat", "Istarska 3");
		
		Racun prviRacun = krirajRacun(new Date(), 3.5, iva);
		Racun drugiRacun= krirajRacun(new Date(), 12, iva);
		Racun treciRacun = krirajRacun(new Date(), 25.56, filip);
		
		System.out.println(prviRacun.getIznos());
		System.out.println(drugiRacun.getDate());
		System.out.println(treciRacun.getKupac().getIme());
	
		
		
	}

	private static Racunalo kreirajRacunalo(String imeProcesora, int brojJezgri, double brzinaProcesora,boolean vanjskaGraficka, long serijskiBrojRacunala)
	{
		Racunalo racunalo = new Racunalo();
		racunalo.setImeProcesora(imeProcesora);
		racunalo.setBrojJezgri(brojJezgri);
		racunalo.setBrzinaProcesora(brzinaProcesora);
		racunalo.setVanjskaGraficka(vanjskaGraficka);
		racunalo.setSerijskiBrojRacunala(serijskiBrojRacunala);
		return racunalo;

	}
	
	private static Kupac kreirajKupca(String ime,String adresa) {
		Kupac kupac = new Kupac();
		kupac.setIme(ime);
		kupac.setAdresa(adresa);
		return kupac;
	}
	
	private static Racun krirajRacun(Date date, double iznos, Kupac kupac) {
		Racun racun = new Racun();
		racun.setDate(date);
		racun.setIznos(iznos);
		racun.setKupac(kupac);
		return racun;
	}
	
	
}
