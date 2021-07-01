package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.*;
import javax.swing.border.LineBorder;

import digitalsimulator.AndGate;
import digitalsimulator.Component;

public class Canvas extends JTabbedPane {

	private JButton plus;
	private int newTabCounter;
	private JPanel panel;

	//private AbstracPanel[] panel = new AbstracPanel[size];
	
	
	public Canvas() {
		//addPanel();
		//panel = new JPanel();
		newTabCounter = 1;
		this.setPreferredSize(new Dimension(1800, 700));
		this.setBorder(new LineBorder(Color.CYAN,4));
		this.plus = new JButton("+");
		//panel = new JPanel();
		addElement();
		
	}
	
	void addElement() {
		panel = new JPanel();
		//addPanel();
		panel.setLayout(null);
		this.addTab(("Canvas" + newTabCounter),panel);
		newTabCounter++;
	}

	public JPanel getPanel() {
		return (JPanel) getSelectedComponent();
	}
	public void addComponent(Component c){
		getPanel().add(c);
	}
//	
//	public AbstracPanel[] getPanelArray() {
//		return panel;
//	}
//		
//	public void addPanel() {
//		size++;
//		AbstracPanel[] newPanel = new AbstracPanel[size];
//		for(int i = 0; i < panel.length;i++) {
//			newPanel[i] = panel[i];
//		}
//		panel = newPanel;
//	}
	
	public int getCanvasWidth() {
		return 1;
	}
	
	public int getCanvasHeight() {
		return 1;
	}
	
	public ArrayList<String> getLines(){
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
