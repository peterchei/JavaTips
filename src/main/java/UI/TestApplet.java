package UI;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

public class TestApplet extends JApplet {
	public void init() {
		/*
		JButton b1 = new JButton("one");
		JButton b2 = new JButton("two");
		JButton b3 = new JButton("three");
		JButton b4 = new JButton("four");
		JButton b5 = new JButton("five");
		getContentPane().add(b1,0);
		getContentPane().add(b2,1);
		getContentPane().add(b3,2);
		getContentPane().add(b4,3);
		getContentPane().add(b5,4);
		//getContentPane().setLayout(new BorderLayout());
		System.out.println(getContentPane().getLayout().getClass().getName());
		*/
		String a[] = {"A","B"};
		   JList list = new JList(a); 
		   //list.getModel()("Hello"); 
		   //list.add("World"); 
		   getContentPane().add(list); 

	}
	/*
	public void paint(Graphics g) {
		g.setColor(java.awt.SystemColor.desktop);
		
		System.out.println("PP");
		super.paint(g);
		g.draw3DRect(10,10,100,100,true);
	}
	*/
	
}

class PeterPanel extends JPanel {
	
	
	public void drawThickLine(Graphics2D g, int x1, int y1, int x2, int y2){
		
		// set line thickness here g.drawLine(x1,y1,x2,y2);
	//	Stroke s = new Stroke();
		
	///	s.setWidth(10);
	//	g.setStroke(s); 
		
//		g.setBrush( new Brush(10.0) ); 
		
		//g.setLineWidth(10); 
		
		g.setStroke( new BasicStroke(10.0f) ); 
		//g.setPen( new DefaultPen(10) ); 

	}
	
}