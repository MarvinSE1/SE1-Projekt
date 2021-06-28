package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ComponentDragDrop extends JPanel  {
	private JPanel[] layer;
	private JPanel activePanel;
	
	ComponentDragDrop(){
		InputLayer input = new InputLayer();
		OutputLayer output= new OutputLayer();
		GateLayer gate= new GateLayer();
		CustomLayer custom=new CustomLayer();
		
		JPanel[] layers=new JPanel[4];
		layers[0]=input;
		layers[1]=output;
		layers[2]=gate;
		layers[3]=custom;
		
		
		
		
		this.setSize(500,200);
		
	}

	
	
	void setInput() {
		activePanel=layer[0];
		
		
	}
	void setOutput() {
		activePanel=layer[1];
		
		
	}
	void setGate() {
		activePanel=layer[2];
		
		
	}
	void setCustom() {
		activePanel=layer[3];
		
		
	}

}
