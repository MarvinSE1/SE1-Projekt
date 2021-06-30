package digitalsimulator;

public class Connection {

	boolean value;
	ComponentInput input;
	ComponentOutput output;

	public Connection(ComponentOutput newOutput) {
		output = newOutput;
		value = output.getValue();
	}

	public boolean getValue() {
		return this.value;
	}

	public void initialiseOutput(ComponentInput newInput) {
		input = newInput;
	}

	public ComponentInput getConnection() {
		return input;
	}

	public void calculateValue() {
		value = output.getValue();
	}

}
