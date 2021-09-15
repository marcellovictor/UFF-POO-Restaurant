package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import entities.Food;
import entities.Table;

public class ListenerConfirmPayment implements ActionListener{

	private JFrame billScreen;
	private JFrame waiterMainScreen;
	
	private Table table;
	
	public ListenerConfirmPayment(JFrame billScreen, JFrame waiterMainScreen, Table table) {
		this.billScreen = billScreen;
		this.waiterMainScreen = waiterMainScreen;
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		table.makeEmpty();
		table.makeOrderEmpty();
		
		
		billScreen.dispose();
		waiterMainScreen.enable();
		waiterMainScreen.show();
		
	}
}
