package de.hftstuttgart.puzzles.main;

import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {


	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/de/hftstuttgart/puzzles/view/OverviewFX.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();
			Scene scene = new Scene(personOverview);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Puzzles-CRM-Software");
			primaryStage.setResizable(false);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		launch(args);
	}
}
