package de.hftstuttgart.puzzles.controller;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ResourceBundle;

import de.hftstuttgart.puzzles.model.Artikeleinheit;
import de.hftstuttgart.puzzles.model.Kunde;
import de.hftstuttgart.puzzles.model.Mitarbeiter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class AuftragFXController implements Initializable {

	private static int count = 0;

	private static Stage stage;
	@FXML
	private Button mAuftragsdetails;
	@FXML
	private Button mArtikelhinzufügen;
	@FXML
	private Button mKundeninformationen;
	@FXML
	private Button mAbbrechen;
	@FXML
	private Button mAuftragAnlegen;
	@FXML
	private TextArea mTextFeld;
	@FXML
	private Label mAuftragsnummer;

	private boolean mTextFeldVisibility = false;

	private Kunde mKunde;

	private Mitarbeiter mMitarbeiter;

	private Parent root;

	private List<Artikeleinheit> mArtikelliste;

	public void setAuftragsnummer(String input){
		mAuftragsnummer.setText(input);
	}

	// Event Listener on Button[#mAuftragsdetails].onAction
	@FXML
	public void auftragsdetailsHinzufuegen(ActionEvent event) {
		// TODO Autogenerated
		if (mTextFeldVisibility == false) {
			mTextFeld.setVisible(true);
			mTextFeldVisibility = true;
		} else {
			mTextFeld.setVisible(false);
			mTextFeldVisibility = false;
		}
	}

	// Event Listener on Button[#mArtikelhinzufügen].onAction
	@FXML
	public void artikelHinzufuegen(ActionEvent event) {
		// TODO Autogenerated
		try {
			root = FXMLLoader.load(getClass().getResource("/de/hftStuttgart/puzzles/view/ArtikelUebersicht.fxml"));
			stage = new Stage();
			stage.setTitle("Artikel Hinzufügen");
			stage.setScene(new Scene(root, 500, 400));
			stage.setResizable(false);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Event Listener on Button[#mKundeninformationen].onAction
	@FXML
	public void kundenInformationen(ActionEvent event) {
		// TODO Autogenerated
		try {
			root = FXMLLoader.load(getClass().getResource("/de/hftStuttgart/puzzles/view/KundenUebersicht.fxml"));
			stage = new Stage();
			stage.setTitle("Kundenübersicht");
			stage.setScene(new Scene(root, 800, 400));
			stage.setResizable(false);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Event Listener on Button[#mAbbrechen].onAction
	@FXML
	public void abbrechen(ActionEvent event) {
		// TODO Autogenerated
		Stage stage = (Stage) mAbbrechen.getScene().getWindow();
		stage.close();
	}

	// Event Listener on Button[#mAuftragAnlegen].onAction
	@FXML
	public void auftragAnlegen(ActionEvent event) {
		// TODO Autogenerated
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
//		String timeStampNummer = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
//		Auftrag auftrag = new Auftrag(mMitarbeiter.getKuerzel() + timeStampNummer + fortlaufendeNummer(), mKunde, mArtikelliste,
//				timeStamp, mTextFeld.getText());
//		System.out.println(auftrag.toString() + count);
		System.out.println(fortlaufendeNummer());
		System.out.println(timeStamp);
		count++;
		Stage stage = (Stage) mAuftragAnlegen.getScene().getWindow();
		stage.close();
	}

	private String fortlaufendeNummer() {
		String returnString = "";
		if (count >= 1000) {
			returnString = Integer.toString(count);
		} else if (count >= 100) {
			returnString = "0" + Integer.toString(count);
		} else if (count >= 10) {
			returnString = "00" + Integer.toString(count);
		} else {
			returnString = "000" + Integer.toString(count);
		}
		return returnString;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		String timeStampNummer = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
	    setAuftragsnummer("MUMA110" + timeStampNummer + fortlaufendeNummer());
	    System.out.println("sessionLabel= " + mAuftragsnummer.getText());
	}
}
