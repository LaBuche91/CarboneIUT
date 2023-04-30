package fr.carboneIUT.model;

public class Model {
	
	private double co2Min;
	private double co2Max;
	
	public void ajouterMin(double m) {
		this.co2Min += m;
	}
	public void ajouterMax(double m) {
		this.co2Max += m;
	}
	
	public double getCo2Max() {
		return this.co2Max;
	}
	public double getCo2Min() {
		return this.co2Min;
	}
	
	
	public void init() {
		this.co2Max=0;
		this.co2Min=0;
	}
}
