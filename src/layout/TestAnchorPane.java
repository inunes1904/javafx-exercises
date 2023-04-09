package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TestAnchorPane extends AnchorPane {

	public TestAnchorPane() {
		
		Square sq1 = new Square();
		setTopAnchor(sq1, 10.0);
		setLeftAnchor(sq1, 10.0);
		
		Square sq2 = new Square();
		setTopAnchor(sq2, 10.0);
		setRightAnchor(sq2, 10.0);
		
		Square sq3 = new Square();
		setBottomAnchor(sq3, 10.0);
		setLeftAnchor(sq3, 10.0);
		
		Square sq4 = new Square();
		setBottomAnchor(sq4, 10.0);
		setRightAnchor(sq4, 10.0);
		
		HBox center = new HBox();
		center.setAlignment(Pos.CENTER);
		setTopAnchor(center, 110.0);
		setBottomAnchor(center, 110.0);
		setLeftAnchor(center, 110.0);
		setRightAnchor(center, 110.0);
		
		Square sq5 = new Square();
		setTopAnchor(sq5, 250.0);
		setLeftAnchor(sq5, 350.0);
		
		center.getChildren().add(sq5);
		
		getChildren().addAll(sq1, sq2, sq3, sq4, center);
		
	}
	
}
