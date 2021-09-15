package app.waiter;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.listeners.waiter.ListenerConfirmPayment;
import entities.Food;
import entities.Table;

public class BillScreen extends WaiterScreen{

	private JFrame waiterMainScreen;
	private Table table;
	
	public BillScreen(JFrame waiterMainScreen, Table table) {
		this.waiterMainScreen = waiterMainScreen;
		this.table = table;
		
		setTitle("Order Pad");
		setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		northPanel.add(new JLabel("Order Pad"));
		add(BorderLayout.NORTH, northPanel);
		
		////
		
		JPanel centerPanel = new JPanel();
		add(BorderLayout.CENTER, centerPanel);
		
		Double total = 0.0;
		for (Food food : table.getOrder()) {
			total += food.getPrice();
			JButton foodBtn = new JButton(food.toString());
			centerPanel.add(foodBtn);
		}
		
		////
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2, 1));
		add(BorderLayout.SOUTH, southPanel);
		
		String totalPayment = "Total Payment: $" + String.format("%.2f", total);
		southPanel.add(new JLabel(totalPayment));
		
		JButton paidBtn = new JButton("Confirm Payment");
		paidBtn.addActionListener(new ListenerConfirmPayment(this, waiterMainScreen, table));
		southPanel.add(paidBtn);
		
		setVisible(true);
	}
}
