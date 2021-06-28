package OrGateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.OrGate;

public class GateOPMethod {

	@Test
	public void getterWithTrue() throws Exception {
		OrGate a = new OrGate();
		a.setValue(true);
		assertEquals(true, a.gateOP());
	}

	@Test
	public void getterWithFalse() throws Exception {
		OrGate a = new OrGate();
		a.setValue(false);
		assertEquals(false, a.gateOP());
	}
}