import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Create_a_three_state_check_box extends Application {
	
	Button selectAllButton = new Button("Select All");
	Button resetButton = new Button("Reset");

	CheckBox keyboardCheckBox = new CheckBox("Keyboard");
	CheckBox mouseCheckBox = new CheckBox("Mouse");
	CheckBox touchScreenCheckBox = new CheckBox("Touch Screen");

	Label headingLabel = new Label("Select Input Devices:");
	Label responseLabel = new Label("You haven't selected any device.");
	Label selectedLabel = new Label("Supported devices: ");

	String inputDeviceString = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		keyboardCheckBox.setOnAction(keybardHandler);
		mouseCheckBox.setOnAction(null);
		touchScreenCheckBox.setOnAction(null);
		
		selectAllButton.setOnAction(null);
		resetButton.setOnAction(null);
	}
	
	EventHandler<ActionEvent> keybardHandler = new EventHandler<ActionEvent>() {
		
		public void handle(ActionEvent arg0) {
			if (keyboardCheckBox.isSelected()) {
				responseLabel.setText("Keyboard selected.");
			} else {
				responseLabel.setText("Keyboard is cleared.");
			}
			
			showAll();
		}
	};
	
	void showAll() {
		if (keyboardCheckBox.isSelected()) {
			inputDeviceString = "Keyboard ";
		}
		
		if (mouseCheckBox.isSelected()) {
			inputDeviceString += "Mouse ";
		}
		
		if (touchScreenCheckBox.isSelected()) {
			inputDeviceString += "Touch Screen";
		}
		
		if (inputDeviceString.equals("")) {
			inputDeviceString = "<none>";
		}
		
		selectedLabel.setText("Supported devices: " + inputDeviceString); 
	}
}
