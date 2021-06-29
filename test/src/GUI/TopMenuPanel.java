package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TopMenuPanel extends JPanel{

	public TopMenuPanel() {
		
		setPreferredSize(new Dimension(100,40));
		setLayout(new FlowLayout(FlowLayout.LEADING));
		this.setBorder(new LineBorder(new Color(0x353535)));
		
		add(new JButton("New"));
		add(new JButton("Save"));
		add(new JButton("Run Simulation"));
		
	}
}
