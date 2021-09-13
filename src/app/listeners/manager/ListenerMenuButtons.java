package app.listeners.manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import app.manager.panels.TableViewerPanel;

public class ListenerMenuButtons implements ActionListener{

	private JFrame screen;
	private List<JPanel> panelList;
	private JPanel container;
	
	public ListenerMenuButtons(JFrame screen, List<JPanel> panelList, JPanel container) {
		this.screen = screen;
		this.panelList = panelList;
		this.container = container;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		for (JPanel panel : panelList) {
			panel.setVisible(false);
		}
		
		screen.add(container);
		panelList.add(container);
		container.setVisible(true);
	}

}
