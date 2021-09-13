package app;

import app.manager.ManagerInitScreen;

public class InitialScreenThread extends Thread{

	private RestaurantInitThread restaurantInitThread;
	
	public InitialScreenThread(RestaurantInitThread restaurantInitThread) {
		this.restaurantInitThread = restaurantInitThread;
	}
	
	/*public void run() {
		ManagerInitScreen managerInitScreen = new ManagerInitScreen();
		
		try {
			restaurantInitThread.wait();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/
}
