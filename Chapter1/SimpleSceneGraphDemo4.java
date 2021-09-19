import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class SimpleSceneGraphDemo4 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Simple Scene Graph");
		
		FlowPane pane = new FlowPane();
		
		Label label = new Label("This is label.");
		
		Label label2 = new Label("This is label2.");
		Label label3 = new Label("This is label3.");
		
		pane.getChildren().add(label);
		pane.getChildren().add(label2);
		pane.getChildren().add(label3);
		
		Scene scene = new Scene(pane, 300, 200);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}

}
