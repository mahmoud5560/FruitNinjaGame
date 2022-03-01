package fruitNinjaPack;

import javafx.scene.control.Label;

public class Label1 implements Observer{

	private Label label;

    public Label1(Label label) {
        this.label = label;
    }
    public void update( int counter) {
        label.setText(Integer.toString(counter));
    }
}
