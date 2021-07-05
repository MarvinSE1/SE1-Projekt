package SwitchClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.Switch;

public class TurnSwitchOffMethod {

	@Test
	public void deactivateActivatedSwitch() throws Exception {
		Switch s = new Switch();
		s.turnSwitchOn();
		s.turnSwitchOff();
		assertEquals(false, s.gateOP());
	}

	@Test
	public void deactivateDeactivatedSwitch() throws Exception {
		Switch s = new Switch();
		s.turnSwitchOff();
		s.turnSwitchOff();
		assertEquals(false, s.gateOP());
	}

}
