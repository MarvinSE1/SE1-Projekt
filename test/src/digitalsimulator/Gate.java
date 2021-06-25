package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Gate extends Component {


	
	public void paint(Graphics g) {
		
		int abstand = 40;
		
		g.setColor(getBackground());
		g.fillRect(getPositionX(),getPositionY(),getWidth(),getHeigth());
		
		
		
		for(int i = 0;i<getInputAmount(); i++) {			
			if( getInputAmount() == 1) {
				g.setColor(new Color(230,239,255));
				g.fillRect(0, 40, 19, 19);
				g.setColor(Color.LIGHT_GRAY);
				g.drawRect(0, 40, 19, 19);
			}else {
				g.setColor(new Color(230,239,255));
				g.fillRect(0, i*abstand + abstand/2 , 19, 19);
				g.setColor(Color.LIGHT_GRAY);
				g.drawRect(0, i*abstand + abstand/2, 19, 19);
			}
		}
		
		g.setColor(Color.black);
		g.drawRect(getPositionX(), getPositionY(), getWidth() - 1, getHeigth() - 1);
	}
	
	public void setInputs(int amount) {
		input = new ComponentInput[amount];
		
		int abstand = 40;
		int height = 0;
		
		setHeigth(100);
		
		if(getHeigth() < abstand*amount + abstand/2)
			setHeigth(abstand*amount + abstand/2);
		
			
		
		for(int i = 0;i<amount; i++) {
			input[i] = new ComponentInput();
			if(amount == 1)
				input[i].setBounds(0, 40, 20, 20);
			else
				input[i].setBounds(0, i*abstand +abstand/2, 20, 20);
			add(input[i]);
		}
		
	}

	public void changeNumberOfInputs(int amount) {
		
			if (amount >= 2) {
				removeAll();
				input = new ComponentInput[amount];		
				
				int abstand = 40;
				setHeigth(100);
				if(getHeigth() < abstand*amount + abstand/2)
					setHeigth(abstand*amount + abstand/2);
				
				for(int i = 0;i<amount; i++) {
					input[i] = new ComponentInput();
					if(amount == 1)
						input[i].setBounds(0, 40, 20, 20);
					else
						input[i].setBounds(0, i*abstand + 20, 20, 20);
					add(input[i]);
				}
			}	
		
	}
	

	public int getInputAmount() {
		return input.length;
	}

	public boolean gateOP() {
		return (Boolean) null;
	}

}
