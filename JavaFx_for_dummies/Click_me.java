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
		
	}
	
	private Object buttonClick() {
		if(button.getText() == "Click me please!");
	}

	public void stop() {
		
	}

}
