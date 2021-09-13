package app.listeners.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ListenerOkWarning implements ActionListener{

	private JFrame warningScreen;
	private JFrame blockedScreen;
	
	public ListenerOkWarning(JFrame warningScreen, JFrame blockedScreen) {
		this.warningScreen = warningScreen;
		this.blockedScreen = blockedScreen;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		warningScreen.dispose();
		blockedScreen.enable();
		blockedScreen.show();
		
	}

}
