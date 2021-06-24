package digitalsimulator;

public class Switch extends Component {

	private ComponentOutput output;
	private boolean value;

	public void turnSwitchOff() {
		output.setValue(false);
		value = false;
	}

	public void turnSwitchOn() {
		output.setValue(true);
		value = true;
	}

	public boolean getValueSwitch() {
		return value;
	}

}
