package edunova.model;

public abstract class Entitet {
	 private int Sifra;

	public int getSifra() {
		return Sifra;
	}

	public void setSifra(int sifra) {
		Sifra = sifra;
	}

	public Entitet() {
		super();
	}

	public Entitet(int sifra) {
		super();
		Sifra = sifra;
	}
	 
	

}
