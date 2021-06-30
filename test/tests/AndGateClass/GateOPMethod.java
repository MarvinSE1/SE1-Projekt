package AndGateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.AndGate;

public class GateOPMethod {

	@Test
	public void operationValueWithTrue() throws Exception {
		AndGate a = new AndGate();
		a.setAllForTests(true);
		assertEquals(true, a.gateOP());
	}

	@Test
	public void operationValueWithFalse() throws Exception {
		AndGate a = new AndGate();
		a.setAllForTests(false);
		assertEquals(false, a.gateOP());
	}

	@Test
	public void operationValueWithOneInputTrue() throws Exception {
		AndGate a = new AndGate();
		a.setAllForTests(false);
		a.setSpecific(0, true);
		assertEquals(false, a.gateOP());
	}

	public void operationValueWithOneInputFalse() throws Exception {
		AndGate a = new AndGate();
		a.setAllForTests(true);
		a.setSpecific(0, false);
		assertEquals(false, a.gateOP());
	}

}
