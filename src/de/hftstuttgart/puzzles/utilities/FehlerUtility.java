package de.hftstuttgart.puzzles.utilities;

import java.awt.Toolkit;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class FehlerUtility {

	public static void falscheURL() {
		Alert alert = new Alert(AlertType.ERROR);
		Toolkit.getDefaultToolkit().beep();
		alert.setTitle("FEHLER!");
		alert.setHeaderText("");
		alert.setContentText("URL konnte nicht gefunden werden.");
		alert.showAndWait();
	}
}
