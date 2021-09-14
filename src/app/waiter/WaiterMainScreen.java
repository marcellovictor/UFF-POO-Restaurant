package app.waiter;

import java.awt.GridLayout;

import javax.swing.JButton;

import app.listeners.waiter.ListenerStartTableBtn;
import entities.Restaurant;

public class WaiterMainScreen extends WaiterScreen{

	public WaiterMainScreen(Restaurant restaurant) {
		
		//Screen Settings
		
		setTitle("Waiter Main Screen");
		setLayout(new GridLayout(2, 1));
		
		
		//Table Start Button
		JButton tableStart = new JButton("Table Start");
		//color
		//font
		tableStart.addActionListener(new ListenerStartTableBtn(restaurant, this));
		
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
