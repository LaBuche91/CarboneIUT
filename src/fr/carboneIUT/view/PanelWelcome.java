package fr.carboneIUT.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.carboneIUT.controller.ControllerButtons;
import fr.carboneIUT.presentation.Presentation;

public class PanelWelcome extends JPanel{

	private static final long serialVersionUID = -4239029014700838287L;

	public PanelWelcome(Presentation ui) {
		super();
		setLayout(new FlowLayout());

		JButton b1 = new JButton("Commencer");
		JLabel l = new JLabel("Bienvenue !");
		
		add(l);
		add(b1);
		
		b1.addActionListener(new ControllerButtons(ui, null));
	}
	
}
