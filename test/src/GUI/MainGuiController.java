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


MainGuiController( MainWindowGUI mainWindow){
	this.guiMainWindow=mainWindow;
	this.categoryPanel=mainWindow.getComponentCategories();
	this.canvas=mainWindow.getCanvas();
	this.DragDrop=mainWindow.getComponentSelector();
	
	
	
	
	
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
	// TODO Auto-generated method stub
	
}
	
	
	
	

}
