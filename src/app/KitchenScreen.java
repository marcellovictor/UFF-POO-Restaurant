package app;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import entities.OrderItem;

public class KitchenScreen extends JFrame{

	private List<OrderItem> ordersAsked;
	private List<JButton> currentOrders;
	
	public KitchenScreen() {
		ordersAsked = new ArrayList<>();
		currentOrders = new ArrayList<>();
		
		//Screen Settings
		setSize(450, 600);
		setLocation(50, 200);
		setTitle("Order List");
		
		setLayout(new FlowLayout());
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		RefreshKitchenThread rkThread = new RefreshKitchenThread(this);
		rkThread.start();
		//JButton refreshBtn = new JButton("Refresh");
		//add(refreshBtn);
		
		setVisible(true);
	}
	
	public List<OrderItem> getOrders() {
		return ordersAsked;
	}
	
	public List<JButton> getCurrentOrders() {
		return currentOrders;
	}
}
