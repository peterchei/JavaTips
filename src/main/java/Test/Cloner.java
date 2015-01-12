package Test;

public class Cloner implements Cloneable {

	private transient int a =10;
	public Cloner(int b) {
		a =b;
	}
	
	public int getV() {
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Cloner aCloner =  (Cloner) new Cloner(1);
			Cloner bCloner = (Cloner)aCloner.clone();
			System.out.println(aCloner.equals(bCloner));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
