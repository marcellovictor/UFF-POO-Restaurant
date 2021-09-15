package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import app.waiter.BillScreen;
import entities.Table;

public class ListenerEndService implements ActionListener{

	private JFrame currentScreen;
	private JFrame waiterMainScreen;
	
	private Table table;
	
	public ListenerEndService(JFrame currentScreen, JFrame waiterMainScreen, Table table) {
		this.currentScreen = currentScreen;
		this.waiterMainScreen = waiterMainScreen;
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		currentScreen.dispose();
		
		new BillScreen(waiterMainScreen, table);
		
	}

}
