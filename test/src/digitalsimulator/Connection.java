package digitalsimulator;

import java.awt.Color;
import java.io.Serializable;

import javax.swing.JPanel;

import runProgramm.runSim;

public class Connection implements Serializable {

	boolean value;
	private JPanel panel;

	// je ein Attribut pro input / output möglichkeit
	Gate connectionInput;

	Lamp lampConnection;
	Gate gateConnection;

	// im kosntruktor immer output übergeben
	public Connection(Gate gateOutput) {
		panel = runSim.getMainWindow().getCanvas().getPanel();
		connectionInput = gateOutput;
		gateOutput.linkOutput(this);
	}

	public void paintConnectionBlack() {
		panel.getGraphics().setColor(Color.black);
		System.out.println(panel.getGraphics().getColor());

		if (connectionInput != null && lampConnection != null) {
			panel.getGraphics().drawLine(connectionInput.getX() + connectionInput.getOutput().getX() + 10,
					connectionInput.getY() + connectionInput.getOutput().getY() + 10, lampConnection.getX(),
					lampConnection.getY());
		} else if (connectionInput != null && gateConnection != null) {
			panel.getGraphics().drawLine(connectionInput.getX() + connectionInput.getOutput().getX() + 10,
					connectionInput.getY() + connectionInput.getOutput().getY() + 10, gateConnection.getX(),
					gateConnection.getY());
		}
	}

	public void paintConnectionWhite() {
		panel.getGraphics().setColor(Color.white);
		System.out.println(panel.getGraphics().getColor());

		if (connectionInput != null && lampConnection != null) {
			panel.getGraphics().drawLine(connectionInput.getX() + connectionInput.getOutput().getX() + 10,
					connectionInput.getY() + connectionInput.getOutput().getY() + 10, lampConnection.getX(),
					lampConnection.getY());
		} else if (connectionInput != null && gateConnection != null) {
			panel.getGraphics().drawLine(connectionInput.getX() + connectionInput.getOutput().getX() + 10,
					connectionInput.getY() + connectionInput.getOutput().getY() + 10, gateConnection.getX(),
					gateConnection.getY());
		}
	}

	// läuft solange, wie ende (lampe) nicht erreicht
	// Fehler, wenn letzter output nicht erreicht
	public void calculateValue() {
		if (connectionInput != null) {
			value = connectionInput.gateOP();
		}

		if (lampConnection != null) {
			if (value) {
				lampConnection.lampOn();
			} else {
				lampConnection.lampOff();
			}
		} else if (gateConnection != null) {
			gateConnection.gateOP();
			gateConnection.getOutputConnection().calculateValue();
		}
	}

	// für jede Art von inputKomponente
	public void setInputConnection(Gate g) {
		gateConnection = g;

		if (connectionInput != null) {
			value = connectionInput.gateOP();
		}
	}

	public void setInputConnection(Lamp l) {
		lampConnection = l;

		if (connectionInput != null) {
			value = connectionInput.gateOP();
		}
	}

	// inputKomponente wird gelöscht
	public void severInput() {
		lampConnection = null;
		gateConnection = null;
	}

	public boolean getValue() {
		return this.value;
	}

}
