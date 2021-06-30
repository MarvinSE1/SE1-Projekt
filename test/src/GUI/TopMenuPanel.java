package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TopMenuPanel extends JPanel{

	private JButton newCanvasPanel;
	private JButton save;
	private JButton runSimulation;
	
	
	public TopMenuPanel() {
		
		setPreferredSize(new Dimension(100,40));
		setLayout(new FlowLayout(FlowLayout.LEADING));
		this.setBorder(new LineBorder(new Color(0x353535)));
		
		this.newCanvasPanel = new JButton("New Circuit Panel");
		this.save = new JButton("Save");
		this.runSimulation = new JButton("Run Simulation");
			
		add(newCanvasPanel);
		add(save);
		add(runSimulation);
		
	}
	
	JButton getNewButton() {
		return newCanvasPanel;
	}
	
	JButton getSaveButton() {
		return save;
	}
	
	JButton getSimulationButton() {
		return runSimulation;
	}
}
