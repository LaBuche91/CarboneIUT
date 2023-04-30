package fr.carboneIUT.presentation;

import javax.swing.JFrame;

import fr.carboneIUT.model.Model;
import fr.carboneIUT.model.ModelFood;
import fr.carboneIUT.model.ModelOrdinateur;
import fr.carboneIUT.model.ModelFood.Meal;
import fr.carboneIUT.model.ModelOrdinateur.OrdinateurType;
import fr.carboneIUT.model.ModelTransport;
import fr.carboneIUT.view.PanelFood;
import fr.carboneIUT.view.PanelMain;
import fr.carboneIUT.view.PanelOrdinateur;
import fr.carboneIUT.view.PanelThanks;
import fr.carboneIUT.view.PanelTransport;

public class Presentation implements IPresentation{
	private PanelMain pm;
	private ModelTransport mt;
	private ModelFood mf;
	private Model modele;
	private ModelOrdinateur mo;
	
	private PanelThanks pth;
	private PanelTransport pT;
	private PanelFood pf;
	private PanelOrdinateur po;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Carbone IUT");
		Presentation myui = new Presentation(frame);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public Presentation(JFrame a) {
		this.modele = new Model();
		this.modele.init();
		
		this.mt=new ModelTransport(modele);
		this.mf=new ModelFood(modele);
		this.mo=new ModelOrdinateur(modele);
		this.pm = new PanelMain(this, a);
	}
	@Override
	public void changePanel() {
		pm.changePanel();
	}
	@Override
	public void setPth(PanelThanks pth) {
		this.pth = pth;
	}
	@Override
	public void setPT(PanelTransport pt) {
		this.pT=pt;
	}
	@Override
	public void setPo(PanelOrdinateur po) {
		this.po=po;
	}
	@Override
	public void setPf(PanelFood pf) {
		this.pf = pf;
	}
	
	@Override
	public PanelFood getPf() {
		return this.pf;
	}
	
	@Override
	public void ajouterCat(String cat) {
		this.mt.ajouter(cat);
	}

	@Override
	public void initModel() {
		// TODO Auto-generated method stub
		this.modele.init();
	}
	
	@Override
	public void initModelFood() {
		// TODO Auto-generated method stub
		this.mf.init();
	}

	@Override
	public void changerLabelThanks(String a) {
		this.pth.changerLabel(a);		
	}

	@Override
	public double getCo2Min() {
		return this.modele.getCo2Min();
	}

	@Override
	public double getCo2Max() {
		// TODO Auto-generated method stub
		return this.modele.getCo2Max();
	}
	//pour test uniquement
	@Override
	public PanelTransport getpT() {
		return pT;
	}
	@Override
	public void changerLabelErrorFood(String l) {
		this.pf.getLabelErreur().setText(l);
	}
	@Override
	public void initLabelPanelFood() {
		pf.getVeganText().setText("0");
		pf.getVegeText().setText("0");
		pf.getBoeufText().setText("0");
		pf.getAutreText().setText("0");
	}
	
	@Override
	public String getTextByMeal(Meal m) {
		switch(m) {
		case VEGAN:
			return pf.getVeganText().getText();
		case VEGETARIEN:
			return pf.getVegeText().getText();
		case AUTRE_VIANDE_POISSON:
			return pf.getAutreText().getText();
		case BOEUF :
			return pf.getBoeufText().getText();
		default :
			return null;
		}
	}

	@Override
	public void addMeal(Meal meal, int qte) {
		this.mf.addMeals(meal, qte);
	}
	@Override
	public double getCO2Food() {
		return this.mf.computeCO2();
	}

	@Override
	public OrdinateurType getSelectedOrdinateur() {
		if(this.po.getRbIUT().isSelected()) {
			return OrdinateurType.ORDINATEUR_IUT;
		}else if(this.po.getRbPERSO().isSelected()) {
			return OrdinateurType.ORDINATEUR_PERSO;
		}
		return null;
	}

	@Override
	public void setOrdinateurUtiliser(OrdinateurType orditypes) {
		this.mo.setConso(orditypes);
	}
}
