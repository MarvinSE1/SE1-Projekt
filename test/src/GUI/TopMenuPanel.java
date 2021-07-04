package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TopMenuPanel extends JPanel {

	private JButton newCanvasPanel;
	private JButton load;
	private JButton save;
	private JButton deleteCanvas;
	private JButton runSimulation;

	public TopMenuPanel() {

		setPreferredSize(new Dimension(100, 40));
		setLayout(new FlowLayout(FlowLayout.LEADING));
		this.setBorder(new LineBorder(new Color(0x353535)));

		this.newCanvasPanel = new JButton("New Canvas");
		this.load = new JButton("Load...");
		this.save = new JButton("Save");
		this.deleteCanvas = new JButton("Delete Canvas");
		this.runSimulation = new JButton("Run Simulation");

		add(newCanvasPanel);
		add(load);
		add(save);
		add(deleteCanvas);
		add(runSimulation);

	}

	JButton getNewButton() {
		return newCanvasPanel;
	}

	JButton getLoadButton() {
		return load;
	}

	JButton getSaveButton() {
		return save;
	}

	JButton getDeleteButton() {
		return deleteCanvas;
	}

	JButton getSimulationButton() {
		return runSimulation;
	}
}