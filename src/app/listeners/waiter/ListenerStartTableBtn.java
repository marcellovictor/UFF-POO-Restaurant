package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import app.waiter.TableStartScreen;
import entities.Restaurant;

public class ListenerStartTableBtn implements ActionListener{

	private Restaurant restaurant;
	private JFrame ancestorScreen;
	
	public ListenerStartTableBtn(Restaurant restaurant, JFrame ancestorScreen) {
		this.restaurant = restaurant;
		this.ancestorScreen = ancestorScreen;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		TableStartScreen tableStartScreen = new TableStartScreen(restaurant, ancestorScreen);
		
		ancestorScreen.hide();
	}

}
