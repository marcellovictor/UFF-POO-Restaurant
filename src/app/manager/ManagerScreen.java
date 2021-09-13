package app.manager;

import javax.swing.JFrame;

public class ManagerScreen extends JFrame{

	public ManagerScreen() {
		//Screen Settings
		setSize(800, 600);
		setLocation(500, 200);
		setTitle("Generic Manager Screen");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
}
