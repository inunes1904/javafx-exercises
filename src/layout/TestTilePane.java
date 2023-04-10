package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class TestTilePane extends TilePane {

	
	public TestTilePane(){
		
		List<Square> squares = new ArrayList<>();	
		
		for (int i = 1; i < 10; i++) {
			
			Square sq = new Square(i*10);
			squares.add(sq);
			
		}
		
		//setAlignment(Pos.BOTTOM_RIGHT);
		
		getChildren().addAll(squares);
		
		}
}
