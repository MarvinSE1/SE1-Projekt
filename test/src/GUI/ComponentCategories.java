package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class ComponentCategories extends JPanel{
	JButton gatter,custom,input,output;

    public ComponentCategories(){

        setPreferredSize(new Dimension(120,200));    
        setLayout(new GridLayout(4,1));
       
        this.setBorder(new LineBorder(new Color(0x353535)));
        
        ButtonGroup bg=new ButtonGroup();
        
        JButton gate=new JButton("Gates");      
        bg.add(gate);
        JButton input=new JButton("Inputs");
        bg.add(input);
        JButton output = new JButton("Outputs");
        bg.add(output);
        JButton custom = new JButton("Custom Components");
        bg.add(custom);
        
        add(custom,1,0);
        add(output,2,0);
        add(input,3,0);
        add(gate,4,0);
         
        this.setVisible(true);
        
    }
}

