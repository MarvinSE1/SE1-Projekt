package CanvasClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import GUI.Canvas;

public class DeleteOldLineMethod {
	
	Canvas can;

	@Before
	public void setUp() {
		can = new Canvas();
	}
	
	@Test
	public void deleteExistingLine() {
		int size = can.getLines().size();
		//TODO: Create line to delete
		can.deleteOldLine();
		assertEquals(size -1, can.getLines().size());
	}
	
	@Test
	public void deleteNoLine() {
		int size = can.getLines().size();
		can.deleteOldLine();
		assertEquals(size, can.getLines().size());
	}
}
