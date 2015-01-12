package Core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NestedClassTest {
	
	private int member1;
	private static int staticmember;
	final int ppp;
	int pdpp[]= {1,2,3,4};
	int abc[] = new int[4];
	int abdc[] = new int[]{1,2,3,4};
	
	public NestedClassTest() {
		ppp=32;
	}
	public static void main(String args[]){
		int xxxx=10;
		String strAA = new String("AA");
		System.out.println(strAA.equals("AA"));
		int grade = 70;
		boolean a = false & (grade == 70);
		System.out.println ("S" +  a);
		
		new IC();
		
		new NestedClassTest().new IC2();
		
		//xxxx=xxxx/0;
		float fnumber = 2;
		boolean b1 = true;
		boolean b2 = true;
		System.out.print(b1 ^ b2 );
		String strV = "A";
		int intXXX=9;
		switch (intXXX) {
		case 1:
		
			break;
		default:
				
			
		case 2:
		}
		//System.out.println(xxxx);
	}
	
	public void start(final int localxx) {
		
		int localmember=0;
		new IC2();
		class Listener implements ActionListener{
			public void actionPerformed(ActionEvent evt) {
				System.out.println(localxx);
				
			};
				
		
		
			
	
		};
	}
	
	//member inner class
	class IC2 {
		public void m1() {
	//		member1++;
			staticmember++;
		}
		
	};

	//static inner class
	static class IC {
		public void m1() {
	//		member1++;
			staticmember++;
		}
		
	};
	
	

}
