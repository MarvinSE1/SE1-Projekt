package complexTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import digitalsimulator.AndGate;
import digitalsimulator.Connection;
import digitalsimulator.Switch;

public class SwitchWithGates {

	@Test
	public void SwitchTestWithGate() throws Exception {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		AndGate and1 = new AndGate();

		Connection conn1 = new Connection(switch1);
		Connection conn2 = new Connection(switch2);

		and1.linkInput(0, conn1);
		and1.linkInput(1, conn2);

		switch1.turnSwitchOn();
		switch2.turnSwitchOn();

		conn1.calculateValue();
		conn2.calculateValue();

		assertTrue(conn1.getValue());
		assertTrue(conn2.getValue());

		assertTrue(and1.gateOP());

	}

}
