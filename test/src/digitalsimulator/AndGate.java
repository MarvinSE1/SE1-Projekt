package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

public class AndGate extends Gate {

	private Connection[] inputConnections;
	private Connection[] outputConnection;

	public AndGate() {
		setInputs(2);
		output = new ComponentOutput();
		output.setBounds(79, 40, 20, 20);
		add(output);
		inputConnections = new Connection[input.length];
		outputConnection = new Connection[1];
	}

	public boolean gateOP() {
		for (int i = 0; i < input.length; i++)
			if (input[i].getValue() == false)
				return false;
		return true;
	}

	public boolean gateOPv2() {
		for (int i = 0; i < inputConnections.length; i++) {
			if (inputConnections[i] == null) {
				return false;
			}

			inputConnections[i].calculateValue();

			if (inputConnections[i].getValue() == false) {
				return false;
			}

		}

		return true;
	}

	public void linkInput(int index, Connection conn) {
		inputConnections[index] = conn;
	}

	public void linkToConnection(Connection conn) {
		outputConnection[0] = conn;
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.drawString("And", 40, 21);
	}

	// Testmethoden

	public void setSpecific(int index, boolean val) {
		input[index].setValue(val);
		actualiseOutput();
	}

	public void setAllForTests(boolean val) {
		for (int i = 0; i < input.length; i++) {
			input[i].setValue(val);
		}
	}

	public void actualiseOutput() {
		output.setValue(gateOP());
	}

}
