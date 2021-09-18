import javafx.application.*;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Click_me extends Application {

	public static void main(String[] args) {

		launch(args);
	}

	public void init() {

	}

	Button button;

	public void start(Stage primaryStage) {

		button = new Button();
		button.setText("Click me please!");
		button.setOnAction(e -> buttonClick());
		
		// Add the button to a layout pane
		BorderPane pane = new BorderPane();
		pane.setCenter(button);
		
		// Add the layout to the scene.
		Scene scene = new Scene(pane, 300, 200);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Show the stage and its scene
		primaryStage.show();

	}

	public void buttonClick() {
		if (button.getText() == "Click me please!")
			button.setText("You clicked me!");
		else
			button.setText("Click me please!");
	}

	public void stop() {

	}

}
