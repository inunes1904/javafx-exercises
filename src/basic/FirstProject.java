package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstProject extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		VBox box = new VBox();
		Button btn = new Button("First btn");
		Button btn2 = new Button("Snd btn");
		Button btn3 = new Button("exit");
		
		btn3.setOnAction(e-> {
			System.exit(0);
		});
		
		box.getChildren().add(btn);
		box.getChildren().add(btn2);
		box.getChildren().add(btn3);
		
		box.setAlignment(Pos.CENTER);
		box.setSpacing((10));
		
		Scene scene = new Scene(box, 400, 400);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
