package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;

import app.KitchenScreen;
import app.RefreshKitchenThread;
import entities.Food;
import entities.OrderItem;
import entities.Table;

public class ListenerConfirmOrder implements ActionListener{

	private JFrame currentScreen;
	private JFrame waiterMainScreen;
	private KitchenScreen kitchenScreen;
	
	private List<Food> preList;
	private Table table;
	
	public ListenerConfirmOrder(JFrame currentScreen, JFrame waiterMainScreen, List<Food> preList, Table table, KitchenScreen kitchenScreen) {
		this.currentScreen = currentScreen;
		this.waiterMainScreen = waiterMainScreen;
		this.preList = preList;
		this.table = table;
		this.kitchenScreen = kitchenScreen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for (Food food : preList) {
			table.getOrder().add(new Food(food.getName(), food.getPrice()));
		}
		
		OrderItem orderItem = new OrderItem(table, preList);
		kitchenScreen.getOrders().add(orderItem);
		
		
		currentScreen.dispose();
		waiterMainScreen.show();
		
	}

}
