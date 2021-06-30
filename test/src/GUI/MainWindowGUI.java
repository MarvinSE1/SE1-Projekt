package GUI;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainWindowGUI extends JFrame {

	private MainWindowMenuBar mainWindow;
	private TopMenuPanel topPanel;
	private ComponentCategories componentCategory;
	private ComponentDragDrop componentSelector;
	private Canvas canvas;
	
	public MainWindowGUI() {
		
		mainWindow = new MainWindowMenuBar();
		topPanel = new TopMenuPanel();
		componentCategory = new ComponentCategories(); 
		componentSelector = new ComponentDragDrop();
		canvas = new Canvas();
			
		GridBagLayout gbl = new GridBagLayout();
		
		this.setTitle("Schaltnetzsimulator");
		this.setSize(1920,1080);
		this.setBackground(new Color(0x353535));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(gbl);
		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 10;
		gc.weighty = 0;
		gc.insets = new Insets(0,0,0,0);
		
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 2;
		this.add(mainWindow, gc);
		
		gc.weightx = 0;
		gc.gridx = 0;
		gc.gridy = 1;
		gc.gridwidth = 2;
		this.add(topPanel, gc);
		
		gc.weighty = 10;
		gc.gridx = 0;
		gc.gridy = 2;
		gc.gridwidth = 2;
		gc.fill = GridBagConstraints.BOTH;
		this.add(canvas,gc);
				
		gc.weighty = 1;
		gc.gridx = 0;
		gc.gridy = 3;
		gc.gridwidth = 1;
		gc.fill = GridBagConstraints.VERTICAL;
		this.add(componentCategory, gc);
		
		gc.weighty = 1;
		gc.gridx = 1;
		gc.gridy = 3;
		gc.gridwidth = 1;
		gc.fill = GridBagConstraints.BOTH;
		this.add(componentSelector,gc);
		
		this.setVisible(true);
	}
	
	public MainWindowMenuBar getMainMenuBar() {
		return mainWindow;
	}
	
	public TopMenuPanel getTopPanel() {
		return topPanel;
	}
	
	public ComponentCategories getComponentCategories() {
		return componentCategory;
	}
	
	public ComponentDragDrop getComponentSelector() {
		return componentSelector;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	void addNewCanvasButtonListener(ActionListener listenForButton) {
		this.getTopPanel().getNewButton().addActionListener(listenForButton);
	}
	
	
}
