package digitalsimulator;

public class AndGate extends Gate {
	
	AndGate(){
		setInputs(2);
	}

	public boolean  gateOP() {
		for (int i = 0; i < input.length; i++)
			if (input[i].getValue() == false)
				return false;
		return true;
	}

}
