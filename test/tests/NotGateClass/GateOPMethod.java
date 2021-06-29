package NotGateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.NotGate;

public class GateOPMethod {

	@Test
	public void operationValueWithTrue() throws Exception {
		NotGate a = new NotGate();
		a.setValue(true);
		assertEquals(false, a.gateOP());
	}

	@Test
	public void operationValueWithFalse() throws Exception {
		NotGate a = new NotGate();
		a.setValue(false);
		assertEquals(true, a.gateOP());
	}

}
