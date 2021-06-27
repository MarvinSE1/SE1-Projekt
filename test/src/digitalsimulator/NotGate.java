package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

public class NotGate extends Gate {
	
	NotGate(){
		setInputs(1);
		//output = new ComponentOutput();
		//output.setBounds(79, 40, 20, 20);
		//add(output);
	}

	public boolean  gateOP() {
		if (input[0].getValue() == true)
			return false;
		else
			return true;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.drawString("Not", 40, 21);
	}
	
	

}
