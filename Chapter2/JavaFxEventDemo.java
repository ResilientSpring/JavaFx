import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.FlowPane;

public class JavaFxEventDemo extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void init() {
		
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Demonstrating Event Handling and the Button");
		
		// Vertical and horizontal gaps of 10.
		FlowPane pane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		pane.setAlignment(Pos.CENTER);
		
		// Create the scene.
		Scene scene = new Scene(pane, 300, 200);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
	}
	
	public void stop() {
		
	}

}
