package digitalsimulator;

import java.awt.Color;
import java.awt.Graphics;

public class Gate extends Component {

	private boolean draw = false;
//	private int posX;
//	private int posY;

	public Gate() {
		output = new ComponentOutput();
		output.setBounds(79, 40, 20, 20);
		add(output);
	}

	public void paint(Graphics g) {

		int abstand = 40;

		g.setColor(getBackground());
		g.fillRect(getPositionX(), getPositionY(), getWidth(), getHeigth());

		for (int i = 0; i < getInputAmount(); i++) {
			if (getInputAmount() == 1) {
				g.setColor(new Color(230, 239, 255));
				g.fillRect(0, 40, 19, 19);
				g.setColor(Color.LIGHT_GRAY);
				g.drawRect(0, 40, 19, 19);

			} else {
				g.setColor(new Color(230, 239, 255));
				g.fillRect(0, i * abstand + abstand / 2, 19, 19);
				g.setColor(Color.LIGHT_GRAY);
				g.drawRect(0, i * abstand + abstand / 2, 19, 19);
			}
			g.setColor(new Color(230, 239, 255));
			g.fillRect(79, 40, 19, 19);
			g.setColor(Color.LIGHT_GRAY);
			g.drawRect(79, 40, 19, 19);
		}

		g.setColor(Color.black);
		g.drawRect(getPositionX(), getPositionY(), getWidth() - 1, getHeigth() - 1);
	}

	public void setInputs(int amount) {
		if (amount >= 1) {
			input = new ComponentInput[amount];
			int abstand = 40;

			setHeigth(100);

			if (getHeigth() < abstand * amount + abstand / 2)
				setHeigth(abstand * amount + abstand / 2);

			for (int i = 0; i < amount; i++) {
				input[i] = new ComponentInput();
				// input[i].getDraw();

				// System.out.println(input[i].getDraw());
				if (amount == 1) {
					input[i].setBounds(0, 40, 20, 20);
					// input[i].setInputPos(0,40);
				} else {
					input[i].setBounds(0, i * abstand + abstand / 2, 20, 20);
					// input[i].setInputPos(0,i*abstand +abstand/2);
				}
				add(input[i]);
//				input[i].setInputArray(input);
			}
			// setInputArray(input);

		}
	}
//	public void setInputPos(int x, int y) {
//		posX = x;
//		posY = y;
//	}
//	public int getInputPosX() {
//		return posX;
//	}
//	public int getInputPosY() {
//		return posY;
//	}

	public boolean getGateDraw() {
		return draw;
	}

	public void changeNumberOfInputs(int amount) {

		if (amount >= 2) {
			removeAll();
			input = new ComponentInput[amount];

			int abstand = 40;
			setHeigth(100);
			if (getHeigth() < abstand * amount + abstand / 2)
				setHeigth(abstand * amount + abstand / 2);

			for (int i = 0; i < amount; i++) {
				input[i] = new ComponentInput();
				// input[i].getDraw();

				System.out.println(input[i].getDraw());
				this.setDraw(input[i].getDraw());
				if (amount == 1) {
					input[i].setBounds(0, 40, 20, 20);
					// input[i].setInputPos(0,40);
				} else {
					input[i].setBounds(0, i * abstand + 20, 20, 20);
					// input[i].setInputPos(0,i*abstand + 20);
				}
				add(input[i]);
			}
			// setInputArray(input);
		}

	}

	public Gate getGate() {
		return this;
	}

	public ComponentOutput getOutput() {
		return output;
	}

	public int getInputAmount() {
		if (input == null) {
			return 0;
		}

		return input.length;
	}

	public boolean gateOP() {
		return (Boolean) null;
	}

}
