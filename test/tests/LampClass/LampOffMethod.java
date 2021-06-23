package LampClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.Lamp;

public class LampOffMethod {

	@Test
	public void deactivateDeactivatedLamp() throws Exception {
		Lamp l = new Lamp();
		l.lampOff();
		l.lampOff();
		assertEquals(false, l.getLampStatus());
	}

	@Test
	public void deactivateActivatedLamp() throws Exception {
		Lamp l = new Lamp();
		l.lampOn();
		l.lampOff();
		assertEquals(false, l.getLampStatus());
	}

}
