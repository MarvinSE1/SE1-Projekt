package digitalsimulator;

public class Gate extends Component {

	private NotGate notGate;
	private AndGate andGate;
	private OrGate orGate;

	Gate() {
		if (this == notGate)
			input = new ComponentInput[1];
		else
			input = new ComponentInput[2];
		output = new ComponentOutput();
	}

	public void changeNumberOfInputs(int amount) {
		if (this != notGate)
			if (amount >= 2)
				input = new ComponentInput[amount];
	}

	public int getInputAmount() {
		return input.length;
	}

	public boolean gateOP() {
		if (this == notGate)
			return notGate.getValueNotGate();
		else if (this == andGate)
			return andGate.getValueAndGate();
		else
			return orGate.getValueOrGate();
	}

}
