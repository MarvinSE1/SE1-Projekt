package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import runProgramm.runSim;

public class NotGate extends Gate {

	private JPopupMenu pm;
	private JMenuItem mi;
	private JTextField tf;
	private JPanel panel;

	public NotGate() {
		panel = runSim.getMainWindow().getCanvas().getPanel();
		setInputs(1);
		output = new ComponentOutput();
		output.setBounds(79, 40, 20, 20);
		add(output);
		input[0].setGate(this);
	}

	public boolean gateOP() {
		if (input[0].getValue() == true)
			return false;
		else
			return true;
	}

	public boolean gateOPv2() {
		if (inputConnection[0].getValue() == true) {
			return false;
		}

		return true;
	}

	public void setValue(boolean val) {
		input[0].setValue(val);
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.drawString("Not", 40, 21);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
			pm = new JPopupMenu();
			mi = new JMenuItem();

			JMenuItem item = new JMenuItem("löschen");
			add(pm);

			pm.add(item);
			// item.setVisible(true);
			pm.setVisible(true);
			pm.show(this, e.getX(), e.getY());

			item.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					panel.remove(getGate());
					panel.repaint();
				}

			});

		}

	}
}
