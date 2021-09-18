import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class SimpleSceneGraphDemo7 extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void init() {
		
	}
	
	Button button;
	FlowPane pane = new FlowPane();
	
	Label label = new Label("I am a label.");
	Label label2 = new Label("I am another label.");
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Simple Scene Graph Demo");
		
		button = new Button("Erase the right-most label.");
		button.setOnAction(event -> buttonClick());
		
		pane.getChildren().addAll(label, label2, button);
		
		Scene scene = new Scene(pane, 300, 200);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public void buttonClick() {
		if(button.getText() == "Erase the right-most label.")
			pane.getChildren().remove(label2);
		else 
			button.setText("Erase the right-most label.");
	}

	public void stop() {
		
	}

}
