package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import runProgramm.runSim;

public class Gate extends Component implements MouseListener {

	private boolean draw = false;
	private JPopupMenu pm;
	private JMenuItem mi;
	private JTextField tf;
//	private int posX;
//	private int posY;
	private JPanel panel;

	public Gate() {
		panel = runSim.getMainWindow().getCanvas().getPanel();
		output = new ComponentOutput();
		output.setBounds(79, 40, 20, 20);
		add(output);
		// output initialisieren
		output.insertOutput(); // in Vector aller outputs eintragen
		output.setGate(this);
		outputConnection = new Connection(this);
		addMouseListener(this);
	}

	public void paint(Graphics g) {

		int abstand = 40;

		g.setColor(getBackground());
		g.fillRect(getPositionX(), getPositionY(), getWidth(), getHeigth());

		for (int i = 0; i < getInputAmount(); i++) {
			if (getInputAmount() == 1) {
				g.setColor(new Color(230, 239, 255));
				g.fillRect(0, 40, 19, 19);
				g.setColor(Color.LIGHT_GRAY);
				g.drawRect(0, 40, 19, 19);

			} else {
				g.setColor(new Color(230, 239, 255));
				g.fillRect(0, i * abstand + abstand / 2, 19, 19);
				g.setColor(Color.LIGHT_GRAY);
				g.drawRect(0, i * abstand + abstand / 2, 19, 19);
			}
			g.setColor(new Color(230, 239, 255));
			g.fillRect(79, 40, 19, 19);
			g.setColor(Color.LIGHT_GRAY);
			g.drawRect(79, 40, 19, 19);
		}

		g.setColor(Color.black);
		g.drawRect(getPositionX(), getPositionY(), getWidth() - 1, getHeigth() - 1);
	}

	public void setInputs(int amount) {
		if (amount >= 1) {
			input = new ComponentInput[amount];
			int abstand = 40;

			setHeigth(100);

			if (getHeigth() < abstand * amount + abstand / 2)
				setHeigth(abstand * amount + abstand / 2);

			for (int i = 0; i < amount; i++) {
				input[i] = new ComponentInput();
				// input[i].getDraw();

				// System.out.println(input[i].getDraw());
				if (amount == 1) {
					input[i].setBounds(0, 40, 20, 20);
					// input[i].setInputPos(0,40);
				} else {
					input[i].setBounds(0, i * abstand + abstand / 2, 20, 20);
					// input[i].setInputPos(0,i*abstand +abstand/2);
				}

				input[i].setGate(this);
				add(input[i]);

//				input[i].setInputArray(input);
			}

			inputConnection = new Connection[amount];
			// setInputArray(input);

		}
	}
//	public void setInputPos(int x, int y) {
//		posX = x;
//		posY = y;
//	}
//	public int getInputPosX() {
//		return posX;
//	}
//	public int getInputPosY() {
//		return posY;
//	}

	public boolean getGateDraw() {
		return draw;
	}

	public void changeNumberOfInputs(int amount) {

		if (amount >= 2) {
			removeAll();
			ComponentInput[] input2 = new ComponentInput[amount];

			int abstand = 40;
			setHeigth(100);
			if (getHeigth() < abstand * amount + abstand / 2)
				setHeigth(abstand * amount + abstand / 2);

			for (int i = 0; i < amount; i++) {
				input[i] = new ComponentInput();
				// input[i].getDraw();

				System.out.println(input[i].getDraw());
				// this.setDraw(input[i].getDraw());
				if (amount == 1) {
					input[i].setBounds(0, 40, 20, 20);
					// input[i].setInputPos(0,40);
				} else {
					input[i].setBounds(0, i * abstand + 20, 20, 20);
					// input[i].setInputPos(0,i*abstand + 20);
				}

				input[i].setGate(this);
				add(input[i]);
			}

			inputConnection = new Connection[amount];
			// setInputArray(input);
		}

	}

	public Gate getGate() {
		return this;
	}

	public ComponentOutput getOutput() {
		return output;
	}

	public Connection getOutputConnection() {
		return outputConnection;
	}

	public ComponentInput getInput(int index) {
		return input[index];
	}

	public int getInputAmount() {
		if (input == null) {
			return 0;
		}

		return input.length;
	}

	public void linkInput(int index, Connection connection) {
		inputConnection[index] = connection;
		System.out.println("test");
	}

	public Connection getInputConnection(int index) {
		return inputConnection[index];
	}

	public void linkOutput(Connection connection) {
		outputConnection = connection;
	}

	public boolean gateOP() {
		return (Boolean) null;
	}

	public boolean gateOPv2() {
		return (Boolean) null;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
			pm = new JPopupMenu();
			mi = new JMenuItem();
			JMenuItem item = new JMenuItem("Input Größe ändern");
			JMenuItem item2 = new JMenuItem("löschen");
			add(pm);
			pm.add(item);
			pm.add(item2);
			// item.setVisible(true);
			pm.setVisible(true);
			pm.show(this, e.getX(), e.getY());
			// int a = Integer.parseInt(tf.getText());
			// changeNumberOfInputs(a);
			item.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("sad");
					JOptionPane input = new JOptionPane();
					tf = new JTextField();
					input.showMessageDialog(null, tf);
					// getGate().add(input);
					int a = Integer.parseInt(tf.getText());
					if (a >= 2)
						setInputs(a);
					setPosition(getGate().getPositionX(), getGate().getPositionY(), getGate());
				}

			});
			item2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					panel.remove(getGate());
					panel.repaint();
				}

			});

		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
