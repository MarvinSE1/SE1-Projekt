package AndGateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.AndGate;

public class GetValueAndGateMethod {

	@Test
	public void getterWithTrue() throws Exception {
		AndGate a = new AndGate();
		a.setValue(true);
		assertEquals(true, a.gateOP());
	}

	@Test
	public void getterWithFalse() throws Exception {
		AndGate a = new AndGate();
		a.setValue(false);
		assertEquals(false, a.gateOP());
	}

}
