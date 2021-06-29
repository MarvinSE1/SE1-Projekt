package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class CustomLayer extends JPanel  {
	
	static int counterButton;
	
	CustomLayer(){
		setBackground(ColorUIResource.BLACK);
		setSize(500,200);
		setLayout(new GridLayout(1,5));
		
		
		
	}
	
	void addComponent() {}
	

}
