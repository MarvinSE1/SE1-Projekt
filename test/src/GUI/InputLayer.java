package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class InputLayer extends JPanel   {
    
    private JButton lever;
    
    InputLayer(){
        
        setSize(500,200);
        setLayout(new GridLayout(1,3,5,5));
        JButton lever = new JButton("Lever");
        
        this.lever=lever;
        this.add(lever);
        
        
    }

    JButton getLever() {
        return this.lever;
    }

}