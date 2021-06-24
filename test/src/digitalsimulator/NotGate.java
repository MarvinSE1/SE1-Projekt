package digitalsimulator;

public class NotGate extends Gate {

	public boolean getValueNotGate() {
		if (input[0].getValue() == true)
			return false;
		else
			return true;
	}

}
