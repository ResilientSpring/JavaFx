import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class SimpleSceneGraphDemo3 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Scene Graph Demo");
		
		FlowPane pane = new FlowPane();
		
		Label label = new Label("This is a label.");
		
		pane.getChildren().add(label);
		
		Scene scene = new Scene(pane, 300, 200);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
