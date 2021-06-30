package complexTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import digitalsimulator.AndGate;
import digitalsimulator.Connection;

public class MultipleGatesTest {

	@Test
	public void TwoAndGates() throws Exception {
		AndGate and1 = new AndGate();
		AndGate and2 = new AndGate();
		Connection conn = new Connection(and1.getOutput());

		and1.setSpecific(0, true);
		and1.setSpecific(1, true);

		conn.calculateValue();

		and2.linkInput(0, conn);
		and2.setSpecific(1, true);

		assertTrue(and2.gateOP());
	}

}
