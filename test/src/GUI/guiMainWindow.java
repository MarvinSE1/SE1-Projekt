package GUI;

import java.awt.*;

import javax.swing.*;

public class guiMainWindow extends JFrame {

//    private mainWindowMenuBar m;
//   private topSelectorPanel t;
    private CategoryPanel csp;
    private ComponentDragDrop cdd;
    private Canvas canvas;
    
    
    public guiMainWindow() {
    	
        canvas=new Canvas();
        csp = new CategoryPanel(); 
        cdd = new ComponentDragDrop();
//        m = new mainWindowMenuBar();
//        t = new topSelectorPanel();
        
      
            
        GridBagLayout gbl = new GridBagLayout();
        
        this.setTitle("Schaltnetzsimulator");
        this.setSize(1920,1080);
        this.setBackground(new Color(0x353535));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(gbl);
        this.setLocationRelativeTo(null);
        
        GridBagConstraints gc = new GridBagConstraints();
        
        gc.weightx = 0.5;
        gc.weighty = 0.5;
        
        gc.anchor = GridBagConstraints.NORTHWEST;
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 2;
        this.add(m, gc);
        
        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridwidth = 2;
        this.add(t, gc);
        
        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 1;
        gc.fill = GridBagConstraints.NONE;
        this.add(csp, gc);
        
        gc.gridx = 1;
        gc.gridy = 3;
        gc.gridwidth = 1;
        this.add(cdd,gc);
        
        this.setVisible(true);
    }
    
//    mainWindowMenuBar getMainMenuBar() {
//        return m;
//    }
    
//    topSelectorPanel getTopPanel() {
//        return t;
//    }
    
    CategoryPanel getCategoryPanel() {
        return csp;
    }
    
    ComponentDragDrop getDragDrop() {
        return cdd;
    }
    Canvas getCanvas() {
    	return canvas;
    }
}