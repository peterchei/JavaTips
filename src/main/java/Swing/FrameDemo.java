package Swing;

import java.awt.event.*;
import java.lang.reflect.InvocationTargetException;

import javax.swing.*;
import javax.swing.text.JTextComponent;

/* FrameDemo.java requires no other files. */
public class FrameDemo {

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    private static void createAndShowGUI() {

        java.awt.Panel panel[] = new java.awt.Panel[3];
        panel[0] = new java.awt.Panel();
        panel[0].setSize(500, 500);
        panel[0].setLayout(new java.awt.BorderLayout());
        panel[1] = new java.awt.Panel();
        panel[1].setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        panel[0].add(panel[1], "South");
        panel[2] = new java.awt.Panel();
        panel[2].setSize(400, 400);
        panel[0].add(panel[2], "Center");
        java.awt.Button button1 = new java.awt.Button("Click Me!");
        panel[1].add(button1);
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionEvent e = null;
        frame.add(panel[0]);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
        System.out.println("Done");
        /*
         //Create and set up the window.
         JFrame frame = new JFrame("FrameDemo");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JLabel emptyLabel = new JLabel("XXX");
        
         emptyLabel.setBorder(BorderFactory.createEmptyBorder(
         100/2, //top
         50,     //left
         10/2, //bottom
         0));
         emptyLabel.setPreferredSize(new Dimension(175, 100));
         frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        
       
         Font f = new Font("Batang", Font.BOLD, 10); 
         emptyLabel.setFont(new Font("Batang", Font.BOLD, 77));
         //g.setFont(f); 
         // g.drawString(text, 20, 20); 
        	 

        
        
         //Display the window.
         frame.pack();
         frame.setVisible(true);
         System.out.println("Done");
         */

    }

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        System.out.println("HELLO");

    }

    class TestInnerClass {

        public void setTheTextBox(final JTextComponent cmp, final String a) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    cmp.setText(a);
                }
            });

        }
    }

}
