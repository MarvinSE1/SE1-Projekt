package digitalsimulator;

import javax.swing.*;
import java.awt.*;

public class Component extends JComponent {
	
	private boolean value;
	
	Component(){
		setBorder(BorderFactory.createLineBorder(Color.black));
		this.setBackground(Color.GRAY);
		this.setVisible(true);
	}
	
	
	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(30,30,100,100);
//		g.drawRect(30, 30, WIDTH, HEIGHT);
	}
	
	public boolean getValue() {	
		return this.value;
	}
	
	public void setValue(boolean newValue) {
		this.value = newValue;
	}
	
	public static void main(String[] args) {
		
		JFrame test = new JFrame("t");
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(500,500);
		test.setLayout(new GridLayout(5,5));
//		test.setLayout(new FlowLayout());
		
		Component t = new Component();
		test.add(t);
		
	}
}
