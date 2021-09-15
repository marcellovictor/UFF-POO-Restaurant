package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import entities.Food;
import entities.Table;

public class ListenerAddFoodToPreList implements ActionListener{

	private List<Food> list;
	private Food food;
	
	public ListenerAddFoodToPreList(List<Food> list, Food food) {
		this.list = list;
		this.food = food;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		list.add(new Food(food.getName(), food.getPrice()));
	}

	
}
