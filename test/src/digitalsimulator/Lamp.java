package digitalsimulator;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Lamp extends Component {
	
	Lamp(){
		input = new ComponentInput[1];
		value = input[0].getValue();
	}

	
	public void paint(Graphics g) {
	}
	
	public void lampOff() {
		
	}

	public void lampOn() {
		
	}

	public boolean getLampStatus() {
		return value;
	}

	
	
public static void main(String[] args) {
		
		JFrame test = new JFrame("t");
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(500,500);
		
		Component t = new Component();
		Component t2 = new Component();
		test.add(t);
		test.add(t2);
	}
}
