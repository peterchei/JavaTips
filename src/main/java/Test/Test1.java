package Test;



public class Test1{ 
	 public static void main(String[] args){ 
		 
		 
		 Test1 test1 = new Test1();
		 Test1 test2 = test1;
		 test1.Hello();
		 test2.Hello();
		 if (test1==test2) {
			 test1 = null;
		 }
		 System.out.println(test1);
		 test1.Hello();
		 ((Test1) test1).Hello();
		 
	 
	 } 
	 
	 
	 public static void Hello() {
		 System.out.println("Hello");
	 }
	} 
