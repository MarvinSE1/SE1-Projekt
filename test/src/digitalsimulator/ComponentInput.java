package digitalsimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ComponentInput extends JButton implements ActionListener {

	private boolean isOnConnection = false;
	private boolean value;
	private boolean draw = false;
	private int posX;
	private int posY;
	private ComponentInput[] input;

	// alle Komponenten, die Input haben
	private Gate myGate;
	private Lamp myLamp;

//	private int eventx;
//	private int eventy;
//	private int length;
//	private ComponentInput[] inputArray;
	public ComponentInput() {
		addActionListener(this);

	}

	public void setLamp(Lamp l) {
		myLamp = l;
	}

	public void setGate(Gate g) {
		myGate = g;
	}

//	public void setInputArray(ComponentInput[] array) {
//		inputArray = array;
//	}

//	public ComponentInput[] getInputArray() {
//		return inputArray;
//	}

	public boolean getConnectionStatus() {
		return isOnConnection;
	}

	public void setConnectionStatus(boolean status) {
		isOnConnection = status;
	}

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean newValue) {
		value = newValue;
	}

	public void setInputPos(int x, int y) {
		posX = x;
		posY = y;
	}

	public int getInputPosX() {
		return posX;
	}

	public int getInputPosY() {
		return posY;
	}
//	public void setLength(int length) {
//		this.length = length;
//	}
//	public int getLength() {
//		return length;
//	}

	public boolean getDraw() {
		return draw;
	}

	public void setInput(ComponentInput[] input) {
		this.input = input;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean severConnection = true;

		// Vector aller outputs holen
		for (ComponentOutput out : new ComponentOutput().getList()) {

			// verbindung zum markierten output herstellen
			if (out.getDraw()) {

				// sobald ein draw = true, verbinden
				severConnection = false;

				// für jede mögliche kombination von input - output
				if (myGate != null) {
					System.out.println("connected");
					out.getGate().getOutputConnection().setInputConnection(myGate);

					// alle inputs durchgehen und Connection an richtigen index setzen
					for (int i = 0; i < input.length; i++) {
						if (this == input[i]) {
							myGate.linkInput(i, out.getGate().getOutputConnection());
						}
					}

					out.getGate().getOutputConnection().paintConnectionBlack();

				} else if (myLamp != null && myLamp.getConnection() == null) { // letzteres verhindert doppelverbindung
					System.out.println("connected");
					out.getGate().getOutputConnection().setInputConnection(myLamp);
					myLamp.setConnection(out.getGate().getOutputConnection());
					out.getGate().getOutputConnection().paintConnectionBlack();
				}

				// draw zurücksetzen
				out.setDraw(false);
			}
		}

		if (severConnection) {
			if (myLamp != null && myLamp.getConnection() != null) {
				myLamp.getConnection().paintConnectionWhite(); // gemalte verbindung übermalen
				myLamp.getConnection().severInput(); // input erst in der Connection löschen
				myLamp.setConnection(null); // verweis in der Klasse löschen
				System.out.println("connection cut");

			} else if (myGate != null) {

				// schleife, um richtigen input zu finden (gibt bei And und Or mehrere)
				for (int i = 0; i < myGate.getInputAmount(); i++) {
					if (this == myGate.getInput(i)) {
						if (myGate.getInputConnection(i) != null) {
							myGate.getGate().getOutputConnection().paintConnectionWhite();
							myGate.getInputConnection(i).severInput();
							myGate.linkInput(i, null);
							System.out.println("connection cut");
						}
					}
				}
			}
		}

//		// if(e.getSource() == this)
//		System.out.println("gedrückt");
//		// for(int i = 0;i < length;i++) {
//		if (draw) {
//
//			draw = false;
//			// System.out.println(draw);
//			// eventx = getInputPosX();
//			// eventy = getInputPosY();
//			// repaint();
//		} else {
//
//			draw = true;
//			// System.out.println(draw);
//			// System.out.println("gedrückt");
//		}
//
//		// }*/
	}
	// void drawLines(Graphics g) {

	// g.drawLine(getInputPosX(), getInputPosY(), eventx, eventy);

	// }
	public static void main(String[] args) {
		JFrame test = new JFrame("t");
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(500, 500);

		OrGate t = new OrGate();
		Component t2 = new Component();
		test.add(t);
		test.add(t2);
	}

	/*
	 * public void paint(Graphics g) { super.paint(g); //drawLines(g); }
	 */

//	public void setValue(Connection connection) {
//        if (getConnectionStatus() == false)
//            setConnectionStatus(true);
//        value = connection.getValue();
//    }
}
