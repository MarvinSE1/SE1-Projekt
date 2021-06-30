package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ComponentDragDrop extends JPanel  {
    private InputLayer input;
    private OutputLayer output;
    private GateLayer gate;
    private CustomLayer custom;
    private CardLayout card;
   private JPanel empty=new JPanel();

 
   
    public ComponentDragDrop(){
    	this.card=new CardLayout(40,30);
    	this.input = new InputLayer();
	    this.output= new OutputLayer();
        this.gate= new GateLayer();
        this.custom=new CustomLayer();
    	this.setPreferredSize(new Dimension(100,200));
    	this.setBorder(new LineBorder(new Color(0x353535)));
    	
    
        
        this.setLayout(card);
        
      
        
        this.add(empty,"empty");
        this.add(input,"input");
        this.add(output,"output");
        this.add(gate,"gate");
        this.add(custom,"custom");
        card.show(this, "empty");

      

    }
public static void main(String[] args) {
	JFrame frame=new JFrame();
	frame.setSize(200,300);
	ComponentDragDrop cdd=new ComponentDragDrop();
	frame.add(cdd);
	frame.setVisible(true);
	
}


    void setInput() {
        this.card.show(this, "input");


    }
    void setOutput() {
    	this.card.show(this, "output");


    }
    void setGate() {
    	this.card.show(this, "gate");


    }
    void setCustom() {
    	this.card.show(this, "custom");


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