import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkeleton3 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}
	
	public void init() {
		System.out.println("Inside the initialization method.");
	}
	
	// The primary stage is supplied by the run-time system when a JavaFX application is started.
	public void start(Stage primaryStage) { // In actual stage play, a stage contains a scene.
		// A stage is a container for scenes; a scene is a container for items(elements/nodes) that comprise the scene.
		
		System.out.println("Inside the start() method.");
		
		primaryStage.setTitle("Give The Stage a Title");
		
		// To create a scene, you will first prepare elements, i.e nodes/items, to add to an instance of Scene.
		// JavaFX offers several layout panes that manage how elements/nodes/items are placed in a scene.
		FlowPane pane = new FlowPane(300, 200);
		
		// A stage defines a space and a scene defines what goes in that space. 
		Scene scene = new Scene(pane);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// show() shows the window that was created by the stage and scene. 
		primaryStage.show();
		
	}

}
