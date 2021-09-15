package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListenerOrderRemove implements ActionListener{

	private KitchenScreen kitchenScreen;
	private JButton orderBtn;
	
	public ListenerOrderRemove(KitchenScreen kitchenScreen, JButton orderBtn) {
		this.kitchenScreen = kitchenScreen;
		this.orderBtn = orderBtn;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		kitchenScreen.getCurrentOrders().remove(orderBtn);
		
	}

}
