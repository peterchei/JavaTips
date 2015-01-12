package Core;

public enum MyEnum {
	
	ONE(1),
	TWO(2);
	
	MyEnum(int i) {
		a =i;
	}
	
	public int getValue() {
		return a;
	}
	
	private int a = 0;
	
	
	public  static void main(String args[]) {
		MyEnum myEnum = MyEnum.ONE;
		System.out.println(myEnum);
		System.out.println(MyEnum.values().length);
		
	}
}
