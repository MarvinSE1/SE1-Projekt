package NotGateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.NotGate;

public class GateOPMethod {

	@Test
	public void getterWithTrue() throws Exception {
		NotGate a = new NotGate();
		a.setValue(true);
		assertEquals(true, a.gateOP());
	}

	@Test
	public void getterWithFalse() throws Exception {
		NotGate a = new NotGate();
		a.setValue(false);
		assertEquals(false, a.gateOP());
	}

}
