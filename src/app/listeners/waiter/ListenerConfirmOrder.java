package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;

import entities.Food;
import entities.Table;

public class ListenerConfirmOrder implements ActionListener{

	private JFrame currentScreen;
	private JFrame waiterMainScreen;
	
	private List<Food> preList;
	private Table table;
	
	public ListenerConfirmOrder(JFrame currentScreen, JFrame waiterMainScreen, List<Food> preList, Table table) {
		this.currentScreen = currentScreen;
		this.waiterMainScreen = waiterMainScreen;
		this.preList = preList;
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for (Food food : preList) {
			table.getOrder().add(new Food(food.getName(), food.getPrice()));
		}
		
		currentScreen.dispose();
		waiterMainScreen.show();
		
	}

}
