package Core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestEnumeration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Vector();
		new ArrayList();
		
		List list = Collections.synchronizedList(new ArrayList());
		Hashtable a = new Hashtable();
		a.put("1","XX");
		a.put("21","XX");
		a.put("31","XX");
		a.put("41","XX");
		a.keys();
		
	     for (Enumeration e = a.keys() ; e.hasMoreElements() ;) {
	         System.out.println(e.nextElement());
	     }
	     
	     Iterator it = a.keySet().iterator(); 
	     while (it.hasNext()) {
	    	 System.out.println(it.next());
	     }
	}

}
