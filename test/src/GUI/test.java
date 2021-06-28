package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class test extends JFrame {
	
	test(){
		JFrame mFrame=new JFrame("Digitalsimulator");
		mFrame.setSize(500,300);
		JPanel inPanel=new JPanel();
		
		
		inPanel.setLayout(new GridLayout(4,1));
		
		mFrame.setLayout(new BorderLayout(2000,2000));
		
		
		//Komponent erstellen
		JButton neu=new JButton("neu");
		JButton open=new JButton("open Project");
		JButton mode=new JButton("mode");
		JButton exit=new JButton("exit");
		JPanel rechts= new JPanel();
		rechts.setSize(200, 400);
		JPanel links= new JPanel();
		links.setSize(200, 400);
		JPanel unten= new JPanel();
		unten.setSize(400,200);
		JPanel oben= new JPanel();
		oben.setSize(400,200);
		

		
		//Komponent add
		
		mFrame.add(oben,BorderLayout.NORTH);
		mFrame.add(rechts,BorderLayout.EAST);
		mFrame.add(unten,BorderLayout.SOUTH);
		mFrame.add(links,BorderLayout.WEST);
		mFrame.add(inPanel,BorderLayout.CENTER);
		
		
		inPanel.add(neu,0,0);
		inPanel.add(open,1,0);
		inPanel.add(mode,2,0);
		inPanel.add(exit,3,0);
		
	
		
		mFrame.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		JFrame mFrame=new JFrame("Digitalsimulator");
		mFrame.setIconImage(null);
		mFrame.setSize(500,300);
		mFrame.setLocationRelativeTo(null);
		JPanel inPanel=new JPanel();
		inPanel.setSize(200,200);
		
		
		inPanel.setLayout(new GridLayout(4,1,1,1));
		
		mFrame.setLayout(new BorderLayout(50,50));
		
		
		//Komponent erstellen
		JButton neu=new JButton("neu");
		JButton open=new JButton("open Project");
		
		JButton exit=new JButton("exit");
		JPanel rechts= new JPanel();
		rechts.setSize(200, 400);
		JPanel links= new JPanel();
		links.setSize(200, 400);
		JPanel unten= new JPanel();
		unten.setSize(400,200);
		JPanel oben= new JPanel();
		oben.setSize(400,200);
		//Komponent add
		
		
		mFrame.add(oben,BorderLayout.NORTH);
		mFrame.add(rechts,BorderLayout.EAST);
		mFrame.add(unten,BorderLayout.SOUTH);
		mFrame.add(links,BorderLayout.WEST);
		mFrame.add(inPanel,BorderLayout.CENTER);
		
		
		inPanel.add(neu,0,0);
		inPanel.add(open,1,0);
		inPanel.add(exit,3,0);
		
		
	
		
		mFrame.setVisible(true);
		
		
//		JFrame f = new JFrame("Test");
//		JPanel inneresPanel=new JPanel();
//		JPanel außenPanel=new JPanel();
//		JPanel rechts= new JPanel();
//		JPanel links= new JPanel();
//		JPanel unten= new JPanel();
//		
//		
//		JLabel text=new JLabel("option auswählen");
//		
//		
//		GridLayout layout=new GridLayout(3, 1);
//		BorderLayout border=new BorderLayout();
//		inneresPanel.setLayout(layout);
//		außenPanel.setLayout(border);
//		f.add(außenPanel);
//		
//		
//		
//		
//		
//		
//	
//		f.setSize(600,800);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setLocationRelativeTo(null);
//		
//		
//		
//		JButton neu = new JButton("neu");
//		neu.setSize(2, 01);
//		
//		JButton open = new JButton("open");
//		open.setBounds(100, 200, 100, 100);
//		JButton close = new JButton("close");
//		close.setBounds(100, 300, 100,100);
//		
//		
//		inneresPanel.add(neu);
//		inneresPanel.add(open);
//		inneresPanel.add(close);
//		
//	
//		
//		außenPanel.add(inneresPanel, BorderLayout.CENTER);
//		außenPanel.add(text, BorderLayout.NORTH);
//		außenPanel.add(rechts,BorderLayout.EAST);
//		außenPanel.add(links,BorderLayout.WEST);
//		außenPanel.add(unten,BorderLayout.SOUTH);
//		
//		
//		
//	
		
		
	
	
		
//		f.setVisible(true);
	}
	
}
