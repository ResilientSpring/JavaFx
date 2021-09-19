import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class SimpleSceneGraphDemo5 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Simple Scene Graph");
		
		FlowPane pane = new FlowPane();
		
		Label label = new Label("Inflection point");
		Label label2 = new Label("Hedge fund");
		Label label3 = new Label("Coherent");
		
		pane.getChildren().addAll(label, label2, label3);
		
		Scene scene = new Scene(pane, 300, 200);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

}
