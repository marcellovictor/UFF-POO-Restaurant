package app;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import entities.OrderItem;

public class RefreshKitchenThread extends Thread{

	private KitchenScreen kitchenScreen;
	
	public RefreshKitchenThread(KitchenScreen kitchenScreen) {
		this.kitchenScreen = kitchenScreen;
	}
	
	public void run() {
		
		while(true) {
			
			List<OrderItem> ordersList = new ArrayList<>(kitchenScreen.getOrders());
			
			
			for (OrderItem oi : ordersList) {
				
				JButton orderBtn = new JButton(oi.toString());
				orderBtn.addActionListener(new ListenerOrderRemove(kitchenScreen, orderBtn));
				
				orderBtn.setVisible(true);
				kitchenScreen.getCurrentOrders().add(orderBtn);
				
				for (JButton btn : kitchenScreen.getCurrentOrders()) {
					kitchenScreen.add(btn);
					kitchenScreen.setVisible(true);
				}
			}
			
			kitchenScreen.getOrders().clear();
			
			try {
				this.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
