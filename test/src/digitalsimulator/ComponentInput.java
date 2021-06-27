package digitalsimulator;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ComponentInput extends JButton implements ActionListener{

	private boolean isOnConnection = false;
	private boolean value;
	private boolean draw = false;
	private int posX;
	private int posY;
//	private int eventx;
//	private int eventy;
//	private int length;
//	private ComponentInput[] inputArray;
	ComponentInput(){
		addActionListener(this);
	
	}
	
//	public void setInputArray(ComponentInput[] array) {
//		inputArray = array;
//	}
	
//	public ComponentInput[] getInputArray() {
//		return inputArray;
//	}

	public boolean getConnectionStatus() {
		return isOnConnection;
	}

	public void setConnectionStatus(boolean status) {
		isOnConnection = status;
	}

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean newValue) {
		value = newValue;
	}
	public void setInputPos(int x, int y) {
		posX = x;
		posY = y;
	}
	public int getInputPosX() {
		return posX;
	}
	public int getInputPosY() {
		return posY;
	}
//	public void setLength(int length) {
//		this.length = length;
//	}
//	public int getLength() {
//		return length;
//	}

	public boolean getDraw() {
		return  draw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//if(e.getSource() == this)
			System.out.println("gedrückt");
		//for(int i = 0;i < length;i++) {
			if(draw) {
				
				draw = false;
				//System.out.println(draw);
				//eventx = getInputPosX();
				//eventy = getInputPosY();
				//repaint();
			}
			else {
				
				draw = true;
				//System.out.println(draw);
				//System.out.println("gedrückt");
			}
			
		//}*/
	}
   // void drawLines(Graphics g) {
       
 
        //g.drawLine(getInputPosX(), getInputPosY(), eventx, eventy);
 
        
 
    //}
	public static void main(String[] args) {
	JFrame test = new JFrame("t");
	test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	test.setVisible(true);
	test.setSize(500, 500);

	OrGate t = new OrGate();
	Component t2 = new Component();
	test.add(t);
	test.add(t2);
	}

   /*public void paint(Graphics g) {
       super.paint(g);
        //drawLines(g);
    }*/

	
	
	

//	public void setValue(Connection connection) {
//        if (getConnectionStatus() == false)
//            setConnectionStatus(true);
//        value = connection.getValue();
//    }
}
