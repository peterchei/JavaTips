package Core;

import java.text.Collator;
import java.util.Locale;

public class TestCollator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Get the Collator for US English and set its strength to PRIMARY
		 Collator usCollator = Collator.getInstance(Locale.US);
		 usCollator.setStrength(Collator.PRIMARY);
		 if( usCollator.compare("abc", "ABC") == 0 ) {
		     System.out.println("Strings are equivalent");
		 }


	}

}
