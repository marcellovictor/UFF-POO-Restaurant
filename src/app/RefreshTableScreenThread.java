package app;

import java.awt.Color;

import javax.swing.JButton;

import entities.Restaurant;
import entities.Table;

public class RefreshTableScreenThread extends Thread{

	private Restaurant restaurant;
	private JButton btnArray[];
	
	public RefreshTableScreenThread(Restaurant restaurant, JButton btnArray[]) {
		this.restaurant = restaurant;
		this.btnArray = btnArray;
	}
	
	public void run() {
		
		while(true) {
			
			for (int i = 0; i < restaurant.getTablesNumber(); i++) {
				Table currentTable = restaurant.getTableArray()[i];
				
				JButton btn = btnArray[i];
				
				if (currentTable.isEmpty()) {
					btn.setBackground(Color.GREEN);
				}
				else {
					btn.setBackground(Color.RED);
				}
				
			}
			
			try {
				this.sleep(150);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
