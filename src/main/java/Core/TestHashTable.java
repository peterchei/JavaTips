package Core;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestHashTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();
		
		//ht.put("a", null);
		
		HashMap hm = new HashMap();
		
		//Map m = Collections.synchronizedMap(new HashMap());
//		The HashMap class is roughly equivalent to Hashtable, except
		//that it is unsynchronized and permits nulls.)
		hm.put("a", null);  
		hm.put("a", "b");
		System.out.println(hm.size());
		
	}

}
