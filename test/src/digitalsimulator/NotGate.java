package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

public class NotGate extends Gate {
	
	NotGate(){
		setInputs(1);
	}

	public boolean  gateOP() {
		if (input[0].getValue() == true)
			return false;
		else
			return true;
	}
	
	

}
