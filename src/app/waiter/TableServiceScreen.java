package app.waiter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.listeners.waiter.ListenerCancelServiceBtn;
import entities.Table;

public class TableServiceScreen extends WaiterScreen{

	private Table table;
	private JFrame waiterMainScreen;
	
	public TableServiceScreen(Table table, JFrame waiterMainScreen) {
		this.table = table;
		this.waiterMainScreen = waiterMainScreen;
		
		setTitle("Table Service");
		setLayout(new BorderLayout());
		
		//North
		JPanel northPanel = new JPanel();
		northPanel.add(new JLabel(table.toString()));
		northPanel.setBackground(Color.YELLOW);
		
		add(BorderLayout.NORTH, northPanel);
		
		//Center
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(1, 3));
		
		add(BorderLayout.CENTER, centerPanel);
		
		////CLeft
		JPanel cLeftPanel = new JPanel();
		cLeftPanel.setBackground(Color.BLUE);
		
		centerPanel.add(cLeftPanel);
		
		////CMiddle
		JPanel cMiddlePanel = new JPanel();
		cMiddlePanel.setBackground(Color.CYAN);
		
		centerPanel.add(cMiddlePanel);
		
		////CRight
		JPanel cRightPanel = new JPanel();
		cRightPanel.setBackground(Color.GREEN);
		
		centerPanel.add(cRightPanel);
		
		
		//South
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1, 2));
		
		add(BorderLayout.SOUTH, southPanel);
		////Cancel Btn
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(new ListenerCancelServiceBtn(this, waiterMainScreen));
		
		southPanel.add(cancelBtn);
		
		////Confirm Btn
		JButton confirmBtn = new JButton("Confirm");
		
		southPanel.add(confirmBtn);
		
		
		
		
		setVisible(true);
	}
}
