package Core;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;

class TestMain {
	
	public static void main(String arg[]) throws IOException{
		ByteArrayOutputStream b; 
		b = new ByteArrayOutputStream(); 
		ObjectOutputStream out; 
		out = new ObjectOutputStream(b); 
		out.writeObject(new StringBuffer("Hello")); 
		byte bArray[]= b.toByteArray();
		for (int i=0;i<bArray.length;i++)
		System.out.println(bArray[i]);

	}
	class Super {
		   protected void setOutput(URL u) throws IOException {
		       // .. Additional Code not shown ..
		   }
		}

		class Sub extends Super {
		   public void setOutput(URL u)                // Line A
		   throws IOException         // Line B
		   { /* .. Additional Code not shown .. */ }

		   private void setOutput(OutputStream o)      // Line C
		                   // Line D
		   { /* .. Additional Code not shown .. */ }

		   public boolean isOutputSet()                // Line E
		   { /* .. Additional Code not shown .. */ return true;}
		} 
}
