package Chapter1;

import java.security.MessageDigest;

import javafx.application.*;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class HelloJavaFX extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button button = new Button();
		Text text = new Text();
		
		button.setText("Say 'Hello World'");
		button.setOnAction(event -> {
			text.setText("Hello World! JavaFX style :)");
			});
		
		VBox rootBox = new VBox(10, button, text);
		rootBox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(rootBox, 300, 250);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Hello JavaFX 8 World!");
		
		primaryStage.show();
	}

}
