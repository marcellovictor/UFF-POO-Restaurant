package app.manager;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import app.listeners.manager.ListenerMenuButtons;
import app.manager.panels.IncomeTodayPanel;
import app.manager.panels.TableViewerPanel;
import app.manager.panels.TablesTodayPanel;
import entities.Restaurant;

public class ManagerMainScreen extends ManagerScreen{

	private Restaurant restaurant;
	
	public ManagerMainScreen(Restaurant restaurant) {
		super();
		
		this.restaurant = restaurant;
		
		JMenuBar menuBar = new JMenuBar();
		setTitle("Manager Control");
		setLayout(new BorderLayout());
		
		//Panels Arraylist
		List<JPanel> panelList = new ArrayList<>();
		
		TableViewerPanel tableViewerPanel = new TableViewerPanel(restaurant);
		panelList.add(tableViewerPanel);
		add(tableViewerPanel);
		
		TablesTodayPanel tablesTodayPanel = new TablesTodayPanel();
		panelList.add(tablesTodayPanel);
		add(tablesTodayPanel);
		
		IncomeTodayPanel incomeTodayPanel = new IncomeTodayPanel();
		panelList.add(incomeTodayPanel);
		add(incomeTodayPanel);
		
		//Standard Menu
		JPanel standardMenuPanel = new JPanel();
		
		JLabel jl = new JLabel("Select a Menu Screen");
		jl.setFont(new Font("Serif", Font.PLAIN, 42));
		standardMenuPanel.add(jl);
		
		add(BorderLayout.CENTER, standardMenuPanel);
		panelList.add(standardMenuPanel);
		
		//Operational Menu
		JMenu operational = new JMenu("Operational");
		
		JMenuItem tableViewer = new JMenuItem("Table Viewer");
		tableViewer.addActionListener(new ListenerMenuButtons(this, panelList, tableViewerPanel));
		
		operational.add(tableViewer);
		
		menuBar.add(operational);
		
		
		//Statistics Menu
		JMenu statistics = new JMenu("Statistic");
		
		JMenuItem tablesToday = new JMenuItem("Tables Today");
		statistics.add(tablesToday);
		tablesToday.addActionListener(new ListenerMenuButtons(this, panelList, tablesTodayPanel));
		
		JMenuItem incomeToday = new JMenuItem("Income Today");
		statistics.add(incomeToday);
		incomeToday.addActionListener(new ListenerMenuButtons(this, panelList, incomeTodayPanel));
		
		menuBar.add(statistics);
		
		
		
		setJMenuBar(menuBar);
		setVisible(true);
	}
}
