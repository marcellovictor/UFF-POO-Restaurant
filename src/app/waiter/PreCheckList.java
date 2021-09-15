package app.waiter;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import app.listeners.manager.ListenerOkWarning;
import app.listeners.waiter.ListenerRemoveFoodFromPreList;
import entities.Food;

public class PreCheckList extends JFrame{

	private JFrame ancestorScreen;
	private List<Food> preList;
	
	public PreCheckList(JFrame ancestorScreen, List<Food> preList) {
		this.ancestorScreen = ancestorScreen;
		this.preList = preList;
		
		setSize(400, 350);
		setLocation(1290, 400);
		setTitle("Pre Check List");
		
		setLayout(new BorderLayout());
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		//Center
		
		JPanel foodBtnPanel = new JPanel();
		add(BorderLayout.CENTER, foodBtnPanel);
		
		for (Food food : preList) {
			JButton foodBtn = new JButton(food.toString());
			foodBtn.addActionListener(new ListenerRemoveFoodFromPreList(preList, food));
			
			foodBtnPanel.add(foodBtn);
		}
		
		//South
		
		JButton ok = new JButton("OK");
		ok.addActionListener(new ListenerOkWarning(this, ancestorScreen));
		add(BorderLayout.SOUTH, ok);
		
		setVisible(true);
	}
}
