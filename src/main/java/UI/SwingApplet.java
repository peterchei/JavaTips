package UI;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class SwingApplet extends JApplet {
	public void init() {
		
		JPanel contentPane = new JPanel(new BorderLayout());
		System.out.println(contentPane.getLayout().toString());
		//contentPane.setBorder(2);
		contentPane.add(new JButton("2"), BorderLayout.CENTER);
		contentPane.add(new JButton("1"), BorderLayout.PAGE_END);

//		Make it the content pane.
		contentPane.setOpaque(true);
		this.setContentPane(contentPane);
		
		
		
		JList list = new JList();
		JList list2 = new JList(new String[]{"1","2","3"});
		DefaultListModel listMod = new DefaultListModel();
		listMod.addElement("A");
		listMod.addElement("B");
		list.setModel(listMod);
		getContentPane().add(list, BorderLayout.EAST);
		getContentPane().add(list2, BorderLayout.WEST);
		contentPane.add(new JButton("3"));
		JMenuBar mb = new JMenuBar();
		
		this.getRootPane().setJMenuBar(new JMenuBar());
	}
}
