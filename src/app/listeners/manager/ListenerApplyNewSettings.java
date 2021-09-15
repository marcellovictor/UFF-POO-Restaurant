package app.listeners.manager;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ListenerApplyNewSettings implements ActionListener{

	private String filePath = "NumberOfTables.txt";
	
	private JFrame currentScreen;
	private JFrame toReturnScreen;
	private JTextField textField;
	
	public ListenerApplyNewSettings(JFrame currentScreen, JFrame toReturnScreen, JTextField textField) {
		this.currentScreen = currentScreen;
		this.toReturnScreen = toReturnScreen;
		this.textField = textField;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String text = textField.getText();
		
		boolean illegalArgument = false;
		
		try {
			int newNumberOfTables = Integer.parseInt(text);
		}
		catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException " + e.getMessage());
			illegalArgument = true;
		}
		
		if (illegalArgument) {
			currentScreen.disable();
			
			JFrame warning = new JFrame();
			warning.setSize(400, 200);
			warning.setLocation(700, 400);
			warning.setTitle("WARNING");
			
			warning.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			warning.setLayout(new BorderLayout());
			
			JPanel warningPanel = new JPanel();
			JLabel warningLabel = new JLabel("WARNING: Number of tables must be an integer number");
			//change font size
			
			warningPanel.add(warningLabel);
			
			warning.add(BorderLayout.CENTER, warningPanel);
			
			//////////
			
			JButton okWarning = new JButton("OK");
			warning.add(BorderLayout.SOUTH, okWarning);
			
			okWarning.addActionListener(new ListenerOkWarning(warning, currentScreen));
			
			warning.setVisible(true);
		}
		else {

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
				bw.write(text);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
			currentScreen.dispose();
			toReturnScreen.show();
		}
		
		
		
	}

}
