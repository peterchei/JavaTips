package UI;

import java.awt.Event;

public class TestEvent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventAdapter ed = new EventAdapter() {} ;
		
		ed.eventHappened(null);
	//	new EventPrinter().print(null) ;
	//	new EventAdapter() ;
	//	new EventAdapter(null) ;
		//new EventPrinter() {} ;
	}

}

abstract class EventAdapter {
	public void eventHappened(Event e) {
	}
}

class EventPrinter extends EventAdapter {
	public void eventHappened(Event e) {
		System.out.println(e);
	}
}

class EventGenerator {
	EventAdapter ev = null; // Event listener must be

	// set using // a call to
	// setEventAdapter.
	public void setEventAdapter(EventAdapter val) {
		ev = val;
	}
}
