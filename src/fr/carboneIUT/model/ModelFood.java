package fr.carboneIUT.model;

public class ModelFood {
	int nbVegan = 0;
	int nbVegetarien = 0;
	int nbBoeuf = 0;
	int nbAutreViandePoisson = 0;
	
	public ModelFood(Model model) {}
	
	public enum Meal{
		VEGAN(0.4), VEGETARIEN(0.5), BOEUF(7), AUTRE_VIANDE_POISSON(1.1);

		private double coef;
		
		private Meal(double coef) {
			this.coef = coef;
		}
		
		double getCoef() {
			return this.coef;
		}
	}
	
	public void init() {
		nbAutreViandePoisson=0;
		nbBoeuf=0;
		nbVegan=0;
		nbVegetarien=0;
	}
	
	public void addMeals(Meal m, int q) {
		switch(m) {
		case AUTRE_VIANDE_POISSON:
			nbAutreViandePoisson += q;
			break;
		case BOEUF:
			nbBoeuf += q;
			break;
		case VEGAN:
			nbVegan += q;
			break;
		case VEGETARIEN:
			nbVegetarien += q;
			break;
		default:
			break;
		}
	}
	public double computeCO2() {
		return (getNbBoeuf()*getCO2(Meal.BOEUF))+(getNbAutreViandePoisson()*getCO2(Meal.AUTRE_VIANDE_POISSON))+
				(getNbVegan()*getCO2(Meal.VEGAN))+(getNbVegetarien()*getCO2(Meal.VEGETARIEN));
	}

	public int getNbVegan() {
		return nbVegan;
	}

	public int getNbVegetarien() {
		return nbVegetarien;
	}

	public int getNbBoeuf() {
		return nbBoeuf;
	}

	public int getNbAutreViandePoisson() {
		return nbAutreViandePoisson;
	}
	
	public static double getCO2(Meal meal) {
		return meal.getCoef();
	}
	
	
}
