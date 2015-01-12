package Core;

public class TestSecurity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecurityManager sm = System.getSecurityManager();
		if (sm != null) {
			sm.checkRead("c:\\a.txt");
		}
		System.out.println("OK");

	}

}
