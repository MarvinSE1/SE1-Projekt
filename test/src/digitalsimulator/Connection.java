package digitalsimulator;

public class Connection {

	boolean value;
	Switch connectionInputv2;
	AndGate connectionInputv3;

	public Connection(AndGate gateOutput) {
		connectionInputv3 = gateOutput;
		value = connectionInputv3.gateOPv2();
		gateOutput.linkToConnection(this);
	}

	public Connection(Switch switchOutput) {
		connectionInputv2 = switchOutput;
		value = connectionInputv2.getValueSwitch();
		switchOutput.linkToConnection(this);
	}

	public boolean getValue() {
		return this.value;
	}

	public void calculateValue() {

		if (connectionInputv2 != null) {
			value = connectionInputv2.getValueSwitch();
		}

		if (connectionInputv3 != null) {
			value = connectionInputv3.gateOPv2();
		}

	}

}
