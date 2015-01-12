package Test;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 0, ch2 = 0;
		try { ch1 = (char) System.in.read();}
		catch (Exception ex) {
			
		}
		
		switch (ch1) {
		case 'a':
			ch2 ='1';
		case 'b':
			ch2 ='2';
		case 'c':
			ch2='3'
			;
			default:
				ch2='4';
				
			
		}
		
		System.out.println(ch2);
		System.out.println("XX" + args);
	}

}
