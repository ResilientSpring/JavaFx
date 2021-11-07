import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Check_boxes2 extends Application {
	
	Label headingLabel = new Label("Select Input Devices: ");
	Label responseLabel = new Label("No Device Selected.");
	Label selectedLabel = new Label("Supported Devices: <None>");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		CheckBox keyboardCheckBox = new CheckBox("Keyboard");
		CheckBox touch_screenCheckBox = new CheckBox("Touch Screen");
		CheckBox mouseCheckBox = new CheckBox("Mouse");
		
		keyboardCheckBox.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if (keyboardCheckBox.isSelected()) {
					responseLabel.setText("Keyboard selected");
				}
				
				if (keyboardCheckBox.isSelected() == false) {
					responseLabel.setText("Keyboard is cleared.");
				}
				
			}
		});
		
		touch_screenCheckBox.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (touch_screenCheckBox.isSelected()) {
					responseLabel.setText("Touch Screen selected.");
				}
				
				if (touch_screenCheckBox.isSelected() == false) {
					responseLabel.setText("Touch Screen is cleared.");
				}
			}
		});
		
		mouseCheckBox.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (mouseCheckBox.isSelected()) {
					responseLabel.setText("Mouse selected.");
				} else {
					responseLabel.setText("Mouse is cleared");
				}
			}
		});
		
		FlowPane pane = new FlowPane(Orientation.VERTICAL, 0, 10);
		
		pane.setAlignment(Pos.CENTER_LEFT);
		
		pane.setPadding(new Insets(0, 0, 0, 10));
		
		pane.getChildren().addAll(headingLabel, mouseCheckBox, touch_screenCheckBox, keyboardCheckBox, responseLabel, selectedLabel);
		
		Scene scene = new Scene(pane, 300, 180);
		
		primaryStage.setTitle("Demonstration of Check Box");
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
