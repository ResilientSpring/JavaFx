package Oracle_example_code;

import javafx.application.Application;
import javafx.stage.Stage;

public class Register_a_handler extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		// Register an event handler for a single node and a specific event type
		node.addEventHandler(DragEvent.DRAG_ENTERED, 
		                    new EventHandler<DragEvent>() {
		                        public void handle(DragEvent) { ... };
		                    });

		// Define an event handler
		EventHandler handler = new EventHandler(<InputEvent>() {
		    public void handle(InputEvent event) {
		        System.out.println("Handling event " + event.getEventType()); 
		        event.consume();
		    }

		// Register the same handler for two different nodes
		myNode1.addEventHandler(DragEvent.DRAG_EXITED, handler);
		myNode2.addEventHandler(DragEvent.DRAG_EXITED, handler);

		// Register the handler for another event type
		myNode1.addEventHandler(MouseEvent.MOUSE_DRAGGED, handler);
		
	}
	
	

}
	
	// Source: https://docs.oracle.com/javafx/2/events/handlers.htm
