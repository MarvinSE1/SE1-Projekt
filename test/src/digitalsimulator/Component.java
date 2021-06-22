package digitalsimulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Component extends JComponent {
	
	private boolean value;
	private int posX = 0;
	private int posY = 0;
	private final int sizeX = 100;
	private final int sizeY = 100;
	
	Component(){
		this.setBackground(Color.GRAY);
		this.setVisible(true);
		this.setBounds(posX,posY,sizeX,sizeY);
		
		ComponentListener listener = new ComponentListener();
		this.addMouseMotionListener(listener);
		this.addMouseListener(listener);
	}
	
	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(posX,posY,sizeX,sizeY);
		g.setColor(Color.black);
		g.drawRect(posX,posY,sizeX,sizeY);
	}

	public boolean getValue() {	
		return this.value;
	}
	
	public void setValue(boolean newValue) {
		this.value = newValue;
	}
	
	public void setPosition(int x, int y) {
		this.posX = x;
		this.posY = y;
		this.repaint();
	}
	
	public class ComponentListener implements MouseMotionListener,MouseListener{

		private boolean moved = false;
		
		@Override
		public void mouseDragged(MouseEvent e) {
			if(moved ||(e.getX()>=posX && e.getX()<=(posX+sizeX) && e.getY()>=posY && e.getY()<=(posY+sizeY))) {
				setPosition(e.getX(),e.getY());
				moved = true;
			}
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			moved=false;
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
	
	
	public static void main(String[] args) {
		
		JFrame test = new JFrame("t");
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(500,500);
		
		Component t = new Component();
		test.add(t);
	}
}
