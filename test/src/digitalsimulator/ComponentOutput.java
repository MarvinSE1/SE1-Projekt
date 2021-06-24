package digitalsimulator;

import javax.swing.JButton;

public class ComponentOutput extends JButton {

	private boolean value;

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean newValue) {
		value = newValue;
	}
}
