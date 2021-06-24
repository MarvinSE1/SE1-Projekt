package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Switch extends Component {
	
	private JButton switchButton;

	Switch(){
		output = new ComponentOutput();
		switchButton = new JButton();
		switchButton.setBounds(30,30,40,40);
		output.setBounds(79,40,20,20);
		add(switchButton);
		add(output);
	}
	
	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(getPositionX(),getPositionY(),getWidth(),getHeigth());
		g.setColor(Color.black);
		g.drawString("Switch", 33, 21);
		g.drawRect(getPositionX(),getPositionY(),getWidth()-1,getHeigth()-1);
		
	}
	
	public void turnSwitchOff() {
		output.setValue(false);
	}

	public void turnSwitchOn() {
		output.setValue(true);
	}

	public boolean getValueSwitch() {
		return output.getValue();
	}

public static void main(String[] args) {
		
		JFrame test = new JFrame("t");
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(500,500);
		Switch t = new Switch();
		Component t2 = new Component();
		test.add(t);
		test.add(t2);
	}
}
