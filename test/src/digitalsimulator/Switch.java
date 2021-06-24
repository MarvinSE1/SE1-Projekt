package digitalsimulator;

public class Switch extends Component {

	public void turnSwitchOff() {
		output.setValue(false);
	}

	public void turnSwitchOn() {
		output.setValue(true);
	}

	public boolean getValueSwitch() {
		return value;
	}

}
