package AndGateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.AndGate;

public class GateOPMethod {

	@Test
	public void getterWithTrue() throws Exception {
		AndGate a = new AndGate();
		a.setAllForTests(true);
		assertEquals(true, a.gateOP());
	}

	@Test
	public void getterWithFalse() throws Exception {
		AndGate a = new AndGate();
		a.setAllForTests(false);
		assertEquals(false, a.gateOP());
	}

}
