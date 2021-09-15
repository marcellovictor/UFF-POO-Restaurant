package app.listeners.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;

import app.waiter.PreCheckList;
import entities.Food;

public class ListenerCheckPreList implements ActionListener{

	private JFrame ancestorScreen;
	private List<Food> preList;
	
	public ListenerCheckPreList(JFrame ancestorScreen, List<Food> preList) {
		this.ancestorScreen = ancestorScreen;
		this.preList = preList;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		ancestorScreen.disable();
		new PreCheckList(ancestorScreen, preList);
		
	}

}
