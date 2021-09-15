package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import app.KitchenScreen;
import app.waiter.TableStartScreen;
import entities.Restaurant;

public class ListenerStartTableBtn implements ActionListener{

	private Restaurant restaurant;
	private JFrame ancestorScreen;
	private KitchenScreen kitchenScreen;
	
	public ListenerStartTableBtn(Restaurant restaurant, JFrame ancestorScreen, KitchenScreen kitchenScreen) {
		this.restaurant = restaurant;
		this.ancestorScreen = ancestorScreen;
		this.kitchenScreen = kitchenScreen;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		TableStartScreen tableStartScreen = new TableStartScreen(restaurant, ancestorScreen, kitchenScreen);
		
		ancestorScreen.hide();
	}

}
