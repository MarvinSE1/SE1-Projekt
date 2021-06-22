package GUI;

import javax.swing.*;

public class starterWindow {

	public static void main(String[] args) {
		
		JFrame startWindow = new JFrame();
		
		JButton openFile = new JButton("Open File");
		JButton newProject = new JButton("New Project");
		JButton close = new JButton("Close");
		
		openFile.setBounds(130,50,100,40);
		newProject.setBounds(130,100,100,40);
		close.setBounds(130,150,100,40);
		
		startWindow.add(openFile);
		startWindow.add(newProject);
		startWindow.add(close);
		
		startWindow.setSize(400,400);
		startWindow.setLayout(null);
		startWindow.setVisible(true);
	}
	
	
	
	
}
