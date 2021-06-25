package digitalsimulator;

import javax.swing.JButton;

public class ComponentInput extends JButton {

	private boolean isOnConnection = false;
	private boolean value;

	public boolean getConnectionStatus() {
		return isOnConnection;
	}

	public void setConnectionStatus(boolean status) {
		isOnConnection = status;
	}

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean newValue) {
		value = newValue;
	}

//	public void setValue(Connection connection) {
//        if (getConnectionStatus() == false)
//            setConnectionStatus(true);
//        value = connection.getValue();
//    }
}
