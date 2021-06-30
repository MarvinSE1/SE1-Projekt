package GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class OutputLayer extends JPanel {
    JButton lamp;
    
    OutputLayer(){
        setBackground(ColorUIResource.BLACK);
        setSize(500,200);
        setLayout(new GridLayout(1,3,5,5));
        JButton lamp=new JButton("Lamp");
        this.lamp=lamp;
        add(lamp);

}

public JButton getLamp() {
	// TODO Auto-generated method stub
	return lamp;
}    

}