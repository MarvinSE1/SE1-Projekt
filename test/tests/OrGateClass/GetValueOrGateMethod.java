package OrGateClass;

import org.junit.Test;

import digitalsimulator.OrGate;

public class GetValueOrGateMethod {

	@Test
	public void getterWithTrue() throws Exception {
		OrGate a = new OrGate();
		a.setValue(true);
		// TODO uncomment when method implemented
		// assertEquals(true, a.getValueOrGate());
	}

	@Test
	public void getterWithFalse() throws Exception {
		OrGate a = new OrGate();
		a.setValue(false);
		// TODO uncomment when method implemented
		// assertEquals(false, a.getValueOrGate());
	}
}
