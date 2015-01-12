package Core;

public class TestDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class AmyInterfaceImpl implements myinterface {

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public interface myinterface {
		
		default public void method1(){
			System.out.println("hello");
		}
	}
	
}
