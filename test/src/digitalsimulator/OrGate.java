package digitalsimulator;

public class OrGate extends Gate {

	public boolean getValueOrGate() {
		for (int i = 0; i < input.length; i++)
			if (input[i].getValue() == true)
				return true;
		return false;
	}

}
