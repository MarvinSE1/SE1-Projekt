
package GUI;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.*;

import digitalsimulator.AndGate;

public class Canvas extends JTabbedPane {

	private static int counter = 0;
	private JButton plus;

	public Canvas() {
		this.setPreferredSize(new Dimension(1800, 700));

		this.plus = new JButton("+");
		this.addTab("Canvas 1", new JPanel());
		this.addTab("+", plus);
		add(new AndGate());

	}
	public static void main(String[] args) {

	}

	void addElement() {
		this.add(new JPanel());
		this.addTab("neu", new JPanel());
	}
	
	public int getWidth() {
		return 1;
	}
	public int getHeight() {
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
