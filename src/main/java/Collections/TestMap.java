package Collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] a) {
		
		
		SortedMap map = new TreeMap();
		map.put("b", "7");
		map.put("a", "1");
		
		map.put("c", "2");
		
		Object array[] = map.keySet().toArray();
		for (int i=0;i<array.length;i++){
		System.out.println(array[i]);
		}
		//int x = -1; x = x >>> 5; 
		//byte x = -1;
		//System.out.println(x);
		//x =(byte) ( x >> 1 ); 
		int x = -1; x = x >>> 32; 
		//int x = -1; x = x << 16; 
		//int x = -1; x = x >> 5; 
		//x=-1;
		for (int i=1;i<=32;i++) {
		int jj = 32-i;
		System.out.print((x >>>(jj)) & 1);
		
		
		
		   X xx = new Y(); 
		   System.out.println("x.i = " + xx.i );
		   System.out.println(xx.getClass());
		
		}
		
		
		SecurityManager sm = System.getSecurityManager(); 
		if(sm != null) { 
		   sm.checkRead("filename.txt"); 
		} 

		
	}
}


class X{ public int i=5; } 
class Y extends X{ public int i=10; } 


