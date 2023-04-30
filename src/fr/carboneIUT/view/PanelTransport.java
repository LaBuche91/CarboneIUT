package fr.carboneIUT.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.carboneIUT.controller.ControllerButtons;
import fr.carboneIUT.presentation.Presentation;

public class PanelTransport extends JPanel{
	private static final long serialVersionUID = 1L;
	JLabel trans = new JLabel("Transport pour venir a� l'IUT :");
	JButton bv = new JButton("Voiture perso");
	JButton bc = new JButton("Covoiturage");
	JButton bve = new JButton("Velo");
	JButton btc = new JButton("Transport en commun");
	JButton ba = new JButton("Autre");
	
	
	public PanelTransport(Presentation u) {
		// TODO Auto-generated constructor stub
		super();
		setLayout(new FlowLayout());
		
		add(trans);
		add(bv);
		add(bc);
		add(bve);
		add(btc);
		add(ba);
		bv.addActionListener(new ControllerButtons(u, bv.getText()));
		bc.addActionListener(new ControllerButtons(u, bc.getText()));
		bve.addActionListener(new ControllerButtons(u, bve.getText()));
		btc.addActionListener(new ControllerButtons(u, btc.getText()));
		ba.addActionListener(new ControllerButtons(u, ba.getText()));
		
		//panel => controller => UIMain => PanelMain
	}
	
	public JButton getBa() {
		return ba;
	}
	public JButton getBc() {
		return bc;
	}
	public JButton getBtc() {
		return btc;
	}
	public JButton getBv() {
		return bv;
	}
	public JButton getBve() {
		return bve;
	}
	public void setActionListener(ControllerButtons b) {
		
	}
	

}
