package fr.carboneIUT.view;

import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JFrame;

import fr.carboneIUT.presentation.IPresentation;
import fr.carboneIUT.presentation.Presentation;

public class PanelMain {

	CardLayout card;
	Container c;
	
	public PanelMain(Presentation main, JFrame frame) {
		super();
		
		c = frame.getContentPane();
		card = new CardLayout();
		c.setLayout(card);
		
		PanelWelcome pw = new PanelWelcome(main);
		
		PanelThanks pt = new PanelThanks(main);
		main.setPth(pt);
		
		PanelTransport pc= new PanelTransport(main);
		PanelFood pf = new PanelFood(main);
		PanelOrdinateur po = new PanelOrdinateur(main);
		
		main.setPf(pf);
		main.setPo(po);
		main.setPT(pc);
		//main.getModele().init();//on initilise à chaque debut
		c.add(pw);
		c.add(pc);
		c.add(pf);
		c.add(po);
		c.add(pt);
	}
	
	public void changePanel() {
		card.next(c);
	}

}
