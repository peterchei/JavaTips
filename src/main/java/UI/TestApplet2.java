package UI;

import java.applet.Applet;
import java.sql.*; 
public class TestApplet2 extends Applet {   
	// Maintain a connection to our database while the Applet   
	//  is active.   
	Connection dbConnection=null;   
	static {      
	// *** Line A
		System.out.println("A");
		}   
	public TestApplet2() {  /* Line B */ 
		System.out.println("B");
		
	}   
	public void init() { /* Line C */ 
		System.out.println("C");
	}   
	public void start() {/* Line D */ 
		System.out.println("D");
	}  
	public void stop() { /* Line E */
		System.out.println("E");
	}   
	private void openDB() {     
		try {         String dbName=getParameter("dbName"); 
		dbConnection=          
			DriverManager.getConnection(dbName); 
		} catch (Exception e) {}  
		
	} 
}
