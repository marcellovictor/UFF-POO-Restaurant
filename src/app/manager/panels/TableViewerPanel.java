package app.manager.panels;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.RefreshTableScreenThread;
import entities.Restaurant;
import entities.Table;

public class TableViewerPanel extends JPanel {

	JButton btnArray[];
	
	public TableViewerPanel(Restaurant restaurant) {
		
		btnArray = new JButton[restaurant.getTablesNumber()];
		
		JLabel jl = new JLabel("Tables: ");
		jl.setSize(42, 42);
		add(jl);
		
		setLayout(new FlowLayout());
		
		
		for (int i = 0; i < restaurant.getTablesNumber(); i++) {
			Table currentTable = restaurant.getTableArray()[i];
			 
			JButton btn = new JButton(String.format("%d", currentTable.getId()));
			
			btnArray[i] = btn;
			
			if (currentTable.isEmpty()) {
				btn.setBackground(Color.GREEN);
			}
			else {
				btn.setBackground(Color.RED);
			}
			add(btn);
		}
		
		
		RefreshTableScreenThread refreshThread = new RefreshTableScreenThread(restaurant, btnArray);
		refreshThread.start();
	}
	
	
}
