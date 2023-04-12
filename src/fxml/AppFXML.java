package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		String archiveCSS = getClass().getResource("/fxml/login.css")
						.toExternalForm();
		
		URL archiveFXML = getClass().getResource("/fxml/Login.fxml");
		GridPane root = FXMLLoader.load(archiveFXML);
		
		Scene scene = new Scene(root, 350,350);
		
		scene.getStylesheets().add(archiveCSS);
		
		primaryStage.setResizable(false);
		primaryStage.setTitle("LOGIN APPLICATION");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
