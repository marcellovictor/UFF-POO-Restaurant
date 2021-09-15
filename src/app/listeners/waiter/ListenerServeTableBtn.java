package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import app.KitchenScreen;
import app.waiter.PreTableServiceScreen;
import entities.Restaurant;

public class ListenerServeTableBtn implements ActionListener{

	private Restaurant restaurant;
	private JFrame waiterMainScreen;
	private KitchenScreen kitchenScreen;
	
	public ListenerServeTableBtn(Restaurant restaurant, JFrame waiterMainScreen, KitchenScreen kitchenScreen) {
		this.restaurant = restaurant;
		this.waiterMainScreen = waiterMainScreen;
		this.kitchenScreen = kitchenScreen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		waiterMainScreen.hide();
		new PreTableServiceScreen(restaurant, waiterMainScreen, kitchenScreen);
		
	}

}
