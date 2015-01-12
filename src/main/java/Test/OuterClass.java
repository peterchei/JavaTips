package Test;

public class OuterClass {

	public int b =2;
	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		
		OuterClass.InnerClass ic = oc.new InnerClass() ;
		
		ic.hello();
	}
	
	public class InnerClass {
		public void hello() {
			System.out.println("hello" + b);
		}
	}
}
