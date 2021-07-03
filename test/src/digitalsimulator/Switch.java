package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import runProgramm.runSim;

public class Switch extends Gate implements ActionListener {

	private JButton switchButton;
	private JPopupMenu pm;
	private JMenuItem mi;
	private JTextField tf;
	private JPanel panel;

	public Switch() {
		panel = runSim.getMainWindow().getCanvas().getPanel();
		output = new ComponentOutput();
		switchButton = new JButton();
		switchButton.setBounds(30, 30, 40, 40);
		output.setBounds(79, 40, 20, 20);
		add(switchButton);
		add(output);
		switchButton.addActionListener(this);
		// output initialisieren
		output.insertOutput();
		output.setSwitch(this);
		outputConnection = new Connection(this);
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(getBackground());
		g.fillRect(getPositionX(), getPositionY(), getWidth(), getHeigth());
		g.setColor(new Color(230, 239, 255));
		g.fillRect(30, 30, 40, 40);
		g.fillRect(79, 40, 20, 20);
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(30, 30, 39, 39);
		g.drawRect(79, 40, 19, 19);
		g.setColor(Color.black);
		g.drawString("Switch", 33, 21);
		g.drawRect(getPositionX(), getPositionY(), getWidth() - 1, getHeigth() - 1);
	}

	public void turnSwitchOff() {
		output.setValue(false);
		setBackground(Color.GRAY);
		outputConnection.calculateValue();

	}

	public void turnSwitchOn() {
		output.setValue(true);
		setBackground(Color.ORANGE);
		outputConnection.calculateValue();
	}

	public boolean getValueSwitch() {
		return output.getValue();
	}

	public ComponentOutput getOutput() {
		return output;
	}

	public void linkOutput(Connection connection) {
		outputConnection = connection;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (output.getValue())
			turnSwitchOff();
		else
			turnSwitchOn();
	}

	public void mouseClicked(MouseEvent e) {
		if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1) {
			pm = new JPopupMenu();
			mi = new JMenuItem();
			
			JMenuItem item = new JMenuItem("löschen");
			add(pm);
			
			pm.add(item);
			//item.setVisible(true);
			pm.setVisible(true);
			pm.show(this,e.getX(),e.getY());
			
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
