package app.manager;

import java.awt.GridLayout;

import javax.swing.JButton;

import app.RestaurantInitThread;
import app.listeners.manager.ListenerChangeSettingsBtn;
import app.listeners.manager.ListenerInitializeSystemBtn;

public class ManagerInitScreen extends ManagerScreen{

	public ManagerInitScreen() {
		
		setTitle("System Initialization");
		setLayout(new GridLayout(2, 1));
		
		//Initialize System Button
		JButton initSystemButton = new JButton("Colocar ActionListener");
		initSystemButton.setText("Initialize System");
		//mudar cor background
		//mudar fonte
		initSystemButton.addActionListener(new ListenerInitializeSystemBtn(this));
		
		
		add(initSystemButton);
		
		//Change Settings Button
		JButton changeSettingsButton = new JButton("Colocar ActionListener");
		changeSettingsButton.setText("Change Settings");
		//mudar cor background
		//mudar fonte
		changeSettingsButton.addActionListener(new ListenerChangeSettingsBtn(this));
		
		add(changeSettingsButton);
		
		setVisible(true);
		
	}
}
