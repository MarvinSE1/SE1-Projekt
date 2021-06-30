package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

public class AndGate extends Gate {

	public AndGate() {
		setInputs(2);
		output = new ComponentOutput();
		output.setBounds(79, 40, 20, 20);
		add(output);
	}

	public boolean gateOP() {
		for (int i = 0; i < input.length; i++)
			if (input[i].getValue() == false)
				return false;
		return true;
	}

	public void setValue(boolean val) {
		input[0].setValue(val);
	}

	public void setSpecific(int index, boolean val) {
		input[index].setValue(val);
		actualiseOutput();
	}

	public void linkInput(int index, Connection conn) {
		input[index].setValue(conn.getValue());
	}

	public void actualiseOutput() {
		output.setValue(gateOP());
	}

	public void setAllForTests(boolean val) {
		for (int i = 0; i < input.length; i++) {
			input[i].setValue(val);
		}
	}

	public ComponentOutput getOutput() {
		return output;
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.drawString("And", 40, 21);
	}

}
