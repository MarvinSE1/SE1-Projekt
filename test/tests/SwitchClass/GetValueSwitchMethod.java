package SwitchClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.Switch;

public class GetValueSwitchMethod {

	@Test
	public void getterActivatedSwitch() throws Exception {
		Switch s = new Switch();
		s.turnSwitchOn();
		assertEquals(true, s.getValueSwitch());
	}

	@Test
	public void getterDeactivatedSwitch() throws Exception {
		Switch s = new Switch();
		s.turnSwitchOff();
		assertEquals(false, s.getValueSwitch());
	}

}
