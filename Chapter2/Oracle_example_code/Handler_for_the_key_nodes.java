package Oracle_example_code;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Handler_for_the_key_nodes extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	private void installEventHandler(final Node keyNode) {
		// handler for enter key press / release events, other keys are
		// handled by the parent (keyboard) node handler
		final EventHandler<KeyEvent> keyEventHandler = new EventHandler<KeyEvent>() {
			public void handle(final KeyEvent keyEvent) {
				if (keyEvent.getCode() == KeyCode.ENTER) {
					setPressed(keyEvent.getEventType() == KeyEvent.KEY_PRESSED);

					keyEvent.consume();
				}
			}
		};

		keyNode.setOnKeyPressed(keyEventHandler);
		keyNode.setOnKeyReleased(keyEventHandler);
	}

}
