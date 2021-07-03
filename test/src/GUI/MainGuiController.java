package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

import digitalsimulator.AndGate;
import digitalsimulator.Lamp;
import digitalsimulator.NotGate;
import digitalsimulator.OrGate;
import digitalsimulator.Switch;
import runProgramm.runSim;

public class MainGuiController implements ActionListener, KeyListener, WindowListener, MouseMotionListener, MouseListener {

	private static MainWindowGUI guiMainWindow;
	private ComponentCategories categoryPanel;
	private TopMenuPanel topMenuPanel;
	private Canvas canvas;
	private ComponentDragDrop DragDrop;
	private JButton gate, input, output, custom, lever, lamp, or, and, not, plus;
	private Lamp a;

	public MainGuiController(MainWindowGUI mainWindow) {
		
		this.guiMainWindow = runSim.getMainWindow();
		this.topMenuPanel = guiMainWindow.getTopPanel();
		this.categoryPanel = guiMainWindow.getComponentCategories();
		this.canvas = guiMainWindow.getCanvas();
		this.DragDrop = guiMainWindow.getComponentSelector();
		this.gate = categoryPanel.getGateButton();
		this.input = categoryPanel.getInputButton();
		this.output = categoryPanel.getOutputButton();
		this.custom = categoryPanel.getCustomButton();
		this.lever = DragDrop.getInput().getLever();
		this.lamp = DragDrop.getOutput().getLamp();
		this.or = DragDrop.getGate().getOrGate();
		this.and = DragDrop.getGate().getAndGate();
		this.not = DragDrop.getGate().getNotGate();

		
		// TopMenuPanel ActionListeners
			
		this.guiMainWindow.getTopPanel().getNewButton().addActionListener(e -> canvas.addElement());
		
		// ComponentCategories ActionListeners
		
		this.categoryPanel.getGateButton().addActionListener(e -> DragDrop.setGatePanelActive());
		this.categoryPanel.getInputButton().addActionListener(e -> DragDrop.setInputPanelActive());
		this.categoryPanel.getOutputButton().addActionListener(e -> DragDrop.setOutputPanelActive());
		this.categoryPanel.getCustomButton().addActionListener(e -> DragDrop.setCustomPanelActive());

//		this.gate.addActionListener(this);
//		this.input.addActionListener(this);
//		this.output.addActionListener(this);
//		this.custom.addActionListener(this);
		this.lever.addActionListener(this);
		this.lamp.addActionListener(this);
		this.or.addActionListener(this);
		this.and.addActionListener(this);
		this.not.addActionListener(this);
//		this.plus.addActionListener(this);
		this.canvas.addMouseMotionListener(this);
		this.canvas.addMouseListener(this);
//		this.DragDrop.addMouseMotionListener(this);

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
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == lever) {
			Switch a = new Switch();
			canvas.addComponent(a);
			a.setPosition(1, 1, a);
		}
		if(e.getSource() == or) {
			OrGate a = new OrGate();
			canvas.addComponent(a);
			a.setPosition(1, 1, a);
		}
		if(e.getSource() == and) {
			AndGate a = new AndGate();
			canvas.addComponent(a);
			a.setPosition(1, 1, a);
		}
		if(e.getSource() == not) {
			NotGate a = new NotGate();
			canvas.addComponent(a);
			a.setPosition(1, 1, a);
		}
		if(e.getSource() == lamp) {
			this.a = new Lamp();
			canvas.addComponent(a);
			a.setPosition(1, 1, a);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1 ) {
			if( canvas.getSelectedComponent() == new Lamp())
				System.out.println("heso");
			System.out.println("Rechtsklick");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
