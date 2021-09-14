package app.listeners.waiter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import app.listeners.manager.ListenerOkWarning;
import app.waiter.TableServiceScreen;
import entities.Restaurant;

public class ListenerConfirmTableBtn implements ActionListener{

	private Restaurant restaurant;
	
	private JFrame currentScreen;
	private JFrame ancestorScreen;
	private JTextField textField;
	
	public ListenerConfirmTableBtn(Restaurant restaurant, JFrame currentScreen, JFrame ancestorScreen, JTextField textField) {
		this.restaurant = restaurant;
		this.currentScreen = currentScreen;
		this.ancestorScreen = ancestorScreen;
		this.textField = textField;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String text = textField.getText();
		
		boolean illegalArgument = false;
		
		int selectedTable = 0;
		
		try {
			selectedTable = Integer.parseInt(text);
		}
		catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException " + e.getMessage());
			illegalArgument = true;
		}
		
		
		if (illegalArgument) {
			currentScreen.disable();
			
			JFrame warning = new JFrame();
			warning.setSize(400, 200);
			warning.setLocation(1290, 420);
			warning.setTitle("WARNING");
			
			warning.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			warning.setLayout(new BorderLayout());
			
			JPanel warningPanel = new JPanel();
			JLabel warningLabel = new JLabel("WARNING: Number of tables must be an integer number!");
			//change font size
			
			warningPanel.add(warningLabel);
			
			warning.add(BorderLayout.CENTER, warningPanel);
			
			//////////
			
			JButton okWarning = new JButton("OK");
			warning.add(BorderLayout.SOUTH, okWarning);
			
			okWarning.addActionListener(new ListenerOkWarning(warning, currentScreen));
			
			warning.setVisible(true);
		}
		else if (selectedTable <= 0 || selectedTable > restaurant.getTablesNumber()) {
			currentScreen.disable();
			
			JFrame warning = new JFrame();
			warning.setSize(400, 200);
			warning.setLocation(1290, 420);
			warning.setTitle("WARNING");
			
			warning.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			warning.setLayout(new BorderLayout());
			
			JPanel warningPanel = new JPanel();
			JLabel warningLabel = new JLabel("WARNING: Table does not exist!");
			//change font size
			
			warningPanel.add(warningLabel);
			
			warning.add(BorderLayout.CENTER, warningPanel);
			
			//////////
			
			JButton okWarning = new JButton("OK");
			warning.add(BorderLayout.SOUTH, okWarning);
			
			okWarning.addActionListener(new ListenerOkWarning(warning, currentScreen));
			
			warning.setVisible(true);
		}
		else if (!restaurant.getTableArray()[selectedTable-1].isEmpty()) { //If table occupied
			currentScreen.disable();
			
			JFrame warning = new JFrame();
			warning.setSize(400, 200);
			warning.setLocation(1290, 420);
			warning.setTitle("WARNING");
			
			warning.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			warning.setLayout(new BorderLayout());
			
			JPanel warningPanel = new JPanel();
			JLabel warningLabel = new JLabel("WARNING: This table is occupied!");
			//change font size
			
			warningPanel.add(warningLabel);
			
			warning.add(BorderLayout.CENTER, warningPanel);
			
			//////////
			
			JButton okWarning = new JButton("OK");
			warning.add(BorderLayout.SOUTH, okWarning);
			
			okWarning.addActionListener(new ListenerOkWarning(warning, currentScreen));
			
			warning.setVisible(true);
		}
		else { //Here it's where it confirms the table and makes it empty
			
			restaurant.getTableArray()[selectedTable-1].makeOccupied();
			
			currentScreen.dispose();
			new TableServiceScreen(restaurant.getTableArray()[selectedTable-1], ancestorScreen);
			
		}
		
		
		
		
	}

}
