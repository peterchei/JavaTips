package Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

public class TestExecutor {

	public static void main(String[] args) {

		new TestExecutor().action();

	}

	public void action() {
		ExecutorService es = java.util.concurrent.Executors
				.newCachedThreadPool();

		es.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("HELLO1");
				try {
					Thread.sleep(1000 * 1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("HELLO2");

			}

			private void sleep(int i) {
				// TODO Auto-generated method stub

			}
		});

		MyCallable mc = new MyCallable(0, 0);
		FutureTask<Integer> result = (FutureTask<Integer>) es.submit(mc);
		try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		es.shutdown();
	}

	protected class MyCallable implements Callable<Integer> {

		private long start;
		private long end;

		public MyCallable(long start, long end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public Integer call() throws Exception {
			ABC:
			
				for (int i=1;i<1000;i++) {
			System.out.println("calling");
			break ABC;
				}
			return 1;
		}
	}
}
