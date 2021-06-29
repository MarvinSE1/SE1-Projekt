package ComponentInputClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.ComponentInput;

public class GetValueMethod {

	@Test
	public void getterWithTrue() throws Exception {
		ComponentInput c = new ComponentInput();
		c.setValue(true);
		assertEquals(true, c.getValue());
	}

	@Test
	public void getterWithFalse() throws Exception {
		ComponentInput c = new ComponentInput();
		c.setValue(false);
		assertEquals(false, c.getValue());
	}

}
