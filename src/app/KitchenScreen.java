package app;

import javax.swing.JFrame;

public class KitchenScreen extends JFrame{

	public KitchenScreen() {
		//Screen Settings
		setSize(450, 600);
		setLocation(50, 200);
		setTitle("Order List");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		setVisible(true);
	}
}
