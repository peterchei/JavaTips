package Core;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeList();
	}

	
	public static void  writeList() {
	  
	    try (PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt")) ){
	        System.out.println("Entering" + " try statement");
	        for (int i = 0; i < 10; i++) {
	            out.println("Value at: " + i + " = " + (i));
	        }
	        out.write("K");
	    } catch (IndexOutOfBoundsException | IOException e) {
	    	   System.out.println("Caught IndexOutOfBoundsException: "
	                           +  e.getMessage());
	                                 
	    } finally {
	 
	
	            System.out.println("Done");
	    }
	}
}
