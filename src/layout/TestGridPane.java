package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TestGridPane extends GridPane {

	
	public TestGridPane() {
		
		BoxEx b1 = new BoxEx().withText("1");
		BoxEx b2 = new BoxEx().withText("2");
		BoxEx b3 = new BoxEx().withText("3");
		BoxEx b4 = new BoxEx().withText("4");
		BoxEx b5 = new BoxEx().withText("5");
		BoxEx b6 = new BoxEx().withText("6");
		
		setGridLinesVisible(true);
		
		getColumnConstraints().addAll(cc(),cc(),cc(),cc(),cc());
		getRowConstraints().addAll(rc(),rc(),rc(),rc(),rc());
		
		add(b1, 0, 0, 1, 5);
		add(b2, 1, 1,1,4);
		add(b3, 2, 2,1,3);
		add(b4, 3, 3, 1,2);
		add(b5, 4, 4);
		add(b6, 5, 5);
	}
	
	public ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		return cc;
	}
	
	private RowConstraints rc(){
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}
}
