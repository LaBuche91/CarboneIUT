package fr.carboneIUT.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import fr.carboneIUT.model.ModelFood.Meal;
import fr.carboneIUT.model.ModelOrdinateur;
import fr.carboneIUT.model.ModelOrdinateur.OrdinateurType;
import fr.carboneIUT.presentation.IPresentation;

public class ControllerButtons implements ActionListener{

	IPresentation main;
	String category;
	
	public ControllerButtons(IPresentation main, String category) {
		this.main = main;
		this.category=category;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(category !=null) {
			if(category=="food") {
				//ajout des repas 
				for(Meal m : Meal.values()) {
					String texte = main.getTextByMeal(m);
					if(texte=="") texte="0";
					try {
						int qte = Integer.parseInt(texte);
						if(qte<0) {
							main.changerLabelErrorFood("Vous devez rentrer des chiffres positifs !");
							return;
						}
						main.addMeal(m, qte);
					} catch (NumberFormatException error){
						//renvoyer un message d'erreur
						main.changerLabelErrorFood("Vous devez rentrer des chiffres !");
						return;
					}
				}
			}else if(category=="ordinateur") {
				//ajout de l'ordinateur utilisé
				for(OrdinateurType orditypes : OrdinateurType.values()) {
					if(main.getSelectedOrdinateur() == orditypes) {
						main.setOrdinateurUtiliser(orditypes);
					}
				}
			}
			
			main.ajouterCat(category);
			//ajout des consomation de transports plus celles des repas
			main.changerLabelThanks("Consommation CO2 min : "+(main.getCo2Min()+main.getCO2Food())+" / max : "+(main.getCo2Max()+main.getCO2Food()));
		}else if(((JButton)e.getSource()).getText() == "Recommencer") {
			main.initModel();
			main.initModelFood();
			main.initLabelPanelFood();
		}
		main.changePanel();
	}

	
	
}
