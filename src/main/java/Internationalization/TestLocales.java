package Internationalization;

 

import java.util.*;
import java.text.*;

public class TestLocales {
    static public void main(String[] args) {
	Locale list[] = DateFormat.getAvailableLocales();
	for (int i=0;i<list.length;i++) {
	    System.out.println(list[i].toString());
	}
	Locale[] listOfLocales=Locale.getAvailableLocales(); 
	Date today;
	String dateOut;
	DateFormat dateFormatter;

	dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT,
						   list[0]);
	today = new Date();
	dateOut = dateFormatter.format(today);

	System.out.println(dateOut + " " + list[0].toString());

    }
}
