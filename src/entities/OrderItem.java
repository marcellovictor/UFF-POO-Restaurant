package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	private Table table;
	private List<Food> subItems = new ArrayList<>();
	private boolean ready;
	
	public OrderItem(Table table, List<Food> subItems) {
		this.table = table;
		this.subItems = subItems;
		ready = false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(table.toString() + ":\n\n");
		
		for (Food fd : subItems) {
			sb.append(fd.getName() + "\n");
		}
		
		return sb.toString();
	}
}
