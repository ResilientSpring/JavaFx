import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class SimpleSceneGraphDemo2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Simple Scene Graph Demo");
		
		FlowPane pane = new FlowPane();
		
		Label label = new Label("A simple JavaFX label.");
		
		pane.getChildren().add(label);
		
		Scene scene = new Scene(pane);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
