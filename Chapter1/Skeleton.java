// A JavaFx application skeleton.

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;

public class Skeleton extends Application {

	public static void main(String[] args) {
		System.out.println("Launching JavaFX application.");
		
		// Start the JavaFX application by calling launch().
		launch(args);
	}
	
	public void init() {
		System.out.println("Inside the init() method.");
	}
	
	public void start(Stage myStage) {
		System.out.println("Inside the start() method.");
		
		// Give the stage a title. 
		myStage.setTitle("JavaFX Skeleton");
		
		// Create a root node. In this case, a flow layout is used, but several alternatives exist.
		FlowPane rootNode = new FlowPane();
		
		// Create a scene
		Scene myScene = new Scene(rootNode, 300, 200);
		
		// Set the scene on the stage. 
		myStage.setScene(myScene);
		
		// Show the stage and its scene. 
		myStage.show();
		
	}
	
	// Override the stop() method.
	public void stop() {
		System.out.println("Inside the stop() method.");
	}	

}

/* Run JavaFX in Eclipse
 * 
 * 
 * Create a new User Library under Eclipse -> Window -> Preferences -> Java -> Build Path -> User Libraries -> New.[3]
 * 
 * Name it JavaFX17 and include the jars under the lib folder from JavaFX 17.[3]
 * 
 * Make sure JDK 11 or greater is selected. You don't need to add a module-info.java file. You can include the JavaFX17 library into the classpath.[3]
 * 
 * Add VM arguments.[1][2][3]
 * 
 * */

// References: 
// 1. https://stackoverflow.com/a/52470141/14900011
// 2. https://stackoverflow.com/a/52156678/14900011
// 3. https://openjfx.io/openjfx-docs/
