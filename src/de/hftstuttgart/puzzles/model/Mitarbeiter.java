package de.hftstuttgart.puzzles.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MITARBEITER_TABLE")
public class Mitarbeiter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MITARBEITERNUMMER")
	private int mMitarbeiternummer;
	@Column(name = "VORNAME")
	private String mVorname;
	@Column(name = "NACHNAME")
	private String mNachname;
	@Column(name = "PASSWORT")
	private String mPasswort;

	public Mitarbeiter(int mitarbeiternummer, String vorname, String nachname, String passwort) {
		this.mMitarbeiternummer = mitarbeiternummer;
		this.mVorname = vorname;
		this.mNachname = nachname;
		this.mPasswort = passwort;
	}

	public int getMitarbeiternummer() {
		return mMitarbeiternummer;
	}

	public void setMitarbeiternummer(int mitarbeiternummer) {
		this.mMitarbeiternummer = mitarbeiternummer;
	}

	public String getVorname() {
		return mVorname;
	}

	public void setVorname(String vorname) {
		this.mVorname = vorname;
	}

	public String getNachname() {
		return mNachname;
	}

	public void setNachname(String nachname) {
		this.mNachname = nachname;
	}

	public String getPasswort() {
		return mPasswort;
	}

	public void setPasswort(String passwort) {
		this.mPasswort = passwort;
	}

	@Override
	public String toString() {
		return "Mitarbeiter [mitarbeiternummer=" + mMitarbeiternummer + ", vorname=" + mVorname + ", nachname="
				+ mNachname + ", passwort=" + mPasswort + "]";
	}

	public Kunde KundeErstellen(String kundennummer, String vorname, String nachname, String geschlecht, String adresse,
			String mail, int telefon) {
		Kunde kunde = new Kunde(kundennummer, vorname, nachname, geschlecht, adresse, mail, telefon);
		return kunde;
	}

	public String getKuerzel() {
		return getVorname().substring(1) + getNachname().substring(1);
	}
}
