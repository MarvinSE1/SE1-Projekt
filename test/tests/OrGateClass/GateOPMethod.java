package OrGateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.OrGate;

public class GateOPMethod {

	@Test
	public void getterWithTrue() throws Exception {
		OrGate a = new OrGate();
		a.setAllForTests(true);
		assertEquals(true, a.gateOP());
	}

	@Test
	public void getterWithFalse() throws Exception {
		OrGate a = new OrGate();
		a.setAllForTests(false);
		assertEquals(false, a.gateOP());
	}
}
