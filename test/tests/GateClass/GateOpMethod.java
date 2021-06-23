package GateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.Gate;

public class GateOpMethod {

	@Test
	public void getterWithTrue() throws Exception {
		Gate g = new Gate();
		g.setValue(true);
		assertEquals(true, g.gateOP());
	}

	@Test
	public void getterWithFalse() throws Exception {
		Gate g = new Gate();
		g.setValue(false);
		assertEquals(false, g.gateOP());
	}

}
