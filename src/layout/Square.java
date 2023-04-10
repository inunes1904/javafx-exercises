package layout;


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends Rectangle {

private static int number = 0;
	
	private String[] colors = {
			"c33c5e","39aac6","28d79a",
			"fb750e","6657a8","f9060e"
	};
	
	public Square() {
		this(100);
	}
	
	
	public Square(int size) {
		
		setWidth(size);
		setHeight(size);
		
		setFill(Color.web(colors[number]));
		
		number++;
		if (number == 6) number = 0;
	}
	

	
}
