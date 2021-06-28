package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Lamp extends Component {

	public Lamp() {
		//super();
		input = new ComponentInput[1];
		input[0] = new ComponentInput();
		input[0].setBounds(0, 40, 20, 20);
		add(input[0]);
	}

	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillOval(getPositionX(), getPositionY(), getWidth(), getHeigth());
		g.setColor(Color.black);
		g.drawString("Lamp", 33, 53);
		g.drawRect(getPositionX(), getPositionY(), getWidth() - 1, getHeigth() - 1);
		g.drawOval(getPositionX(), getPositionY(), getWidth(), getHeigth());
		
		g.setColor(new Color(230,239,255));
		g.fillRect(0, 40, 19, 19);
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(0, 40, 19, 19);
	}

	public void lampOff() {
		setBackground(Color.GRAY);
	}

	public void lampOn() {
		setBackground(Color.YELLOW);
	}

	public boolean getLampStatus() {
		return input[0].getValue();
	}

	public static void main(String[] args) {
		JFrame test = new JFrame("t");
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(500, 500);
		Lamp t = new Lamp();
		Component t2 = new Component();
		test.add(t);
		test.add(t2);
		t.lampOn();
	}
}
