package digitalsimulator;

public class Connection {

	boolean value;
	ComponentInput connenctionOutput;
	ComponentOutput connectionInput;
	Switch connectionInputv2;

	public Connection(ComponentOutput gateOutput) {
		connectionInput = gateOutput;
		value = connectionInput.getValue();
	}

	public Connection(Switch switchOutput) {
		connectionInputv2 = switchOutput;
		value = connectionInputv2.getValueSwitch();
	}

	public boolean getValue() {
		return this.value;
	}

	public void initialiseOutput(ComponentInput newInput) {
		connenctionOutput = newInput;
	}

	public ComponentInput getConnection() {
		return connenctionOutput;
	}

	public void calculateValue() {
		if (connectionInput != null) {
			value = connectionInput.getValue();
		}

		if (connectionInputv2 != null) {
			value = connectionInputv2.getValueSwitch();
		}

	}

}
