package fr.carboneIUT.model;


public class ModelOrdinateur {

	public Model m;
	
	public ModelOrdinateur(Model m){
		this.m = m;
		m.init();
		
	}
	
	public enum OrdinateurType{
		ORDINATEUR_IUT("Ordinateur de l'IUT", 5), ORDINATEUR_PERSO("Ordinateur portable personnel", 2.5);

		private String name;
		private double conso;
		
		private OrdinateurType(String name, double conso) {
			this.name = name;
			this.conso = conso;
		}
		
		String getName() {
			return name;
		}
		double getConso() {
			return this.conso;
		}
	}
	
	public void setConso(OrdinateurType type) {
		m.ajouterMax(type.getConso());
		m.ajouterMin(type.getConso());
	}
	
	//public modele() {}
}

