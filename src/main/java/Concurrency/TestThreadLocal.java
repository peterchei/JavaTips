package Concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestThreadLocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new Runnable() {
			public void run() {

				while (true) {
					System.out.println(dateFormatter.get().format(new Date()));
				}
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {

				while (true) {
					System.out.println(dateFormatter.get().format(new Date()));
				}
			}
		}).start();
		// dateFormatter.get().format(new Date());
	}

	private static final ThreadLocal<SimpleDateFormat> dateFormatter = new ThreadLocal<SimpleDateFormat>() {
		protected SimpleDateFormat initialValue() {
			System.out.println(" initValue");
			return new SimpleDateFormat("yyyyMMdd");
		};
	};

	// SimpleDateFormat is not thread-safe, so give one to each thread
	private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			System.out.println(" initValue");
			return new SimpleDateFormat("yyyyMMdd HHmm");
		}
	};

	public String formatIt(Date date) {
		return dateFormatter.get().format(date);
	}

}
