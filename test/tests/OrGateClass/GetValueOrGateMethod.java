package OrGateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.OrGate;

public class GetValueOrGateMethod {

	@Test
	public void getterWithTrue() throws Exception {
		OrGate a = new OrGate();
		a.setValue(true);
		assertEquals(true, a.getValueOrGate());
	}

	@Test
	public void getterWithFalse() throws Exception {
		OrGate a = new OrGate();
		a.setValue(false);
		assertEquals(false, a.getValueOrGate());
	}
}
