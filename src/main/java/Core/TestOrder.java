package Core;
public class TestOrder { 
	   static int deck[]=new int[25]; 

	   static { 
	       for (int j=0;j<deck.length;j++) deck[j]=j; 
	       System.out.println("Finished creating the deck"); 
	   } 


	   public static void main(String args[]) { 
	       System.out.println("Creating an Object"); 
	       TestOrder to=new TestOrder(); 
	       System.out.println("Finished creating"); 
	   } 
	} 
