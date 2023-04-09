package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application{
	
	
	private Stage window;
	private Scene stepOne;
	private Scene stepTwo;
	private Scene stepThree;

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		window = primaryStage;
		
		createStepOne();
		createStepTwo();
		createStepThree();
		
		window.setScene(stepOne);
		window.setTitle("Wizard");
		window.show();
		
	}
	
	
	private void createStepOne() {
		Button nextStep = new Button("Go to step two >>");
		HBox hBox = new HBox();
		
		nextStep.setOnAction(e -> {
			
			window.setScene(stepTwo);
			window.show();
			
			
		});
		
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().add(nextStep);
		
		stepOne = new Scene(hBox, 400, 400);
		
	}
	
	private void createStepTwo() {
		Button returnStep = new Button("<< Go to step one");
		Button nextStep = new Button("Go to step three >>");
		HBox hBox = new HBox();
		
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().add(returnStep);
		hBox.getChildren().add(nextStep);
		
		
		nextStep.setOnAction(e -> {
					window.setScene(stepThree);
					window.show();
		
				});
		returnStep.setOnAction(e -> {
			window.setScene(stepOne);
			window.show();

		});
		
		stepTwo = new Scene(hBox, 400, 400);
		
	}
	
	
	private void createStepThree() {
		Button returnStep = new Button("<< Go to step two");
		Button endStep = new Button("end setup");
		HBox hBox = new HBox();
		
		returnStep.setOnAction(e -> {
			
			window.setScene(stepTwo);
			window.show();
			
			
		});
		
		endStep.setOnAction(e ->{
			System.exit(0);
		});
		
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().add(returnStep);
		hBox.getChildren().add(endStep);
		
		stepThree = new Scene(hBox, 400, 400);
		
	}
	
	
	public static void main(String[] args) {
		
		launch(args);
	}

}
