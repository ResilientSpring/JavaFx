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
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Simple Scene Graph Demo");
		
		FlowPane pane = new FlowPane();
		
		Label label = new Label("I am a label.");
		Label label2 = new Label("I am another label.");
		
		pane.getChildren().addAll(label, label2);
		
		Scene scene = new Scene(pane, 300, 200);
		
		primaryStage.setScene(scene);
		
		button = new Button("Erase the right-most label.");
		button.setOnAction(event -> buttonClick());
		
		primaryStage.show();
	}
	
	private Object buttonClick() {
		// TODO Auto-generated method stub
		return null;
	}

	public void stop() {
		
	}

}
