package app.waiter;

import java.awt.GridLayout;

import javax.swing.JButton;

import app.KitchenScreen;
import app.listeners.waiter.ListenerServeTableBtn;
import app.listeners.waiter.ListenerStartTableBtn;
import entities.Restaurant;

public class WaiterMainScreen extends WaiterScreen{

	public WaiterMainScreen(Restaurant restaurant, KitchenScreen kitchenScreen) {
		
		//Screen Settings
		
		setTitle("Waiter Main Screen");
		setLayout(new GridLayout(2, 1));
		
		
		//Table Start Button
		JButton tableStart = new JButton("Table Start");
		//color
		//font
		tableStart.addActionListener(new ListenerStartTableBtn(restaurant, this, kitchenScreen));
		
		add(tableStart);
		
		//Table Service Button
		JButton tableService = new JButton("Table Service");
		//color
		//font
		tableService.addActionListener(new ListenerServeTableBtn(restaurant, this, kitchenScreen));
		
		add(tableService);
		
		
		setVisible(true);
	}
}
