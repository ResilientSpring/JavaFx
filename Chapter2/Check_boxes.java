import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

// Demonstrate check boxes.
public class Check_boxes extends Application {
	
	CheckBox checkBox_keyboard = new CheckBox("Keyboard");
	CheckBox checkBox_Mouse = new CheckBox("Mouse");
	CheckBox checkBox_Touch = new CheckBox("Touch Screen");
	
	Label headingLabel = new Label("Select Input Devices");
	Label responseLabel = new Label("No Devices Selected.");
	Label selectedLabel = new Label("Supported devices: <none>");
	
	String inputDeviceString = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start the JavaFX application by calling launch().
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		arg0.setTitle("Demonstrating Check Boxes");
		
		checkBox_keyboard.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (checkBox_keyboard.isSelected()) {
					responseLabel.setText("keyboard is selected.");
				}
				
				if (checkBox_keyboard.isSelected() == false) {
					responseLabel.setText("Keyboard is cleared.");
				}
			}
		});
		
		checkBox_Mouse.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (checkBox_Mouse.isSelected()) {
					responseLabel.setText("Mouse is selected.");
				} else {
					responseLabel.setText("Mouse is cleared.");
				}
			}
		});
		
		checkBox_Touch.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				if (checkBox_Touch.isSelected()) {
					responseLabel.setText("Touch Screen is selected.");
				} else {
					responseLabel.setText("Touch Screen is cleared.");
				}
				
			}
		});
		
		FlowPane rootNodeFlowPane = new FlowPane(Orientation.VERTICAL, 0, 10);
		
		rootNodeFlowPane.setPadding(new Insets(0, 0, 0, 10));
		
		rootNodeFlowPane.getChildren().addAll(headingLabel, checkBox_keyboard, checkBox_Mouse, checkBox_Touch, responseLabel, selectedLabel);
		
		Scene scene = new Scene(rootNodeFlowPane, 300, 180);
		
		arg0.setScene(scene);
		
		arg0.show();
	}

}
