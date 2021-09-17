
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class JavaFXSkeleton extends Application {

	public static void main(String[] args) {
		System.out.println("Launching JavaFX application.");
		
		// Launch JavaFX application by calling launch().
		launch(args);
	}
	
	public void init() {
		System.out.println("Inside the initialization method.");
	}
	
	// The primary stage is supplied by the run-time system when a JavaFX application is started.
	public void start(Stage myStage) {
		
	}
	
	public void stop() {
		
	}

}
