package fr.carboneIUT.view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import fr.carboneIUT.controller.ControllerButtons;
import fr.carboneIUT.presentation.Presentation;

public class PanelOrdinateur extends JPanel{
	
	private static final long serialVersionUID = 1L;
	JLabel lbl = new JLabel("Quel ordinateur utilisez-vous ?");
	JRadioButton rbIUT = new JRadioButton("Ordinateur de l'IUT");
	JRadioButton rbPERSO = new JRadioButton("Ordinateur personnel");
	ButtonGroup bg = new ButtonGroup();  
	 
	JButton valider = new JButton("Valider");
	
	public PanelOrdinateur(Presentation u) {
		// TODO Auto-generated constructor stub
		super();
		setLayout(new FlowLayout());
		
		add(lbl);
		bg.add(rbIUT);
		bg.add(rbPERSO);
		
		rbIUT.setSelected(true);
		add(rbIUT);
		add(rbPERSO);
		add(valider);
		
		valider.addActionListener(new ControllerButtons(u, "ordinateur"));
	}
	
	
	public JRadioButton getRbIUT() {
		return rbIUT;
	}
	public JRadioButton getRbPERSO() {
		return rbPERSO;
	}

	public void setActionListener(ControllerButtons b) {
		
	}
	

}