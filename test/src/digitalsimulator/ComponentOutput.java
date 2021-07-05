package digitalsimulator;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import java.util.Vector;

import javax.swing.JButton;

public class ComponentOutput extends JButton implements ActionListener, MouseMotionListener, Serializable {
	private ComponentOutput output;
	private boolean draw = false;
	private int posX;
	private int posY;
	private boolean value;

	// Vector für alle outputs, um alle draw-Werte prüfen tu können
	private static Vector<ComponentOutput> outputList = new Vector<ComponentOutput>();

	// alle Komponenten, die Output haben
	private Gate myGate;
	private Switch mySwitch;

	public ComponentOutput() {
		// output = new ComponentOutput();
		addActionListener(this);
		addMouseMotionListener(this);
	}

	public void insertOutput() {
		outputList.add(this);
	}

	public Vector<ComponentOutput> getList() {
		return outputList;
	}

	public boolean getDraw() {
		return draw;
	}

	public void setDraw(boolean draw) {
		this.draw = draw;
	}

	public void setGate(Gate g) {
		myGate = g;
	}

	public Gate getGate() {
		return myGate;
	}

	public void setSwitch(Switch s) {
		mySwitch = s;
	}

	public Switch getSwitch() {
		return mySwitch;
	}

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

			// alle draw-werte auf false setzen
			for (ComponentOutput out : outputList) {
				out.setDraw(false);
			}

			// gleichzeitig darf immer nur eine ComponentOutputzum
			// verbinden markiert sein
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
