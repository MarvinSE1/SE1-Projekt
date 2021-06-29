package CanvasClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import GUI.Canvas;

public class StartSimulationMethod {
	
	Canvas can;
	
	@Before
	public void setUp() {
		can = new Canvas();
	}
	
	@Test
	public void startNewSimulation() {
		can.startSimulation();
		assertTrue(can.isSimulating());
	}
	
	@Test
	public void startExistingSimulation() {
		can.startSimulation();
		assertTrue(can.isSimulating());
		can.startSimulation();
		assertTrue(can.isSimulating());
	}
}
