import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class JavaFxEventDemo2 extends Application {
	
	Label responseLabel = new Label("Push a button");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Introducing Buttons and Events");
		
		// Use a FlowPane for the root node. In this case, vertical and horizontal gaps of 10.
		FlowPane rootNoteFlowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		rootNoteFlowPane.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNoteFlowPane, 300, 100);
		
		primaryStage.setScene(myScene);
		
		// Create two push buttons. 
		Button firstButton = new Button("First");
		Button secondButton = new Button("Second");
		
		// Handle the action events for the first button.
		firstButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				responseLabel.setText("First button was pressed.");
			}
		});
		
	}

}
