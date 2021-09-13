package app.manager;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import app.listeners.manager.ListenerApplyNewSettings;

public class ChangeSettingsScreen extends ManagerScreen{

	public ChangeSettingsScreen(JFrame ancestorScreen) {
		
		setLayout(new BorderLayout());
		
		JPanel p = new JPanel();
		
		JLabel guideLabel = new JLabel("New Number of tables:");
		p.add(guideLabel);
		
		add(BorderLayout.NORTH, p);
		
		//////////
		
		JPanel pText = new JPanel();
		
		JTextField textField = new JTextField(20);
		p.add(textField);
		
		add(BorderLayout.CENTER, pText);
		
		//////////
		
		JButton applyBtn = new JButton("Apply Changes");
		add(BorderLayout.SOUTH, applyBtn);
		applyBtn.addActionListener(new ListenerApplyNewSettings(this, ancestorScreen, textField));
		
		setVisible(true);
	}
}
