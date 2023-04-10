package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TestFlowPane extends FlowPane {

	public TestFlowPane() {
		
		Square sq1 = new Square();
		Square sq2 = new Square();
		Square sq3 = new Square();
		Square sq4 = new Square();
		Square sq5 = new Square();
		
		
		setHgap(10);
		setVgap(10);
		setPadding(new Insets(10));
		
		setOrientation(Orientation.VERTICAL);
		setAlignment(Pos.CENTER);
		
		getChildren().addAll(sq1,sq2,sq3,sq4,sq5);
	}
	
}
