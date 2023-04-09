package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BoxEx extends HBox{
	
	private static int number = 0;
	
	private String[] colors = {
			"c33c5e","39aac6","28d79a",
			"fb750e","6657a8","f9060e"
	};
	
	public BoxEx() {
		this(100,100);
	}
	
	
	public BoxEx(int width, int height) {
		setAlignment(Pos.CENTER);
		
		setMinWidth(width);
		setMinHeight(height);
		
		BackgroundFill fill = new BackgroundFill(Color.web(colors[number]), CornerRadii.EMPTY, Insets.EMPTY);
		setBackground(new Background(fill));
		
		number++;
		if (number == 6) number = 0;
	}
	
	public BoxEx withText(String txt) {
		
		Label label = new Label(txt);
		label.setFont(new Font(24));
		getChildren().add(label);
		return this;
		
	}
}
