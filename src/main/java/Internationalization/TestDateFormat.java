package Internationalization;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDateFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today;
		String result;
		SimpleDateFormat formatter;
		Locale currentLocale = new Locale("en","US");
		Locale.getAvailableLocales();
		Locale.getDefault();

		formatter = new SimpleDateFormat("EEE d MMM yy",
						 currentLocale);
		today = new Date();
		result = formatter.format(today);
		System.out.println("Locale: " + currentLocale.toString());
		System.out.println("Result: " + result);

	}

}
