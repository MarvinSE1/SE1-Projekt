package digitalsimulator;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;

public class ComponentOutput extends JButton implements ActionListener, MouseMotionListener {
	private ComponentOutput output;
	private boolean draw = false;
	private int posX;
	private int posY;

	ComponentOutput() {
		// output = new ComponentOutput();
		addActionListener(this);
		addMouseMotionListener(this);
	}

	private boolean value;

	public boolean getValue() {
		return value;
	}

	public void setOutputPos(int x, int y) {
		posX = x;
		posY = y;
	}

	public int getOutputPosX() {
		return posX;
	}

	public int getOutputPosY() {
		return posY;
	}

	public void setValue(boolean newValue) {
		value = newValue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this) {
			System.out.println("gedrückt");
			draw = true;
		}

	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	void drawLines(Graphics g) {
		// g.drawLine(this., ERROR, ALLBITS, ABORT);
		// TODO Auto-generated method stub

	}
}
