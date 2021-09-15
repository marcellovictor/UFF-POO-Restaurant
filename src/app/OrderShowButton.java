package app;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class OrderShowButton extends JButton{

	public OrderShowButton(String orderToShow, ActionListener actListener) {
		this.setText(orderToShow);
		this.addActionListener(actListener);
		
		this.setVisible(true);
	}
}
