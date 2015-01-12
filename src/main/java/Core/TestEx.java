package Core;

public class TestEx {
	static class Ex1 extends Exception {
	}

	static class Ex2 extends Ex1 {
	}

	static class Ex3 extends Ex2 {
	}

	static void method1() throws Ex1, Ex2, Ex3 {
		throw new Ex1();
	}

	public static void main(String args[]) {
		try {
			method1();
		} catch (Ex3 e) {
			System.out.print("B");
		} catch (Ex2 e) {
			System.out.print("C");
		} catch (Ex1 e) {
			System.out.print("A");
		} catch (Exception e) {
			System.out.print("D");
		} finally {
			System.out.println("F");
		}
	}
}
