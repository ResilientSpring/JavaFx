import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
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
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		primaryStage.setTitle("Demonstrate Check Boxes");
		
		// Vertical gap of 10.
		FlowPane pane = new FlowPane(Orientation.VERTICAL, 0, 10);
		
	}

}
