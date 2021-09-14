package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import app.waiter.PreTableServiceScreen;
import entities.Restaurant;

public class ListenerServeTableBtn implements ActionListener{

	private Restaurant restaurant;
	private JFrame waiterMainScreen;
	
	public ListenerServeTableBtn(Restaurant restaurant, JFrame waiterMainScreen) {
		this.restaurant = restaurant;
		this.waiterMainScreen = waiterMainScreen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		waiterMainScreen.hide();
		new PreTableServiceScreen(restaurant, waiterMainScreen);
		
	}

}
