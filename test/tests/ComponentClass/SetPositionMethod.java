package ComponentClass;

import static org.junit.Assert.assertEquals;

import javax.swing.JFrame;

import org.junit.Before;
import org.junit.Test;

import digitalsimulator.Component;

public class SetPositionMethod {

	JFrame frame;
	Component c;

	@Before
	public void setUp() throws Exception {
		frame = new JFrame("t");
		c = new Component();
		frame.add(c);
	}

	@Test
	public void upperRightCorner() throws Exception {
		c.setPosition(frame.getWidth(), 0, c);
		assertEquals(frame.getWidth(), c.getX());
		assertEquals(0, c.getY());
	}

	@Test
	public void upperLeftCorner() throws Exception {
		c.setPosition(0, 0, c);
		assertEquals(0, c.getX());
		assertEquals(0, c.getY());
	}

	@Test
	public void lowerRightCorner() throws Exception {
		c.setPosition(frame.getWidth(), frame.getHeight() * -1, c);
		assertEquals(frame.getWidth(), c.getX());
		assertEquals(frame.getHeight() * -1, c.getY());
	}

	@Test
	public void lowerLeftCorner() throws Exception {
		c.setPosition(0, frame.getHeight() * -1, c);
		assertEquals(0, c.getX());
		assertEquals(frame.getHeight() * -1, c.getY());
	}

}
