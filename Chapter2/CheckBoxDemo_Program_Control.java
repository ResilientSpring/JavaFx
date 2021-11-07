import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CheckBoxDemo_Program_Control extends Application {

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
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		keyboardCheckBox.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (keyboardCheckBox.isSelected()) {
					responseLabel.setText("Keyboard selected.");
				} else {
					responseLabel.setText("Keyboard is cleared.");
				}
			}
		});

		mouseCheckBox.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (mouseCheckBox.isSelected()) {
					responseLabel.setText("Mouse is selected.");
				} else {
					responseLabel.setText("Mouse is cleared.");
				}
			}
		});

		// Specify the handler for the event generated by the control, i.e. check box in
		// this case.
		touchScreenCheckBox.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (touchScreenCheckBox.isSelected()) {
					responseLabel.setText("Touch Screen is selected.");
				} else {
					responseLabel.setText("Touch Screen is cleared.");
				}
			}
		});

		FlowPane pane = new FlowPane(Orientation.VERTICAL, 0, 10);
		
		pane.getChildren().addAll(headingLabel, keyboardCheckBox, mouseCheckBox, touchScreenCheckBox, responseLabel,
				selectedLabel);
		
		Scene scene = new Scene(pane, 300, 180);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Demonstration of Program-controlled Check Box");
		
		primaryStage.show();
	}

}
