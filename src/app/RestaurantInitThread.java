package app;

import entities.Restaurant;

public class RestaurantInitThread extends Thread{

	private Restaurant restaurant;
	
	public void run() {
		
		
		Restaurant restaurant = SystemInitialization.go();
		this.restaurant = restaurant;
		
		for (int i = 0; i < restaurant.getTablesNumber(); i++) {
			System.out.print(restaurant.getTableArray()[i] + "  ");
			System.out.println(i);
		}
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}
}
