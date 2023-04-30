package fr.carboneIUT.presentation;

import fr.carboneIUT.model.ModelFood.Meal;
import fr.carboneIUT.model.ModelOrdinateur.OrdinateurType;
import fr.carboneIUT.view.PanelFood;
import fr.carboneIUT.view.PanelOrdinateur;
import fr.carboneIUT.view.PanelThanks;
import fr.carboneIUT.view.PanelTransport;

public interface IPresentation {
	
	public void changePanel();
	

	//------MODELE-----
	public void ajouterCat(String cat);
	public void initModel();
	public void initModelFood();
	public double getCo2Min();
	public double getCo2Max();
	public void addMeal(Meal repas, int qte);
	public double getCO2Food();
	
	//-----VUE---------
	public void changerLabelThanks(String a);
	
	public void setPth(PanelThanks pth);
	public void setPT(PanelTransport pt);
	public void setPf(PanelFood pf);
	public void setPo(PanelOrdinateur po);
	
	public OrdinateurType getSelectedOrdinateur();
	public void setOrdinateurUtiliser(OrdinateurType orditypes);
	
	public String getTextByMeal(Meal m);
	public void changerLabelErrorFood(String l);
	public void initLabelPanelFood();
	
	//QUE POUR TEST
	public PanelTransport getpT();
	public PanelFood getPf();




	
}
