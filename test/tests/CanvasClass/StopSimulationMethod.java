package CanvasClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import GUI.Canvas;

public class StopSimulationMethod {
	Canvas can;
	
	@Before
	public void setUp() {
		can = new Canvas();
	}
	
	@Test
	public void stopExistingSimulation() {
		can.startSimulation();
		assertTrue(can.isSimulating());
		can.stopSimulation();
		assertFalse(can.isSimulating());
	}
	
	@Test
	public void stopSimulation() {
		assertFalse(can.isSimulating());
		can.stopSimulation();
		assertFalse(can.isSimulating());
	}
}
