package Collections;

import java.util.HashMap;
import java.util.Hashtable;

public class TestHashTable {

	public static void main(String[] args) {
		
		
		//Hashtable<String, Integer> hashTable1 =  new Hashtable<String, Integer> (3);
		HashMap<String, Integer> hashTable1 =  new HashMap<String, Integer> (3);
		
		Integer v = new Integer(1);
		
		hashTable1.put("One", v);
		hashTable1.put("Two", v);
		hashTable1.put("Three", v);
		hashTable1.put("Four", v);
		hashTable1.put("Five", v);
		hashTable1.put("Six", v);
		
		
		hashTable1.get("Three");

	}

}
