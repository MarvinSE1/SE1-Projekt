package digitalsimulator;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Connection {

	boolean value;
	Switch connectionInputv1;
	Gate connectionInputv2;

	Lamp connectionOutputv1;
	Gate connectionOutputv2;

	public Connection(Switch switchOutput) {
		connectionInputv1 = switchOutput;
		switchOutput.linkOutput(this);
	}

	public Connection(Gate gateOutput) {
		connectionInputv2 = gateOutput;
		gateOutput.linkOutput(this);
	}

	public void paint(Graphics g) {
		if (connectionInputv1 != null && connectionOutputv1 != null) {
			g.drawLine(connectionInputv1.getX(), connectionInputv1.getY(), connectionOutputv1.getX(),
					connectionOutputv1.getY());
		} else if (connectionInputv2 != null && connectionOutputv1 != null) {
			g.drawLine(connectionInputv2.getX(), connectionInputv2.getY(), connectionOutputv1.getX(),
					connectionOutputv1.getY());
		} else if (connectionInputv1 != null && connectionOutputv2 != null) {
			g.drawLine(connectionInputv1.getX(), connectionInputv1.getY(), connectionOutputv2.getX(),
					connectionOutputv2.getY());
		} else if (connectionInputv2 != null && connectionOutputv2 != null) {
			g.drawLine(connectionInputv2.getX(), connectionInputv2.getY(), connectionOutputv2.getX(),
					connectionOutputv2.getY());
		}
	}

	public void calculateValue() {
		if (connectionInputv1 != null) {
			value = connectionInputv1.getValueSwitch();
		} else if (connectionInputv2 != null) {
			value = connectionInputv2.gateOPv2();
		}

		if (connectionOutputv1 != null) {
			if (value) {
				connectionOutputv1.lampOn();
			} else {
				connectionOutputv1.lampOff();
			}
		} else if (connectionOutputv2 != null) {
			connectionOutputv2.gateOPv2();
			connectionOutputv2.getOutputConnection().calculateValue();
		}
	}

	public void setInputConnection(Gate g) {
		connectionOutputv2 = g;

		if (connectionInputv2 != null) {
			value = connectionInputv2.gateOPv2();
		} else if (connectionInputv1 != null) {
			value = connectionInputv1.getValueSwitch();
		}
	}

	public void setInputConnection(Lamp l) {
		connectionOutputv1 = l;

		if (connectionInputv2 != null) {
			value = connectionInputv2.gateOPv2();
		} else if (connectionInputv1 != null) {
			value = connectionInputv1.getValueSwitch();
		}
	}

	public void severInput() {
		connectionOutputv1 = null;
		connectionOutputv2 = null;

		if (connectionInputv1 != null) {
			connectionInputv1.getOutput().disconnect();
		} else if (connectionInputv2 != null) {
			connectionInputv2.getOutput().disconnect();
		}
	}

	public boolean getValue() {
		return this.value;
	}

	public static void main(String[] args) {
		JFrame test = new JFrame("t");
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setLocationRelativeTo(null);
		test.setVisible(true);
		test.setSize(500, 500);
		Lamp l = new Lamp();
		Switch s1 = new Switch();
		Switch s2 = new Switch();
		Switch s3 = new Switch();
		NotGate g = new NotGate();
		NotGate g2 = new NotGate();
		OrGate g3 = new OrGate();
		AndGate g4 = new AndGate();

		test.add(s1);
		test.add(s2);
		test.add(s3);
		test.add(l);
		test.add(g);
		test.add(g2);
		test.add(g3);
		test.add(g4);
	}

}
