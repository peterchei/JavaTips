package Other;

import Core.TestAccess;

public class TestAccess2 extends TestAccess{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
		
		

		new Thread(
				new Runnable() {
					public void run()  {
						for (int i=0;i<100;i++){
							System.out.println(i);
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						System.out.println("T done.");
					}
				}).start();
		System.out.println("M done.");
	}
	
	public void method() {
		this.getResult2();
		new Core.TestAccess().getResult3();
	
		
	}
	

}


