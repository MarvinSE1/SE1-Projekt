package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ComponentDragDrop extends JLayeredPane {

	private InputLayer input;
	private OutputLayer output;
	private GateLayer gate;
	private CustomLayer custom;

	public ComponentDragDrop() {

		this.setLayout(new CardLayout());
		this.setPreferredSize(new Dimension(100, 200));
		this.setBorder(new LineBorder(new Color(0x353535)));

		this.input = new InputLayer();
		this.output = new OutputLayer();
		this.gate = new GateLayer();
		this.custom = new CustomLayer();

		this.add(gate, "gate");
		this.add(input, "input");
		this.add(output, "output");
		this.add(custom, "custom");

	}

	public void setInputPanelActive() {
		this.removeAll();
		this.add(input);
		this.repaint();
		this.revalidate();
	}

	public void setOutputPanelActive() {
		this.removeAll();
		this.add(output);
		this.repaint();
		this.revalidate();
	}

	public void setGatePanelActive() {
		this.removeAll();
		this.add(gate);
		this.repaint();
		this.revalidate();
	}

	public void setCustomPanelActive() {
		this.removeAll();
		this.add(custom);
		this.repaint();
		this.revalidate();
	}

	InputLayer getInput() {
		return this.input;

	}

	OutputLayer getOutput() {
		return this.output;

	}

	GateLayer getGate() {
		return this.gate;

	}

	CustomLayer getCustom() {
		return this.custom;

	}

}