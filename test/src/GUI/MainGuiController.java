package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

import runProgramm.runSim;

public class MainGuiController implements ActionListener, KeyListener, WindowListener, MouseMotionListener {

	private static MainWindowGUI guiMainWindow;

	private ComponentCategories categoryPanel;
	private TopMenuPanel topMenuPanel;
	private Canvas canvas;
	private ComponentDragDrop DragDrop;
	private JButton gate, input, output, custom, lever, lamp, or, and, not, plus;

	public MainGuiController(MainWindowGUI mainWindow) {
		
		this.guiMainWindow = runSim.getMainWindow();
		this.topMenuPanel = guiMainWindow.getTopPanel();
		this.categoryPanel = guiMainWindow.getComponentCategories();
		this.canvas = guiMainWindow.getCanvas();
		this.DragDrop = guiMainWindow.getComponentSelector();
		this.gate = categoryPanel.getGate();
		this.input = categoryPanel.getInput();
		this.output = categoryPanel.getOutput();
		this.custom = categoryPanel.getCustom();
		this.lever = DragDrop.getInput().getLever();
		this.lamp = DragDrop.getOutput().getLamp();
		this.or = DragDrop.getGate().getOrGate();
		this.and = DragDrop.getGate().getAndGate();
		this.not = DragDrop.getGate().getNotGate();
		this.plus = canvas.getPlus();

//		this.gate.addActionListener(this);
//		this.input.addActionListener(this);
//		this.output.addActionListener(this);
//		this.custom.addActionListener(this);
//		this.lever.addActionListener(this);
//		this.lamp.addActionListener(this);
//		this.or.addActionListener(this);
//		this.and.addActionListener(this);
//		this.not.addActionListener(this);
//		this.plus.addActionListener(this);
//		this.canvas.addMouseMotionListener(this);
//		this.DragDrop.addMouseMotionListener(this);

		this.guiMainWindow.addNewCanvasButtonListener(new CanvasButtonListener());
		
	}

	class CanvasButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			canvas.addElement();
			
		}
		
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
		if (arg0.getSource() == gate) {
			this.DragDrop.setGate();

		} else if (arg0.getSource() == input) {
			this.DragDrop.setInput();

		} else if (arg0.getSource() == output) {
			this.DragDrop.setOutput();

		} else if (arg0.getSource() == custom) {

		}

		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
