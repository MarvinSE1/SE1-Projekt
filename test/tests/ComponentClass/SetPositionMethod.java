package ComponentClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.swing.JFrame;

import org.junit.Test;

import digitalsimulator.Component;

public class SetPositionMethod {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void upperRightCorner() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(canv.getWidth(), 0, c);
		assertEquals(canv.getWidth(), c.getX());
		assertEquals(0, c.getY());
	}

	@Test
	public void upperLeftCorner() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(0, 0, c);
		assertEquals(0, c.getX());
		assertEquals(0, c.getY());
	}

	@Test
	public void lowerRightCorner() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(canv.getWidth(), canv.getHeight() * -1, c);
		assertEquals(canv.getWidth(), c.getX());
		assertEquals(canv.getHeight() * -1, c.getY());
	}

	@Test
	public void lowerLeftCorner() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(0, canv.getHeight() * -1, c);
		assertEquals(0, c.getX());
		assertEquals(canv.getHeight() * -1, c.getY());
	}

	@Test // (expected = InvalidYCoordinate.class)
	public void HeightBigger0Test1() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(canv.getWidth(), 1, c);
	}

	@Test // (expected = InvalidYCoordinate.class)
	public void HeightBigger0Test2() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(0, 1, c);
	}

	@Test // (expected = InvalidYCoordinate.class)
	public void HeightSmallerGetHeightTest1() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(canv.getWidth(), (canv.getHeight() * -1) - 1, c);
	}

	@Test // (expected = InvalidYCoordinate.class)
	public void HeightSmallerGetHeightTest2() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(0, (canv.getHeight() * -1) - 1, c);
	}

	@Test // (expected = InvalidXCoordinate.class)
	public void WidthBiggerGetWidthTest1() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(canv.getWidth() + 1, 0, c);
	}

	@Test // (expected = InvalidXCoordinate.class)
	public void WidthLower0Test1() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(-1, 0, c);
	}

	@Test // (expected = InvalidXCoordinate.class)
	public void WidthBiggerGetWidthTest2() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(canv.getWidth() + 1, (canv.getHeight() * -1), c);
	}

	@Test // (expected = InvalidXCoordinate.class)
	public void WidthLower0Test2() throws Exception {
		JFrame canv = new JFrame("t");
		Component c = new Component();
		canv.add(c);
		c.setPosition(-1, (canv.getHeight() * -1), c);
	}

}
