package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class ComponentDragDrop extends JLayeredPane  {
	private JPanel[] layer;
	private JPanel activePanel;
	
	ComponentDragDrop(){
		super();
		InputLayer input = new InputLayer();
		OutputLayer output= new OutputLayer();
		GateLayer gate= new GateLayer();
		CustomLayer custom=new CustomLayer();
		
		this.add(input,0);
		this.add(output,1);
		this.add(gate,2);
		this.add(custom,3);
		
		
		
		
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
	
	InputLayer getInput() {
		return (InputLayer) this.layer[0];
		
		
	}
	OutputLayer getOutput() {
	return 	(OutputLayer) this.layer[1];
		
		
	}
	GateLayer getGate() {
		return (GateLayer) this.layer[2];
		
		
	}
	CustomLayer getCustom() {
		return (CustomLayer) this.layer[3];
		
		
	}

}
