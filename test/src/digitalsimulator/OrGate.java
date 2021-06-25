package digitalsimulator;

import javax.swing.JFrame;

public class OrGate extends Gate {
	
	OrGate(){
		setInputs(4);
	}

	public boolean getValueOrGate() {
		for (int i = 0; i < input.length; i++)
			if (input[i].getValue() == true)
				return true;
		return false;
	}
	
	

}
