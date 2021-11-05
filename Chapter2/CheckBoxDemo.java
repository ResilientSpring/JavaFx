import javafx.application.Application;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application {
	
	CheckBox keyboardCheckBox;
	CheckBox mouseCheckBox;
	CheckBox touchScreenCheckBox;
	
	Label responseLabel;
	Label selectedLabel;
	
	String inputDeviceString = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		arg0.setTitle("Demonstrate Check Boxes");
		
	}

}
