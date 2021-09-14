package app.waiter;

import javax.swing.JFrame;

import entities.Table;

public class TableServiceScreen extends WaiterScreen{

	private Table table;
	private JFrame waiterMainScreen;
	
	public TableServiceScreen(Table table, JFrame waiterMainScreen) {
		this.table = table;
		this.waiterMainScreen = waiterMainScreen;
		
		setTitle("Table Service");
	}
}
