package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import runProgramm.runSim;

public class Connection {

	boolean value;
	private JPanel panel;
	Color color;

	// je ein Attribut pro input / output möglichkeit
	Gate connectionInput;

	Lamp lampConnection;
	Gate gateConnection;

	// im kosntruktor immer output übergeben
	public Connection(Gate gateOutput) {
		color = Color.black;
		panel = runSim.getMainWindow().getCanvas().getPanel();
		connectionInput = gateOutput;
		gateOutput.linkOutput(this);
	}

	// ebenfalls für jede mögliche kombination
	public void paint(Graphics g) {
		g.setColor(color);

		if (connectionInput != null && lampConnection != null) {
			g.drawLine(connectionInput.getX(), connectionInput.getY(), lampConnection.getX(), lampConnection.getY());
		} else if (connectionInput != null && gateConnection != null) {
			g.drawLine(connectionInput.getX(), connectionInput.getY(), gateConnection.getX(), gateConnection.getY());
		}
	}

	public void paintConnectionBlack() {
		color = Color.black;
		panel.repaint();
	}

	public void paintConnectionWhite() {
		color = Color.white;
		panel.repaint();
	}

	// läuft solange, wie ende (lampe) nicht erreicht
	// Fehler, wenn letzter output nicht erreicht
	// kann man fixen, sollte aber sowiso nicht
	public void calculateValue() {
		if (connectionInput != null) {
			value = connectionInput.gateOPv2();
		}

		if (lampConnection != null) {
			if (value) {
				lampConnection.lampOn();
			} else {
				lampConnection.lampOff();
			}
		} else if (gateConnection != null) {
			gateConnection.gateOPv2();
			gateConnection.getOutputConnection().calculateValue();
		}
	}

	// für jede Art von inputKomponente
	public void setInputConnection(Gate g) {
		gateConnection = g;

		if (connectionInput != null) {
			value = connectionInput.gateOPv2();
		}
	}

	public void setInputConnection(Lamp l) {
		lampConnection = l;

		if (connectionInput != null) {
			value = connectionInput.gateOPv2();
		}
	}

	// trennt verbindung zwischen 2 Komponenten
	// besser gesagt, inputVerbidung wird
	public void severInput() {
		lampConnection = null;
		gateConnection = null;
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
