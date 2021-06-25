package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

public class NotGate extends Gate {

	public boolean getValueNotGate() {
		if (input[0].getValue() == true)
			return false;
		else
			return true;
	}
	
	

}
