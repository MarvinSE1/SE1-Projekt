package SwitchClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.Switch;

public class TurnSwitchOnMethod {

	@Test
	public void activateActivatedSwitch() throws Exception {
		Switch s = new Switch();
		s.turnSwitchOn();
		s.turnSwitchOn();
		assertEquals(true, s.getValueSwitch());
	}

	@Test
	public void activateDeactivatedSwitch() throws Exception {
		Switch s = new Switch();
		s.turnSwitchOff();
		s.turnSwitchOn();
		assertEquals(true, s.getValueSwitch());
	}

}
