package OrGateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.AndGate;
import digitalsimulator.OrGate;

public class GateOPMethod {

	@Test
	public void operationValueWithTrue() throws Exception {
		OrGate a = new OrGate();
		a.setAllForTests(true);
		assertEquals(true, a.gateOP());
	}

	@Test
	public void operationValueWithFalse() throws Exception {
		OrGate a = new OrGate();
		a.setAllForTests(false);
		assertEquals(false, a.gateOP());
	}

	@Test
	public void operationValueWithOneInputTrue() throws Exception {
		AndGate a = new AndGate();
		a.setAllForTests(false);
		a.setValue(true);
		assertEquals(true, a.gateOP());
	}

	public void operationValueWithOneInputFalse() throws Exception {
		AndGate a = new AndGate();
		a.setAllForTests(true);
		a.setValue(false);
		assertEquals(true, a.gateOP());
	}
}
