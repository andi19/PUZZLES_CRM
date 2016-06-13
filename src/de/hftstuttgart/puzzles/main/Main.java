package de.hftstuttgart.puzzles.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	@PersistenceUnit(unitName = "CRM")
	static EntityManager em;

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
		// initEntityManager();
	}

	public static void initEntityManager() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql:193.196.143.168/?user=" + "aj6s-gruppe4");
		Statement stmt = connection.createStatement();
		//stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + "aj6s-gruppe4");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("META_INF/persistence.xml");
		em = emf.createEntityManager();
	}
}
