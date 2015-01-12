package UI;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestBox extends JFrame{ 
	 public static void main(String[] args){ 
		 TestBox bt = new TestBox(); 
	   Box box = Box.createVerticalBox(); 
	   box.add(new JButton("One1")); 
	   box.add(Box.createVerticalStrut(10)); 
	   box.add(new JButton("Two2")); 
	   box.add(Box.createVerticalGlue()); 
	   box.add(new JButton("Two3")); 
	   bt.getContentPane().add(box); 
	   bt.pack(); 
	   bt.show(); 
	 } 
	} 
