package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class MainGuiController implements ActionListener,KeyListener,WindowListener {
	
private MainWindowGUI guiMainWindow;


private	ComponentCategories categoryPanel;
private Canvas canvas;
private ComponentDragDrop DragDrop;
private JButton gate,input,output,custom,lever,lamp,or,and,not,plus;


MainGuiController( MainWindowGUI mainWindow){
	this.guiMainWindow=mainWindow;
	this.categoryPanel=mainWindow.getComponentCategories();
	this.canvas=mainWindow.getCanvas();
	this.DragDrop=mainWindow.getComponentSelector();
	this.gate=categoryPanel.getGate();
	this.input=categoryPanel.getInput();
	this.output=categoryPanel.getOutput();
	this.custom=categoryPanel.getCustom();
	this.lever=DragDrop.getInput().getLever();
	this.lamp=DragDrop.getOutput().getLamp();
	this.or=DragDrop.getGate().getOrGate();
	this.and=DragDrop.getGate().getAndGate();
	this.not=DragDrop.getGate().getNotGate();
	this.plus=canvas.getPlus();
	
	this.gate.addActionListener(this);
	this.gate.addActionListener(this);
	
	
	
	
	
	
}
@Override
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosed(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosing(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource()==)
	
	// TODO Auto-generated method stub
	
}
	
	
	
	

}

