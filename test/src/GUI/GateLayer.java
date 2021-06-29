package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;


public class GateLayer extends JPanel  {
	JButton andGate,notGate,orGate;
	
	GateLayer(){
		
		setBackground(ColorUIResource.BLACK);
		setSize(500,200);
		setLayout(new GridLayout(1,3,5,5));
		JButton andGate=new JButton("AND");
		JButton notGate=new JButton("NOT");
		JButton orGate=new JButton("OR");
		this.andGate=andGate;
		this.notGate=notGate;
		this.orGate=orGate;
		
		add(andGate);
		add(orGate);
		add(notGate);
		
		
	}

	JButton getAndGate(){
	return andGate;
	
	}

	JButton getOrGate(){
	return orGate;
	}
	JButton getNotGate(){
	return notGate;

		}
}
