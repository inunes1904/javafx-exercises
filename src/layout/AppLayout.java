package layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene mainScene = new Scene(new TestAnchorPane(), 800, 600);
		
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("Layout Managers");
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
}
