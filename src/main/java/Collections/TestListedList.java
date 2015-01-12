package Collections;

import java.util.LinkedList;

public class TestListedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		
		if (myList.contains("1")) System.out.println("OK");
		
	}

}
