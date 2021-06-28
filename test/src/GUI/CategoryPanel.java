package GUI;



import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CategoryPanel extends JPanel implements ActionListener {
    JButton gate,custom,input,output;

    public CategoryPanel(){

        setSize(200,500);    
        setLayout(new GridLayout(4,1));
        
        
        ButtonGroup bg=new ButtonGroup();
        
        ImageIcon icon = new ImageIcon("C:\\Users\\dome6\\git\\SE1-Projekt\\test\\src\\GUI\\yourmom.jpg");
        
        JButton gatter=new JButton("Gatter");       
        bg.add(gatter);
        this.gate=gatter;
        
        JButton eingang=new JButton("Eingang");
        bg.add(eingang);
        this.input=eingang;
        
        JButton ausgang = new JButton("Ausgang");
        bg.add(ausgang);
        this.output=ausgang;
        
        JButton custom = new JButton("Custom");
        bg.add(custom);
        this.custom=custom;
        
        
        
        add(gatter,0,0);
        add(eingang,1,0);
        add(ausgang,2,0);
        add(custom,3,0);
        
        
        
        
        
        this.setVisible(true);
        
        
    }
    public JButton getGatebutton(){
        return gate;
        
    }
    public JButton getCustomButton() {
        return custom;
    }
    public JButton getInputButton() {
        return input;
    }
    
    public JButton getOutputButton() {
        return output;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==gate) {}
        
        else if (e.getSource()==input) {}
        else if (e.getSource()==output) {}
        else if ( e.getSource()==custom) {}
        
        
        
    }

}