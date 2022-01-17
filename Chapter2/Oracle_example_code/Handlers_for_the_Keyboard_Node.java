package Oracle_example_code;

import java.security.Key;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Handlers_for_the_Keyboard_Node extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	private void installEventHandler(final Parent keyboardNode) {
		// handler for key pressed / released events not handled by
		// key nodes
		final EventHandler<KeyEvent> keyEventHandler = new EventHandler<KeyEvent>() {
			public void handle(final KeyEvent keyEvent) {
				final Key key = lookupKey(keyEvent.getCode());
				if (key != null) {
					key.setPressed(keyEvent.getEventType() == KeyEvent.KEY_PRESSED);

					keyEvent.consume();
				}
			}
		};

		keyboardNode.setOnKeyPressed(keyEventHandler);
		keyboardNode.setOnKeyReleased(keyEventHandler);

		keyboardNode.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			public void handle(final KeyEvent keyEvent) {
				handleFocusTraversal(keyboardNode, keyEvent);
			}
		});
	}

}

// Source: https://docs.oracle.com/javafx/2/events/handlers.htm
