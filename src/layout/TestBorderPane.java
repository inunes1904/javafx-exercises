package layout;

import javafx.scene.layout.BorderPane;

public class TestBorderPane extends BorderPane{

		public TestBorderPane() {
			BoxEx b1 = new BoxEx().withText("Top");
			setTop(b1);
			BoxEx b2 = new BoxEx().withText("Left");
			setLeft(b2);
			BoxEx b3 = new BoxEx().withText("Right");
			setRight(b3);
			BoxEx b4 = new BoxEx().withText("Bottom");
			setBottom(b4);
			BoxEx b5 = new BoxEx().withText("Center");
			setCenter(b5);
			
		}
	
}
