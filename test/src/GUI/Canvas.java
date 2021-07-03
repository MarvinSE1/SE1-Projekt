package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import digitalsimulator.Component;
import digitalsimulator.ComponentInput;

public class Canvas extends JTabbedPane {

	private JButton plus;
	private JPanel panel;
	private ComponentInput input;


	// private AbstracPanel[] panel = new AbstracPanel[size];

	public Canvas() {
		// addPanel();
		// panel = new JPanel();
		this.setPreferredSize(new Dimension(1800, 700));
		this.setBorder(new LineBorder(Color.CYAN, 4));
		this.plus = new JButton("+");
		// panel = new JPanel();
		addElement();

	}

	void addElement() {

		JOptionPane popUp = new JOptionPane("");
		String name = popUp.showInputDialog("Name des Canvas: ");
		if(name.equals(""))
			name = "Canvas";

		panel = new JPanel();
		panel.setLayout(null);
		this.addTab((name), panel);
	}

	void deleteCurrentCanvas() {

		int input = JOptionPane.showConfirmDialog(null, "Möchtest du es wirklich löschen?", null,
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		if (input == 0) {
			this.remove(this.getSelectedComponent());
		}
	}

	public JPanel getPanel() {
		return (JPanel) getSelectedComponent();
	}

	public void addComponent(Component c) {
		getPanel().add(c);
	}

	public void removeComponent(Component c) {
		getPanel().remove(c);
	}

	public void setMousePositionX() {

	}

	public void setMousePositionY() {

	}

	void drawLines(Graphics g) {

		// g.drawLine(getInputPosX(), getInputPosY(), eventx, eventy);

	}

	public void paint(Graphics g) {
		super.paint(g);
		drawLines(g);

	}

	public int getCanvasWidth() {
		return 1;
	}

	public int getCanvasHeight() {
		return 1;
	}

	public ArrayList<String> getLines() {
		return new ArrayList<String>();
	}

	public boolean isSimulating() {
		return true;
	}

	public void startSimulation() {

	}

	public void stopSimulation() {

	}

	public void drawLineToMousePosition(int h, int w) {

	}

	public void deleteOldLine() {

	}

	public JButton getPlus() {
		return plus;
	}
}