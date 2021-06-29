package GateClass;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import digitalsimulator.Gate;

public class ChangeNumberOfInputsMethod {

	Gate g;

	@Before
	public void setUp() {
		g = new Gate();
	}

	@Test
	public void validAmountNumber() throws Exception {
		g.changeNumberOfInputs(2);
		assertEquals(2, g.getInputAmount());
	}

	@Test
	public void invalidAmountNumber() throws Exception {
		int amount = g.getInputAmount();
		g.changeNumberOfInputs(0);
		assertEquals(amount, g.getInputAmount());
	}

	@Test
	public void amountEqualsCurrentInputNumber() throws Exception {
		g.setInputs(2);
		g.changeNumberOfInputs(g.getInputAmount());
		assertEquals(2, g.getInputAmount());
	}

}
