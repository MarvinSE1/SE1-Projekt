package AndGateClass;

import org.junit.Test;

import digitalsimulator.AndGate;

public class GetValueAndGateMethod {

	@Test
	public void getterWithTrue() throws Exception {
		AndGate a = new AndGate();
		a.setValue(true);
		// TODO uncomment when method implemented
		// assertEquals(true, a.getValueAndGate());
	}

	@Test
	public void getterWithFalse() throws Exception {
		AndGate a = new AndGate();
		a.setValue(false);
		// TODO uncomment when method implemented
		// assertEquals(false, a.getValueAndGate());
	}

}
