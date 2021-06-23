package GUI;

import javax.swing.*;

public class starterWindow extends JFrame {

	public static void main(String[] args) {
		
		JFrame startWindow = new JFrame("DigitalSim");
		JPanel start=new JPanel();
		start.setLayout(new BorderLayout());
		JButton openFile = new JButton("Open File");
		JButton newProject = new JButton("New Project");
		JButton close = new JButton("Exit");
		
		openFile.setBounds(130,50,100,40);
		newProject.setBounds(130,100,100,40);
		close.setBounds(130,150,100,40);
		
		
		startWindow.add(openFile);
		startWindow.add(newProject);
		startWindow.add(close);
		
		
		startWindow.setLayout(null);
		startWindow.setVisible(true);
		
	}
	
	
	
	
}
