package basic;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CounterProj extends Application {
	
	private int counter = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		VBox boxMain = new VBox();
		HBox boxButtons = new HBox();
		
		boxMain.getStyleClass().add("container");
		
		Label titleLabel = new Label("Counter Application");
		Label numLabel = new Label(String.valueOf(counter));
		
		Button btnReduce = new Button("-");
		Button btnAdd = new Button("+");
		
		boxMain.getChildren().add(titleLabel);
		boxMain.getChildren().add(numLabel);
		
		boxButtons.getChildren().add(btnReduce);
		boxButtons.getChildren().add(btnAdd);
		boxButtons.setAlignment(Pos.CENTER);
		boxButtons.setSpacing(10);
		
		boxMain.getChildren().add(boxButtons);
		boxMain.setAlignment(Pos.CENTER);
		boxMain.setSpacing(10);
		
		
		numLabel.getStyleClass().add("number");
		titleLabel.getStyleClass().add("title");
		
		String archiveCSS = getClass().getResource("/basic/CounterProj.css")
				.toExternalForm();
		Scene mainScene = new Scene(boxMain, 400, 400);
		
		mainScene.getStylesheets().add(archiveCSS);
		mainScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald:wght@300&display=swap");
		
		
		btnAdd.getStyleClass().add("buttons");
		btnAdd.setOnAction(e -> {
			counter++;
			numLabel.setText(String.valueOf(counter));
			changeColor(numLabel, counter);
		});
		
		btnReduce.getStyleClass().add("buttons");
		btnReduce.setOnAction(e -> {
			counter--;
			numLabel.setText(String.valueOf(counter));
			changeColor(numLabel, counter);
		});
	
		
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public void changeColor(Label numLabel, int counterNum) {
		numLabel.getStyleClass().remove("positive");
		numLabel.getStyleClass().remove("negative");
		numLabel.getStyleClass().remove("number");
		if (counterNum > 0) {
			numLabel.getStyleClass().add("positive");
		}else if (counterNum < 0) {
			numLabel.getStyleClass().add("negative");
		}else {
			numLabel.getStyleClass().add("number");
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
