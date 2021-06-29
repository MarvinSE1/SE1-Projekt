package GateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import digitalsimulator.Gate;

public class SetInputsMethod {

	Gate g;

	@Before
	public void setUp() {
		g = new Gate();
	}

	@Test
	public void validAmountNumber() throws Exception {
		g.setInputs(1);
		assertEquals(1, g.getInputAmount());
	}

	@Test
	public void invalidAmountNumber() throws Exception {
		int amount = g.getInputAmount();
		g.setInputs(0);
		assertEquals(amount, g.getInputAmount());
	}

	@Test
	public void amountEqualsCurrentInputNumber() throws Exception {
		g.setInputs(1);
		g.setInputs(g.getInputAmount());
		assertEquals(1, g.getInputAmount());
	}

}
