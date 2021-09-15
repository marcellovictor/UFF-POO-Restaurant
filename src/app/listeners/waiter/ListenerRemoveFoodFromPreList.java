package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import entities.Food;

public class ListenerRemoveFoodFromPreList implements ActionListener{

	private List<Food> list;
	private Food food;
	
	public ListenerRemoveFoodFromPreList(List<Food> list, Food food) {
		this.list = list;
		this.food = food;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		list.remove(food);
	}

}
