package Core;

import java.util.List;

public class TestGeneric<Kx, MY extends MyInterface2 & MyInterface> {
	
	private Kx a;
	private MY x;
	
	
	public static void hello(List<? extends Number> list) {
		System.out.format("hello %d",  "A");
	}
	
	public static void hello2(List<String> list) {
		System.out.format("hello %d ", "O");
	}
	
	public static <T> void hello3(List<T> list) {
		System.out.format("hello %d",  "A");
	}

}
