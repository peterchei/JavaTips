package Core;

import java.io.File;
import java.util.List;

public class TestGenerics {

	private static TestGenerics.MobileDevice<String, String> obj;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		obj = new TestGenerics.MobileDevice<>(String.class);

		obj.print();
		
		new TestGenerics.MobileDevice(Object.class).print();
	}
	
	
    
	public static class MobileDevice<T ,  K > {
    	
    	public MobileDevice(Class<T> cls) {
    		
    		try {
				os = cls.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
		private T os; // Cannot Decalare Staticlic  fields whose types are type parameters
	
		public void print() {
			System.out.println(os.getClass().getName());
		}
	}
    

}
