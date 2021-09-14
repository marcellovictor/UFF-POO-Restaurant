package app.waiter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import app.listeners.waiter.ListenerConfirmTableBtn;
import entities.Restaurant;

public class TableStartScreen extends WaiterScreen{

	private Restaurant restaurant;
	private JFrame waiterMainScreen;
	
	public TableStartScreen(Restaurant restaurant, JFrame waiterMainScreen) {
		this.waiterMainScreen = waiterMainScreen;
		this.restaurant = restaurant;
		
		setTitle("Table Start");
		
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
		
		JButton confirmTableBtn = new JButton("Confirm");
		confirmTableBtn.addActionListener(new ListenerConfirmTableBtn(restaurant, this, waiterMainScreen, tableSelectedTF));
		centerPanel.add(BorderLayout.SOUTH, confirmTableBtn);
		
		
		mainPanel.add(nLabel);
		mainPanel.add(centerPanel);
		mainPanel.add(sLabel);
		
		
		setVisible(true);
	}
}
