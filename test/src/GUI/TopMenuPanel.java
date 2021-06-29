package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TopMenuPanel extends JPanel{

	public TopMenuPanel() {
		
		setBackground(new Color(0x777777));
		setPreferredSize(new Dimension(100,50));
		setLayout(new FlowLayout(FlowLayout.LEADING));
		this.setBorder(new LineBorder(Color.blue));
		
		add(new JButton("Test1"));
		add(new JButton("Test2"));
		add(new JButton("Test3"));
		add(new JButton("Test4"));
		
	}
}
