package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

public class OrGate extends Gate implements Serializable{

	public OrGate() {
		setInputs(2);
		output = new ComponentOutput();
		output.setBounds(79, 40, 20, 20);
		add(output);
	}

	public boolean gateOP() {
		for (int i = 0; i < inputConnection.length; i++) {
			if (inputConnection[i] == null) {
				return false;
			}

			if (inputConnection[i].getValue() == true) {
				return true;
			}
		}

		return false;
	}

	public void setValue(boolean val) {
		input[0].setValue(val);
	}

	public void setAllForTests(boolean val) {
		for (int i = 0; i < input.length; i++) {
			input[i].setValue(val);
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.drawString("Or", 46, 21);
	}

}
