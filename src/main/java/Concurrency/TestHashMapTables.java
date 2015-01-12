package Concurrency;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMapTables {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(null, null);
		
		test(null, "null");
		
		test("1", null);
	}

	/**
	 * @param key
	 * @param value
	 */
	public static void test(String key, String value) {
		
	
		HashMap<String, String> hm = new HashMap<String, String>(100);

		Hashtable<String, String> ht = new Hashtable<String, String>(100);

		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>(
				100);

		System.out.println("Test HashMap put " + key + " : " + value  );
		
		try {
			hm.put(null, value);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		

		System.out.println("Test Hashtable put " + key + " : " + value  );
		

		try {
			ht.put(null, value);
		} catch (Exception ex) {
			ex.printStackTrace();
		}


		System.out.println("Test ConcurrentHashMap put " + key + " : " + value  );
		
		try {

			chm.put(null, value);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
