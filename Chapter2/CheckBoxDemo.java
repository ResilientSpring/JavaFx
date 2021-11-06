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
		
		// Center the controls vertically; left-align them horizontally.
		pane.setAlignment(Pos.CENTER_LEFT);
		
		// Set a padding value of 10 on the left for the flow pane.
		pane.setPadding(new Insets(0, 0, 0, 10));
		
		// Create a scene. 
		Scene scene = new Scene(pane, 300, 180);
		
		// Set the scene on the stage. 
		primaryStage.setScene(scene);
		
		Label headingLabel = new Label("Select Input Devices.");
		
		// Create a label that will report the state of the selected check box.
		responseLabel = new Label("Supported devices: <none>");
		
		// Create the check boxes. 
		keyboardCheckBox = new CheckBox("Keyboard");
		mouseCheckBox = new CheckBox("Mouse");
		touchScreenCheckBox = new CheckBox("Touch Screen");
		
		// A source, such as check box, generates an event and sends it to one or more listeners, which handle the event.
		// To receive an event, the handler for the event must first be registered with the event source.
		keyboardCheckBox.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// When the event occurs, the handler is called. It must then respond to the event and return.
				
				
				
			}
		});
		
	}

}
