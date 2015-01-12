package Core;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization {
	public static void main(String a[]) throws IOException {
		
		ByteArrayOutputStream b; 
		b = new ByteArrayOutputStream(); 
		ObjectOutputStream out; 
		
		B bb = new B();
		A aa = new A();
		
		bb.setA(aa);
		aa.setB(bb);
		
		
		

		out = new ObjectOutputStream(b); 
		out.writeObject(aa); 
		//out.writeObject(new StringBuffer("Hello")); 
		byte bArray[]= b.toByteArray(); 
		System.out.println(new String(bArray));
	}
	
	
}


class A implements Serializable {
	
	B b = new B();
	public void setB(B bb) {
		b = bb;
	}
}

class B implements Serializable {
	A a = null;
	public void setA(A aa) {
		a = aa;
	}
}



