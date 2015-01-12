package Test;

public class Test5 {

	public static void main(String args[]) {
		X x = new Y();
		System.out.println(x.i + " : " + x.getV());
	}
}

class X {
	Integer i = 5;
	public int getV() {
		return i;
	}
}

class Y extends X {
	Integer i = 10;
	
	public int getV() {
		return ((X) this).i;
	}
}
