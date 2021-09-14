package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ListenerCancelServiceBtn implements ActionListener{

	private JFrame currentScreen;
	private JFrame waiterMainScreen;
	
	public ListenerCancelServiceBtn(JFrame currentScreen, JFrame waiterMainScreen) {
		this.currentScreen = currentScreen;
		this.waiterMainScreen = waiterMainScreen;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		currentScreen.dispose();
		waiterMainScreen.show();
		
	}

}
