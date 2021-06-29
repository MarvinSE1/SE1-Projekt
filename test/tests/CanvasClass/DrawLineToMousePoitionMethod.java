package CanvasClass;

import org.junit.Before;
import org.junit.Test;

import GUI.Canvas;

public class DrawLineToMousePoitionMethod {

	Canvas can;

	@Before
	public void setUp() {
		can = new Canvas();
	}

	//Valid tests
	@Test
	public void drawLineToMousePositionT1() {
		can.drawLineToMousePosition(0, can.getHeight());
	}
	
	@Test
	public void drawLineToMousePositionT2() {
		can.drawLineToMousePosition(can.getWidth(), 0);
	}
	
	//Exception first Int
	@Test(expected = NullPointerException.class)
	public void firstNegativeL() {
		can.drawLineToMousePosition(-1, can.getHeight());
	}
	
	@Test(expected = NullPointerException.class)
	public void firstNegativeR() {
		can.drawLineToMousePosition(Integer.MIN_VALUE, 0);
	}
	
	@Test(expected = NullPointerException.class)
	public void firstPositiveL() {
		can.drawLineToMousePosition(can.getWidth() + 1, can.getHeight());
	}
	
	@Test(expected = NullPointerException.class)
	public void firstPositiveR() {
		can.drawLineToMousePosition(Integer.MAX_VALUE, 0);
	}
	
	//Exception second Int
	@Test(expected = NullPointerException.class)
	public void secondNegativeL() {
		can.drawLineToMousePosition(0, -1);
	}
	
	@Test(expected = NullPointerException.class)
	public void secondNegativeR() {
		can.drawLineToMousePosition(can.getWidth(), Integer.MIN_VALUE);
	}
	
	@Test(expected = NullPointerException.class)
	public void secondPositiveL() {
		can.drawLineToMousePosition(0, can.getHeight() + 1);
	}
	
	@Test(expected = NullPointerException.class)
	public void secondPositiveR() {
		can.drawLineToMousePosition(can.getWidth(), Integer.MAX_VALUE);
	}
	
}
