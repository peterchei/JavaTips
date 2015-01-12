package Core;

import java.util.ArrayList;

public class TestAccess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new sub1().mm();
		//java.awt.Toolkit.getDefaultToolkit().getsy
	}
	
	int getResult() {return 1;};
	
	protected int getResult2() {return 1;};
	
	public int getResult3() {return 1;};

}

class sub1 {
	
	void mm () {
		new TestAccess().getResult3();
		new TestAccess().getResult2();
		new TestAccess().getResult();
		ArrayList a = new ArrayList();
		
		
	}
}


