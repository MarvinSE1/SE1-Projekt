package GUI;

import javax.swing.*;

public class test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JButton b = new JButton("Hello");
		b.setBounds(130,100,100,40);
		
		f.add(b);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
}
