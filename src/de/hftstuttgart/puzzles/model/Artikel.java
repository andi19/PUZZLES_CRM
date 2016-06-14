package de.hftstuttgart.puzzles.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ARTIKEL_TABLE")
public class Artikel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ARTIKELNUMMER")
	private int mArtikelnummer;
	@Column(name="PREIS")
	private int mPreis;
	@Column(name="NAME")
	private String mName;
	@Column(name="BESCHREIBUNG")
	private String mBeschreibung;

	public Artikel(int artikelnummer, String name, String beschreibung,
			int preis) {
		this.mArtikelnummer = artikelnummer;
		this.mName = name;
		this.mBeschreibung = beschreibung;
		this.mPreis = preis;
	}

	public int getArtikelnummer() {
		return mArtikelnummer;
	}

	public void setArtikelnummer(int produktnummer) {
		this.mArtikelnummer = produktnummer;
	}

	public int getPreis() {
		return mPreis;
	}

	public void setPreis(int preis) {
		this.mPreis = preis;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public String getBeschreibung() {
		return mBeschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.mBeschreibung = beschreibung;
	}

	@Override
	public String toString() {
		return "Artikel [mArtikelnummer=" + mArtikelnummer + ", mPreis="
				+ mPreis + ", mName=" + mName + ", mBeschreibung="
				+ mBeschreibung + "]";
	}

}
