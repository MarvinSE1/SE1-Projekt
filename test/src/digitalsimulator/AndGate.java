package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

public class AndGate extends Gate {
	
	AndGate(){
		setInputs(2);
	}

	public boolean  gateOP() {
		for (int i = 0; i < input.length; i++)
			if (input[i].getValue() == false)
				return false;
		return true;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.drawString("And", 33, 53);
	}

}
