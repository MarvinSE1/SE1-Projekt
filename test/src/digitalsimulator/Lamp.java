package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Lamp extends Component {
	
	Lamp(){
		super();
		input = new ComponentInput[1];
		input[0] = new ComponentInput();
		input[0].setBounds(0,40,20,20);
		add(input[0]);
		
	}

	
	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillOval(getPositionX(),getPositionY(),getWidth(),getHeigth());
		g.setColor(Color.black);
		g.drawString("Lamp", 33, 53);
		g.drawRect(getPositionX(),getPositionY(),getWidth()-1,getHeigth()-1);
		g.drawOval(getPositionX(),getPositionY(),getWidth(),getHeigth());
		
	}
	
	public void lampOff() {
		setBackground(Color.GRAY);
	}

	public void lampOn() {
		setBackground(Color.YELLOW);
	}
	
	public boolean getLampStatus() {
		value = input[0].getValue();
		return value;
	}

	
	
public static void main(String[] args) {
		
		JFrame test = new JFrame("t");
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(500,500);
		Lamp t = new Lamp();
		Component t2 = new Component();
		test.add(t);
		test.add(t2);
		t.lampOn();
		
	}
}


