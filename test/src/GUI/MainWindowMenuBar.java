package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindowMenuBar extends JMenuBar {

	Font sansSerif = new Font(Font.SANS_SERIF, Font.PLAIN, 12);

	public MainWindowMenuBar() {

		this.setBackground(new Color(0x353535));
		this.setPreferredSize(new Dimension(1920, 20));

		JMenu file = new JMenu("File");
		file.setForeground(new Color(0xA1A1A1));
		file.setFont(sansSerif);
		this.add(file);

		JMenu window = new JMenu("Window");
		window.setForeground(new Color(0xA1A1A1));
		window.setFont(sansSerif);
		this.add(window);

		JMenu help = new JMenu("Help");
		help.setForeground(new Color(0xA1A1A1));
		help.setFont(sansSerif);
		this.add(help);

		JMenuItem newCanvas = new JMenuItem("New");
		JMenuItem load = new JMenuItem("Load");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem exit = new JMenuItem("Exit");

//		file.add(newCanvas);
//		file.add(load);
//		file.add(save);
		file.add(exit);

		JMenuItem darkMode = new JMenuItem("Superior Mode  (Requires Restart)");
		window.add(darkMode);
	}
}
