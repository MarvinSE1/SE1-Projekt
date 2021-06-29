package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Component extends JComponent {

	private int posX = 0;
	private int posY = 0;
	private final int sizeX = 100;
	private int sizeY = 100;
	protected ComponentInput[] input;
	protected ComponentOutput output;
	private boolean draw  = false;

	

	public Component() {
		
		//setLayout(null);
		this.setBackground(Color.GRAY);
		this.setBounds(posX, posY, sizeX, sizeY);

		ComponentListener listener = new ComponentListener();
		this.addMouseMotionListener(listener);
		this.addMouseListener(listener);
		
	}

	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(posX, posY, sizeX, sizeY);
		g.setColor(Color.black);
		g.drawRect(posX, posY, sizeX - 1, sizeY - 1);
		
	}
	

	public void setHeigth(int y) {
		sizeY = y;
	}

	public int getHeigth() {
		return sizeY;
	}

	public int getWidth() {
		return sizeX;
	}

	public void setPosition(int eventx, int eventy,Component o) {
//		this.posX = x;
//		this.posY = y;
//		this.repaint();
//		Component o = (Component) e.getSource();
		Rectangle r = o.getBounds();
		int x = (int) r.getX();
		int y = (int) r.getY();
		o.setBounds(x + (eventx - posX), y + (eventy - posY), sizeX, sizeY);
	}

	public int getPositionX() {
		return posX;
	}

	public int getPositionY() {
		return posY;
	}
	public void setDraw(boolean draw) {
		this.draw = draw;
	}
	public boolean getDraw() {
		return draw;
	}
	
	public void setInputArray(ComponentInput[] a) {
		input = a;
	}
	public ComponentInput[] getInputArray() {
		
		return input;
	}
	
	public class ComponentListener implements MouseMotionListener, MouseListener {

		//private int eventx;
		//private int eventy;
		
		@Override
		public void mouseDragged(MouseEvent e) {
			if (SwingUtilities.isLeftMouseButton(e) && e.getClickCount() == 0) {
				Component o = (Component) e.getSource();
				int eventx = e.getX();
				int eventy = e.getY();
				setPosition(eventx,eventy,o);
//				Rectangle r = o.getBounds();
//				int x = (int) r.getX();
//				int y = (int) r.getY();
//				o.setBounds(x + (eventx - posX), y + (eventy - posY), sizeX, sizeY);
			}
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
		
			/*for(int i = 0; i < input.length;i++) {
				
				if(input[i].getDraw()) {
					System.out.println("heas");
					eventx = e.getX();
					eventy = e.getY();
					
				}
			}*/
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
		test.setLocationRelativeTo(null);
		test.setVisible(true);
		test.setSize(500, 500);

		//Gate t5 = new Gate();
		AndGate t = new AndGate();
		NotGate t2 = new NotGate();
		OrGate t3 = new OrGate();
		Component t4 = new Component();
		Lamp t5 = new Lamp();
		Switch t6 = new Switch();
	
		test.add(t);
		test.add(t2);
		test.add(t3);
		test.add(t4);
		test.add(t5);
		test.add(t6);
		t.setPosition(100,100,t);
	}
}
