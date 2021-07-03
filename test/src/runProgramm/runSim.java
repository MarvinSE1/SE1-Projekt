package runProgramm;

import GUI.MainGuiController;
import GUI.MainWindowGUI;

public class runSim {

	private static MainWindowGUI view;
	
	public static void main(String[] args) {

		view = new MainWindowGUI();
		MainGuiController controller = new MainGuiController(view);
//		guiLogic Logic = new guiLogic();
				
//		guiController Controller = new guiController(View,Logic);
	}
	
	public static MainWindowGUI getMainWindow() {
		return view;
	}

}

