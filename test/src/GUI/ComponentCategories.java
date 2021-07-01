package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class ComponentCategories extends JPanel {

	JButton gate, custom, input, output;

	public ComponentCategories() {

		setPreferredSize(new Dimension(120, 200));
		setLayout(new GridLayout(4, 1));

		this.setBorder(new LineBorder(Color.green));

		ButtonGroup bg = new ButtonGroup();

		this.gate = new JButton("Gates");
		bg.add(gate);

		this.input = new JButton("Inputs");
		bg.add(input);
		this.output = new JButton("Outputs");
		bg.add(output);
		this.custom = new JButton("Custom");
		bg.add(custom);

		add(custom, 0, 0);
		add(output, 1, 0);
		add(input, 2, 0);
		add(gate, 3, 0);

		this.setVisible(true);

	}

	JButton getGateButton() {
		return this.gate;
	}

	JButton getCustomButton() {
		return this.custom;
	}

	JButton getInputButton() {
		return this.input;
	}

	JButton getOutputButton() {
		return this.output;
	}

}