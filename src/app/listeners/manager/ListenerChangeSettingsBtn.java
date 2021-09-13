package app.listeners.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import app.manager.ChangeSettingsScreen;

public class ListenerChangeSettingsBtn implements ActionListener{

	private JFrame ancestorScreen;
	
	public ListenerChangeSettingsBtn(JFrame ancestorScreen) {
		this.ancestorScreen = ancestorScreen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ChangeSettingsScreen changeSettingsScreen = new ChangeSettingsScreen(ancestorScreen);
		
		ancestorScreen.hide();
			
	}

}
