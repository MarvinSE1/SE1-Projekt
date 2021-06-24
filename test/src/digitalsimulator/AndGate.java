package digitalsimulator;

public class AndGate extends Gate {

	public boolean getValueAndGate() {
		for (int i = 0; i < input.length; i++)
			if (input[i].getValue() == false)
				return false;
		return true;
	}

}
