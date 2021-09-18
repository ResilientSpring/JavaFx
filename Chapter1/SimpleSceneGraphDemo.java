// Demonstrate a simple scene graph that contains a label.

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class SimpleSceneGraphDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void init() {
		
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Demonstrate A Simple Scene Graph");
		
		// Use a FlowPane for the root node.
		FlowPane rootNode = new FlowPane();
		
		// Create a scene.
		Scene scene = new Scene(rootNode, 300, 200);
		
		// Set the scene on the stage. 
		primaryStage.setScene(scene);
		
		// Create a label.
		Label label = new Label("A simple JavaFX label.");
		
		// Add the label to the scene graph.
		rootNode.getChildren().add(label);  // In other words, it adds the label to rootNode's list of children.
		
		// Show the window that was created by the stage and scene.
		primaryStage.show();
	}
	
	public void stop() {
		
	}

}
