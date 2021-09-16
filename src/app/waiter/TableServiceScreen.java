package app.waiter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.KitchenScreen;
import app.listeners.waiter.ListenerAddFoodToPreList;
import app.listeners.waiter.ListenerCancelServiceBtn;
import app.listeners.waiter.ListenerCheckPreList;
import app.listeners.waiter.ListenerConfirmOrder;
import app.listeners.waiter.ListenerEndService;
import entities.Dessert;
import entities.Dish;
import entities.Drink;
import entities.Food;
import entities.Menu;
import entities.Table;

public class TableServiceScreen extends WaiterScreen{

	private Menu menu;
	private List<Food> preConfirmedOrders = new ArrayList<>();
	
	private Table table;
	private JFrame waiterMainScreen;
	private KitchenScreen kitchenScreen;
	
	public TableServiceScreen(Table table, JFrame waiterMainScreen, KitchenScreen kitchenScreen) {
		menu = new Menu();
		
		this.table = table;
		this.waiterMainScreen = waiterMainScreen;
		this.kitchenScreen = kitchenScreen;
		
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
		cLeftPanel.setBackground(Color.GREEN);
		
		cLeftPanel.add(new JLabel("Dishes"));
		
		for (Dish dish : menu.getDishes()) {
			JButton foodBtn = new JButton(dish.toString());
			foodBtn.addActionListener(new ListenerAddFoodToPreList(preConfirmedOrders, dish));
			
			cLeftPanel.add(foodBtn);
		}
		
		centerPanel.add(cLeftPanel);
		
		////CMiddle
		JPanel cMiddlePanel = new JPanel();
		cMiddlePanel.setBackground(Color.CYAN);
		
		cMiddlePanel.add(new JLabel("Drinks"));
		
		for (Drink drink : menu.getDrinks()) {
			JButton foodBtn = new JButton(drink.toString());
			foodBtn.addActionListener(new ListenerAddFoodToPreList(preConfirmedOrders, drink));
			
			cMiddlePanel.add(foodBtn);
		}
		
		centerPanel.add(cMiddlePanel);
		
		////CRight
		JPanel cRightPanel = new JPanel();
		cRightPanel.setBackground(Color.GREEN);
		
		cRightPanel.add(new JLabel("Desserts"));
		
		for (Dessert dessert : menu.getDesserts()) {
			JButton foodBtn = new JButton(dessert.toString());
			foodBtn.addActionListener(new ListenerAddFoodToPreList(preConfirmedOrders, dessert));
			
			cRightPanel.add(foodBtn);
		}
		
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
		confirmBtn.addActionListener(new ListenerConfirmOrder(this, waiterMainScreen, preConfirmedOrders, table, kitchenScreen));
		
		southPanel.add(confirmBtn);
		
		
		//West
		JPanel westPanel = new JPanel();
		westPanel.setLayout(new GridLayout(11, 1));
		add(BorderLayout.WEST, westPanel);
		
		JButton checkListBtn = new JButton();
		checkListBtn.addActionListener(new ListenerCheckPreList(this, preConfirmedOrders));
		westPanel.add(checkListBtn);
		
		westPanel.add(new JLabel("    C"));
		westPanel.add(new JLabel("    h"));
		westPanel.add(new JLabel("    e"));
		westPanel.add(new JLabel("    c"));
		westPanel.add(new JLabel("    k"));
		westPanel.add(new JLabel(""));
		westPanel.add(new JLabel("    L"));
		westPanel.add(new JLabel("    i"));
		westPanel.add(new JLabel("    s"));
		westPanel.add(new JLabel("    t"));
		
		
		//East
		JPanel eastPanel = new JPanel();
		eastPanel.setLayout(new GridLayout(12, 1));
		add(BorderLayout.EAST, eastPanel);
		
		JButton endServiceBtn = new JButton();
		endServiceBtn.addActionListener(new ListenerEndService(this, waiterMainScreen, table));
		eastPanel.add(endServiceBtn);
		
		eastPanel.add(new JLabel("    e"));
		eastPanel.add(new JLabel("    n"));
		eastPanel.add(new JLabel("    d"));
		eastPanel.add(new JLabel(""));
		eastPanel.add(new JLabel("    s"));
		eastPanel.add(new JLabel("    e"));
		eastPanel.add(new JLabel("    r"));
		eastPanel.add(new JLabel("    v"));
		eastPanel.add(new JLabel("    i"));
		eastPanel.add(new JLabel("    c"));
		eastPanel.add(new JLabel("    e"));
		
		setVisible(true);
	}
}
