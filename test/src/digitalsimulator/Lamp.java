package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Lamp extends Gate {
	
	private JPopupMenu pm;
	private JMenuItem mi;
	private JTextField tf;

	public Lamp() {
		// super();
		input = new ComponentInput[1];
		input[0] = new ComponentInput();
		input[0].setBounds(0, 40, 20, 20);
		add(input[0]);
		input[0].setLamp(this);
		inputConnection = new Connection[input.length];
	}

	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillOval(getPositionX(), getPositionY(), getWidth(), getHeigth());
		g.setColor(Color.black);
		g.drawString("Lamp", 33, 53);
		g.drawRect(getPositionX(), getPositionY(), getWidth() - 1, getHeigth() - 1);
		g.drawOval(getPositionX(), getPositionY(), getWidth(), getHeigth());

		g.setColor(new Color(230, 239, 255));
		g.fillRect(0, 40, 19, 19);
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(0, 40, 19, 19);
	}

	public void lampOff() {
		setBackground(Color.GRAY);
	}

	public void lampOn() {
		setBackground(Color.YELLOW);
	}

	public boolean getLampStatus() {
		return input[0].getValue();
	}

	public void setConnection(Connection c) {
		inputConnection[0] = c;
	}

	public Connection getConnection() {
		return inputConnection[0];
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
					
				}

			});

		}
		
	}
	
	
}
