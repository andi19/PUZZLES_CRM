package de.hftstuttgart.puzzles.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KUNDEN_TABLE")
public class Kunde {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "KUNDENNUMMER")
	private String mKundennummer;
	@Column(name = "VORNAME")
	private String mVorname;
	@Column(name = "NACHNAME")
	private String mNachname;
	@Column(name = "ADRESSE")
	private String mAdresse;
	@Column(name = "MAIL")
	private String mMail;
	@Column(name = "GRUPPE")
	private String mGruppe;
	@Column(name = "TELEFON")
	private int mTelefon;
	@Column(name = "GESCHLECHT")
	private String mGeschlecht;

	public Kunde(String kundennummer, String vorname, String nachname, String geschlecht, String adresse, String mail,
			int telefon) {
		this.mKundennummer = kundennummer;
		this.mVorname = vorname;
		this.mNachname = nachname;
		this.mGeschlecht = geschlecht;
		this.mAdresse = adresse;
		this.mMail = mail;
		this.mTelefon = telefon;
	}

	public String getKundennummer() {
		return mKundennummer;
	}

	public void setKundennummer(String kundennummer) {
		this.mKundennummer = kundennummer;
	}

	public String getVorname() {
		return mVorname;
	}

	public void setVorname(String vorname) {
		this.mVorname = vorname;
	}

	public String getmAdresse() {
		return mAdresse;
	}

	public void setmAdresse(String mAdresse) {
		this.mAdresse = mAdresse;
	}

	public String getmMail() {
		return mMail;
	}

	public void setmMail(String mMail) {
		this.mMail = mMail;
	}

	public int getmTelefon() {
		return mTelefon;
	}

	public void setmTelefon(int mTelefon) {
		this.mTelefon = mTelefon;
	}

	public String getmGeschlecht() {
		return mGeschlecht;
	}

	public void setmGeschlecht(String geschlecht) {
		this.mGeschlecht = geschlecht;
	}

	public String getNachname() {
		return mNachname;
	}

	public void setNachname(String nachname) {
		this.mNachname = nachname;
	}

	@Override
	public String toString() {
		return "Kunde [mKundennummer=" + mKundennummer + ", mVorname=" + mVorname + ", mNachname=" + mNachname
				+ ", mAdresse=" + mAdresse + ", mMail=" + mMail + ", mTelefon=" + mTelefon + ", mGeschlecht="
				+ mGeschlecht + "]";
	}

	public void setGruppe(String gruppe) {
		this.mGruppe = gruppe;
	}

	public String getGruppe() {
		return mGruppe;
	}

}