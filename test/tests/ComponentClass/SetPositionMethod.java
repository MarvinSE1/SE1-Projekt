package ComponentClass;

import static org.junit.Assert.fail;

import java.awt.Canvas;

import org.junit.Test;

public class SetPositionMethod {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void upperRightCorner() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(canv.getWidth(), 0);
//		assertEquals(canv.getWidth(), c.getX());
//		assertEquals(0, c.getY());
	}

	@Test
	public void upperLeftCorner() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(0, 0);
//		assertEquals(0, c.getX());
//		assertEquals(0, c.getY());
	}

	@Test
	public void lowerRightCorner() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(canv.getWidth(), canv.getHeight() * -1);
//		assertEquals(canv.getWidth(), c.getX());
//		assertEquals(canv.getHeight() * -1, c.getY());
	}

	@Test
	public void lowerLeftCorner() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(0, canv.getHeight() * -1);
//		assertEquals(0, c.getX());
//		assertEquals(canv.getHeight() * -1, c.getY());
	}

	@Test // (expected = InvalidYCoordinate.class)
	public void HeightBigger0Test1() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(canv.getWidth(), 1);
	}

	@Test // (expected = InvalidYCoordinate.class)
	public void HeightBigger0Test2() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(0, 1);
	}

	@Test // (expected = InvalidYCoordinate.class)
	public void HeightSmallerGetHeightTest1() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(canv.getWidth(), (canv.getHeight() * -1) - 1);
	}

	@Test // (expected = InvalidYCoordinate.class)
	public void HeightSmallerGetHeightTest2() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(0, (canv.getHeight() * -1) - 1);
	}

	@Test // (expected = InvalidXCoordinate.class)
	public void WidthBiggerGetWidthTest1() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(getWidth() + 1, 0);
	}

	@Test // (expected = InvalidXCoordinate.class)
	public void WidthLower0Test1() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(-1, 0);
	}

	@Test // (expected = InvalidXCoordinate.class)
	public void WidthBiggerGetWidthTest2() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(getWidth() + 1, getHeight());
	}

	@Test // (expected = InvalidXCoordinate.class)
	public void WidthLower0Test2() throws Exception {
		Canvas canv = new Canvas();
		// TODO uncomment when method implemented
//		Component c = new Component();
//		c.addToCanvas();
//		c.setPosition(-1, getHeight());
	}

}
