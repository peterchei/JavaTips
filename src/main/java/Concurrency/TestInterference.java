package Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class TestInterference {

	private long unsafeCounter = 0;
	private volatile long counter = 0;
	private AtomicInteger atomicCounter = new AtomicInteger(0);
	private Scounter sc = new Scounter();

	class Scounter {
		private long counter =0;
		
		public synchronized void increment() {
			counter++;
		}
		
		public long getValue() {
			return counter;
		}
		
	}
	
	public void test() {
		
		

		Thread[] t = new Thread[10];
		
		
		for (int j = 0; j < 10; j++) {
			t[j] = newThreadAndRun();
		}

		for (int j = 0; j < 10; j++) {
			try {
				t[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("unsafe Counter final value is : " + unsafeCounter);
		System.out.println("Volatile Counter final value is : " + counter);
		System.out.println("AtomicCounter final value is : " + atomicCounter);
		System.out.println("Synchronized Counter final value is : " + sc.getValue());
		
	}
	public static void main(String[] args) {

		new TestInterference().test();

	}

	public  Thread newThreadAndRun() {

		Thread t = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					unsafeCounter++;
					counter++;
					atomicCounter.incrementAndGet();
					sc.increment();
				}

			}
		});
		t.start();
		return t;
	}

}
