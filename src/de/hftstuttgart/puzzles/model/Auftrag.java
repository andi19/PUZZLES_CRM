package de.hftstuttgart.puzzles.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUFTRAG_TABLE")
public class Auftrag {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="AUFTRAGSNUMMER")
	private String mAuftragsnummer;
	@Column(name="NOTIZ")
	private String mNotiz;
	@Column(name="KUNDE")
	private Kunde mKunde;
	@Column(name="ARTIKELLISTE")
	private List<Artikeleinheit> mArtikelliste;
	@Column(name="DATUM")
	private String mDatum;
	@Column(name="STATUS")
	private Status mStatus;

	public Auftrag(String auftragsnummer, Kunde kunde,
			List<Artikeleinheit> artikelListe, String datum, String notiz) {
		this.mAuftragsnummer = auftragsnummer;
		this.mKunde = kunde;
		this.mArtikelliste = artikelListe;
		this.mDatum = datum;
		this.mNotiz = notiz;
		this.mStatus = Status.auftragerstellt;
	}

	public Kunde getKunde() {
		return mKunde;
	}

	public void setKunde(Kunde kunde) {
		this.mKunde = kunde;
	}

	public List<Artikeleinheit> getArtikelliste() {
		return mArtikelliste;
	}

	public void setArtikelliste(List<Artikeleinheit> artikelListe) {
		this.mArtikelliste = artikelListe;
	}

	public String getAuftragsnummer() {
		return mAuftragsnummer;
	}

	public void setAuftragsnummer(String auftragsnummer) {
		this.mAuftragsnummer = auftragsnummer;
	}

	public String getDatum() {
		return mDatum;
	}

	public void setDatum(String datum) {
		this.mDatum = datum;
	}

	public String getmNotiz() {
		return mNotiz;
	}

	public void setmNotiz(String notiz) {
		this.mNotiz = notiz;
	}

	public Status getStatus() {
		return mStatus;
	}

	public void setAbholbereit(Status status) {
		mStatus = status;
	}

	@Override
	public String toString() {
		return "Auftrag [mAuftragsnummer=" + mAuftragsnummer + ", mNotiz="
				+ mNotiz + ", mKunde=" + mKunde + ", mArtikelliste="
				+ mArtikelliste + ", mDatum=" + mDatum + ", mStatus=" + mStatus
				+ "]";
	}

}