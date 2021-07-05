package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
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

	public Canvas() {
		this.setPreferredSize(new Dimension(1800, 700));
		this.setBorder(new LineBorder(Color.CYAN, 4));
	}

	void addElement() {
		try {
			JOptionPane popUp = new JOptionPane("");
			String name = popUp.showInputDialog("Name des Canvas: ");

			if (name.equals(""))
				name = "Canvas";

			panel = new JPanel();
			panel.setLayout(null);
			this.addTab((name), panel);
		} catch (NullPointerException e) {

		}
	}

	void exportCanvas() {

		String name = this.getSelectedComponent().getName();
		int response;
		JFileChooser chooser = new JFileChooser(".");
		try {

			chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			response = chooser.showSaveDialog(null);

			if (response == JFileChooser.APPROVE_OPTION) {

				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(name + ".txt"));
				out.writeObject(this.getSelectedComponent());
			}
		} catch (Exception e) {

		}
	}

	void loadCanvas() {

		int response;
		JFileChooser chooser = new JFileChooser(".");

		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		response = chooser.showOpenDialog(null);

		if (response == JFileChooser.APPROVE_OPTION) {
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("null.txt"));
				this.addTab(TOOL_TIP_TEXT_KEY, (JPanel) in.readObject());
			} catch (Exception e) {
			}
		}
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