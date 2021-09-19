import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class ClickCounter extends Application {
	
	Button button;
	Label label;
	int iClickCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void init() {
		
	}
	
	public void start(Stage primaryStage) {
		
		button = new Button("Click me, please!");
		button.setOnAction(event -> buttonClick());
		
		label = new Label("You have not clicked the button.");
		
		BorderPane pane = new BorderPane();
		pane.setTop(label);
		pane.setCenter(button);
		
		Scene scene = new Scene(pane, 250, 150);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click Counter");
		
		primaryStage.show();
		
	}
	
	public void buttonClick() {
		iClickCount++;
		if (iClickCount == 1) {
			label.setText("You have clicked once.");
		}
		else {
			label.setText("You have clicked " + iClickCount + " times.");
		}
	}

	public void stop() {
		
	}

}
