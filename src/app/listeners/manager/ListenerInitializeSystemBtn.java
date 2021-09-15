package app.listeners.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import app.KitchenScreen;
import app.RestaurantInitThread;
import app.SystemInitialization;
import app.manager.ManagerMainScreen;
import app.waiter.WaiterMainScreen;
import entities.Restaurant;

public class ListenerInitializeSystemBtn implements ActionListener{

	private JFrame ancestorScreen;
	
	public ListenerInitializeSystemBtn(JFrame ancestorScreen) {
		this.ancestorScreen = ancestorScreen;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		RestaurantInitThread restaurantInitThread = new RestaurantInitThread();
		restaurantInitThread.start();
		
		Restaurant restaurant = SystemInitialization.go(); // restaurantInitThread.getRestaurant();
		
		
		KitchenScreen kitchenScreen = new KitchenScreen();
		WaiterMainScreen waiterMainScreen = new WaiterMainScreen(restaurant, kitchenScreen);
		ManagerMainScreen managerMainScreen = new ManagerMainScreen(restaurant);
		
		ancestorScreen.hide();
		
	}

}
