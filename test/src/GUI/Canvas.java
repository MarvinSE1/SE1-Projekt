
	package GUI;

	import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.LineBorder;

	public class Canvas extends JTabbedPane {
		
		private static int counter=0;
		private JButton plus;
		
		
		public Canvas(){
			this.setPreferredSize(new Dimension(1800,700));
			
			this.plus= new JButton("+");
			this.addTab("Canvas 1",new JPanel());
			this.addTab("+",plus);
			
			
		}
		
		
		void addElement() {
			this.add(new JPanel());
			this.addTab("neu",new JPanel());
		}
			
}

