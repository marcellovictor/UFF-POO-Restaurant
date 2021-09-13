package app;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WaiterMainScreen extends JFrame{

	public WaiterMainScreen() {
		
		//Screen Settings
		setSize(400, 600);
		setLocation(1290, 200);
		setTitle("Waiter Interface");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		setLayout(new GridLayout(2, 1));
		
		
		//Table Start Button
		JButton tableStart = new JButton("Table Start");
		//color
		//font
		//listener
		
		add(tableStart);
		
		//Table Service Button
		JButton tableService = new JButton("Table Service");
		//color
		//font
		//listener
		
		add(tableService);
		
		
		setVisible(true);
	}
}
