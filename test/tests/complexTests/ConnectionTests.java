package complexTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import digitalsimulator.AndGate;
import digitalsimulator.Connection;
import digitalsimulator.Switch;

public class ConnectionTests {

	@Test
	public void SwitchToConnection() {
		Switch s = new Switch();
		Connection conn = new Connection(s);

		assertFalse(conn.getValue());

		s.turnSwitchOn();

		assertTrue(conn.getValue());
	}

	@Test
	public void SwitchToConnectionToGate() throws Exception {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		AndGate and1 = new AndGate();

		Connection conn1 = new Connection(switch1);
		Connection conn2 = new Connection(switch2);

		and1.linkInput(0, conn1);
		and1.linkInput(1, conn2);

		switch1.turnSwitchOn();
		switch2.turnSwitchOn();

		assertTrue(and1.gateOPv2());
	}

	@Test
	public void GateToConnectionToGate() throws Exception {
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();

		AndGate and1 = new AndGate();
		AndGate and2 = new AndGate();

		Connection conn1 = new Connection(switch1);
		Connection conn2 = new Connection(switch2);
		Connection conn3 = new Connection(and1);
		Connection conn4 = new Connection(switch3);

		and1.linkInput(0, conn1);
		and1.linkInput(1, conn2);

		and2.linkInput(0, conn3);
		and2.linkInput(1, conn4);

		switch1.turnSwitchOn();
		switch2.turnSwitchOn();
		switch3.turnSwitchOn();

		assertTrue(and1.gateOPv2());
		assertTrue(and2.gateOPv2());
	}

}
