package Core;

public class TestArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMethods("1","2","3","4","5");
	}
	
	
	public static void testMethods(String... a) {
		System.out.println(a.length);
		System.out.printf("Arg %s, %s", a[0], a[1]);
	}

}
