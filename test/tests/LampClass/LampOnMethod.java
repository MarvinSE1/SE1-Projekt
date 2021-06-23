package LampClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.Lamp;

public class LampOnMethod {

	@Test
	public void activateActivatedLamp() throws Exception {
		Lamp l = new Lamp();
		l.lampOn();
		l.lampOn();
		assertEquals(true, l.getLampStatus());
	}

	@Test
	public void activateDeactivatedLamp() throws Exception {
		Lamp l = new Lamp();
		l.lampOff();
		l.lampOn();
		assertEquals(true, l.getLampStatus());
	}

}
