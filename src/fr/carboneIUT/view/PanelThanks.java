package fr.carboneIUT.view;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.carboneIUT.controller.ControllerButtons;
import fr.carboneIUT.presentation.Presentation;

public class PanelThanks extends JPanel {
	public JButton b1 = new JButton("Recommencer");
	public JLabel l = new JLabel("Merci !");
	
	private static final long serialVersionUID = 5545369184199344910L;

	public PanelThanks(Presentation ui) {
		super();
		add(l);
		add(b1);
		
		b1.addActionListener(new ControllerButtons(ui, null));
	}
	
	public void changerLabel(String phrase) {
		this.l.setText(phrase);
	}
	
}
