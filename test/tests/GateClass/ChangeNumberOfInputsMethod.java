package GateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.Gate;

public class ChangeNumberOfInputsMethod {

	@Test
	public void validInputNumber() throws Exception {
		Gate g = new Gate();
		g.changeNumberOfInputs(1);
		assertEquals(1, g.getInputAmount());
	}

	@Test // (expected = InvalidInputNumberException.class)
	public void invalidInputNumber() throws Exception {
		Gate g = new Gate();
		g.changeNumberOfInputs(0);
	}

}
