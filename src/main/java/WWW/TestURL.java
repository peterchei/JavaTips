package WWW;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.text.html.HTMLDocument;

public class TestURL {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		Object content1=new URL("http://www.yahoo.com").getContent(); 
		System.out.println(content1);
		//HTMLDocument doc=HTMLDocument.create("http://www.brainbench.com"); 
		//Object content2=new URL("http://www.brainbench.com").readObject(); 
		//String content3=new FileInputStream("http://www.brainbench.com").read(); 
		//String content4=URL.getConnection("http://www.brainbench.com").getContent(); 

	}

}
