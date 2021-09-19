import javafx.application.*;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class JavaFxEventDemo extends Application {
	
	Label response;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void init() {
		
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Demonstrating Event Handling and the Button");
		
		// Create a label.
		response = new Label("Push a Button");
		
		// Create two push buttons.
		Button button1 = new Button("First");
		Button button2 = new Button("Second");
		
		// Handle the action events for the First button.
		button1.setOnAction(event -> button1Click());
		
		// Handle the action events for the Second button.
		button2.setOnAction(event -> button2Click());
		
		// Vertical and horizontal gaps of 10.
		FlowPane pane = new FlowPane(10, 10);
		
		pane.getChildren().addAll(button1, button2, response);
		
		// Center the controls in the scene.
		pane.setAlignment(Pos.CENTER);
		
		// Create the scene.
		Scene scene = new Scene(pane, 300, 200);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Show the window that was created by the stage and scene.
		primaryStage.show();

	}
	
	public void button2Click() {
		response.setText("Second button was pressed.");
	}

	public void button1Click() {
		response.setText("First button was pressed.");
	}

	public void stop() {
		
	}

}
