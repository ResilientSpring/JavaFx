
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class JavaFXSkeleton extends Application { // A JavaFX application must be a subclass of the Application class.

	public static void main(String[] args) {
		System.out.println("Launching JavaFX application.");
		
		// Launch JavaFX application by calling launch().
		launch(args);
	}
	
	public void init() {
		System.out.println("Inside the initialization method.");
	}
	
	// The primary stage is supplied by the run-time system when a JavaFX application is started.
	public void start(Stage myStage) { // In actual stage play, a stage contains a scene.
		// A stage is a container for scenes; a scene is a container for items(elements/nodes) that comprise the scene.
		
		System.out.println("Inside the start() method.");
		
		// Give the stage a title.
		myStage.setTitle("JavaFX Skeleton");
		
		// To create a scene, you will first prepare elements, i.e nodes/items, to add to an instance of Scene.
		// JavaFX offers several layout panes that manage how elements/nodes/items are placed in a scene.
		FlowPane rootNode = new FlowPane();
		
		// A stage defines a space and a scene defines what goes in that space. 
		Scene myScene = new Scene(null);
		
		// Set the scene on the stage.
		myStage.setScene(myScene);
	}
	
	public void stop() {
		
	}

}
