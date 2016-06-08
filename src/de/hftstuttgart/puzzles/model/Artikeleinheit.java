package de.hftstuttgart.puzzles.model;

public class Artikeleinheit {

	private Artikel mArtikel;
	private int mMenge;

	public Artikeleinheit(Artikel artikel, int menge) {
		this.mArtikel = artikel;
		this.mMenge = menge;
	}

	public Artikel getArtikel() {
		return mArtikel;
	}

	public void setArtikel(Artikel artikel) {
		this.mArtikel = artikel;
	}

	public int getMenge() {
		return mMenge;
	}

	public void setMenge(int menge) {
		this.mMenge = menge;
	}

	public void increaseM(){
		mMenge++;
	}
	
	public void decreasedM(){
		mMenge--;
	}
	
	@Override
	public String toString() {
		return "Artikeleinheit [mArtikel=" + mArtikel.toString() + ", mMenge=" + mMenge
				+ "]";
	}

}
