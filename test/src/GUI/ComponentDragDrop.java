package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ComponentDragDrop extends JLayeredPane  {
    private InputLayer input;
    private OutputLayer output;
    private GateLayer gate;
    private CustomLayer custom;
   
    public ComponentDragDrop(){

    	this.setPreferredSize(new Dimension(100,200));
    	this.setBorder(new LineBorder(new Color(0x353535)));
        
		  InputLayer input = new InputLayer();
        OutputLayer output= new OutputLayer();
        GateLayer gate= new GateLayer();
        CustomLayer custom=new CustomLayer();
        this.input=input;
        this.output=output;
        this.gate=gate;
        this.custom=custom;

        this.add(input);
        this.add(output);
        this.add(gate);
        this.add(custom);

    }



    void setInput() {
        this.moveToFront(input);


    }
    void setOutput() {
        this.moveToFront(output);


    }
    void setGate() {
        this.moveToFront(gate);


    }
    void setCustom() {
    this.moveToFront(custom);


    }

    InputLayer getInput() {
        return this.input;


    }
    OutputLayer getOutput() {
    return      this.output;


    }
    GateLayer getGate() {
        return this.gate;


    }
    CustomLayer getCustom() {
        return this.custom;


    }

}