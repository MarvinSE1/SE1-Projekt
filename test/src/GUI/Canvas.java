
	package GUI;

	import javax.swing.*;

	public class Canvas extends JTabbedPane {
		private static int counter=0;
		private JButton plus;
		
		
		Canvas(){
			setSize(900,900);
			this.plus= new JButton("+");
			this.addTab("neu",new JPanel());
			
			this.addTab("+",plus);
			
			
		}
		
		
		void addElement() {
			this.add(new JPanel());
			this.addTab("neu",new JPanel());
			
				
				
			}
			
			
		


}
