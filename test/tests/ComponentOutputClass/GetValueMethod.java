package ComponentOutputClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digitalsimulator.ComponentOutput;

public class GetValueMethod {

	@Test
	public void getterWithTrue() throws Exception {
		ComponentOutput c = new ComponentOutput();
		c.setValue(true);
		assertEquals(true, c.getValue());
	}

	@Test
	public void getterWithFalse() throws Exception {
		ComponentOutput c = new ComponentOutput();
		c.setValue(false);
		assertEquals(false, c.getValue());
	}

}
