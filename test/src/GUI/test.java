package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class test {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Test");
		JPanel inneresPanel=new JPanel();
		JPanel au�enPanel=new JPanel();
		JPanel rechts= new JPanel();
		JPanel links= new JPanel();
		JPanel unten= new JPanel();
		
		
		JLabel text=new JLabel("option ausw�hlen");
		
		
		GridLayout layout=new GridLayout(3, 1);
		BorderLayout border=new BorderLayout();
		inneresPanel.setLayout(layout);
		au�enPanel.setLayout(border);
		f.add(au�enPanel);
		
		
		
		
		
		
	
		f.setSize(600,800);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		
		
		JButton neu = new JButton("neu");
		neu.setSize(2, 01);
		
		JButton open = new JButton("open");
		open.setBounds(100, 200, 100, 100);
		JButton close = new JButton("close");
		close.setBounds(100, 300, 100,100);
		
		
		inneresPanel.add(neu);
		inneresPanel.add(open);
		inneresPanel.add(close);
		
	
		
		au�enPanel.add(inneresPanel, BorderLayout.CENTER);
		au�enPanel.add(text, BorderLayout.NORTH);
		au�enPanel.add(rechts,BorderLayout.EAST);
		au�enPanel.add(links,BorderLayout.WEST);
		au�enPanel.add(unten,BorderLayout.SOUTH);
		
		
		
	
		
		
	
	
		
		f.setVisible(true);
	}
	
}
