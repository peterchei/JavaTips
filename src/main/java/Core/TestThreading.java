package Core;

public class TestThreading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a = new ThreadA();
		Thread b = new ThreadB();
		a.start();
		b.start();

		for (int kk=0;kk<10;kk++) {
		try {
			synchronized (a) {
		
			
			System.out.println("BB");
			Thread.sleep(200);
			a.notify();
			a.wait();
		}
			//b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println(a.isInterrupted());
	
	}

}


class ThreadA extends Thread {
	public void run()   {
		synchronized(this) {
		for (int kk=0;kk<10;kk++) {
			
		
		
				
				try {
					
					notify();
					wait();
					Thread.sleep(100);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("A");
		}
		
		}
	}
}

class ThreadB extends Thread {
	public void run() {
		
	}
}