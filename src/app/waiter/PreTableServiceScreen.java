package app.waiter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import app.listeners.waiter.ListenerCancelServiceBtn;
import app.listeners.waiter.ListenerConfirmTableServiceBtn;
import entities.Restaurant;

public class PreTableServiceScreen extends WaiterScreen{
	
	private Restaurant restaurant;
	private JFrame waiterMainScreen;
	
	public PreTableServiceScreen(Restaurant restaurant, JFrame waiterMainScreen) {
		this.waiterMainScreen = waiterMainScreen;
		this.restaurant = restaurant;
		
		setTitle("Select Table");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3, 1));
		add(mainPanel);
		
		//Features
		
		
		//Decoration
		JButton nLabel = new JButton();
		nLabel.setBackground(Color.DARK_GRAY);
		
		JButton sLabel = new JButton();
		sLabel.setBackground(Color.DARK_GRAY);
		////
		
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		
		//Text Panel
		JPanel textPanel = new JPanel();
		centerPanel.add(BorderLayout.CENTER, textPanel);
		
		JLabel label = new JLabel("Selected Table: ");
		textPanel.add(label);
		
		JTextField tableSelectedTF = new JTextField(3);
		textPanel.add(tableSelectedTF);
		////
		
		JPanel centerAuxPanel = new JPanel();
		centerAuxPanel.setLayout(new GridLayout(1, 2));
		
		JButton goBackBtn = new JButton("Back");
		goBackBtn.addActionListener(new ListenerCancelServiceBtn(this, waiterMainScreen));
		centerAuxPanel.add(goBackBtn);
		
		JButton confirmTableBtn = new JButton("Confirm");
		confirmTableBtn.addActionListener(new ListenerConfirmTableServiceBtn(restaurant, this, waiterMainScreen, tableSelectedTF));
		centerAuxPanel.add(confirmTableBtn);
		
		centerPanel.add(BorderLayout.SOUTH, centerAuxPanel);
		
		mainPanel.add(nLabel);
		mainPanel.add(centerPanel);
		mainPanel.add(sLabel);
		
		
		setVisible(true);
	}

}
