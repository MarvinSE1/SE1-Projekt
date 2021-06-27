package GateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.Gate;

public class ChangeNumberOfInputsMethod {

	// TODO testen wenn gleich anzahl input und gesetzt

	@Test
	public void validInputNumber() throws Exception {
		Gate g = new Gate();
		g.changeNumberOfInputs(2);
		assertEquals(2, g.getInputAmount());
	}

	@Test // (expected = InvalidInputNumberException.class)
	public void invalidInputNumber() throws Exception {
		Gate g = new Gate();
		g.changeNumberOfInputs(0);
	}

}
