import javafx.animation.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class SimpleSceneGraphDemo6 extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Simple Scene Graph Demo");
		
		FlowPane pane = new FlowPane();
		
		Label label = new Label("I am a label.");
		Label label2 = new Label("I am another label.");
		
		pane.getChildren().addAll(label, label2);
		
		Scene scene = new Scene(pane, 300, 200);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
