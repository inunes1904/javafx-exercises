package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TestStackPane extends StackPane {


	public TestStackPane() {
		BoxEx b1 = new BoxEx().withText("1");
		BoxEx b2 = new BoxEx().withText("2");
		BoxEx b3 = new BoxEx().withText("3");
		BoxEx b4 = new BoxEx().withText("4");
		BoxEx b5 = new BoxEx().withText("5");
		BoxEx b6 = new BoxEx().withText("6");
		
		getChildren().addAll(b1, b2, b3, b4, b5, b6 );
		
		
		this.setOnMouseClicked(e ->{
			if (e.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront();
			}else {
				getChildren().get(5).toBack();
			}
		});
		
		
		Thread t = new Thread(() -> {
			while(true) {		
				try {
					Thread.sleep(3000);
					
					Platform.runLater(() ->{
						getChildren().get(0).toFront();
					});
					
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		});
		
		t.setDaemon(true); 
		t.start();
		
	}
	
	
	
	
	
}
