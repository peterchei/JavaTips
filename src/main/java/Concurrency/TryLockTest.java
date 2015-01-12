package Concurrency;

import java.util.concurrent.locks.Lock;

public class TryLockTest implements Runnable{
	
	private static Lock myLock = new java.util.concurrent.locks.ReentrantLock();

	public static void main(String[] args) {

		 new Thread(new Runnable() {	public void run() {
			 System.out.println(myLock.tryLock());
		     System.out.println("t locked");
		     System.out.println(myLock.tryLock());
		     System.out.println("t locked");
				
			}}).start(); 
		
	}
	

	public void run() {
        
		System.out.println(myLock.tryLock());
		
		System.out.println("r locked");
		
		System.out.println(myLock.tryLock());
		
		System.out.println("r locked");
	}

}
