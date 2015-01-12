package Test;

public class Test2 {

	
	public static void foo(String s[]) {
		s[0] = "bye";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = new String[] {"hello", "world"};
		args = new String[] {"hello", "world"};
		foo(a);
		System.out.println(a[0] + " : "  + a[1]);
		java.lang.Runtime.getRuntime();
	}

}
