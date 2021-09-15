package app.manager.panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class IncomeTodayPanel extends JPanel{

	public IncomeTodayPanel() {
		
		JLabel jlaux = new JLabel("Coming Soon");
		jlaux.setFont(new Font("Serif", Font.PLAIN, 42));
		add(jlaux);
		
		this.setBackground(Color.LIGHT_GRAY);
	}
}
