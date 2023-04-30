package fr.carboneIUT.model;

import java.util.HashMap;

public class dataTransport {
	private HashMap<String, double[]> tab;

	public dataTransport() {
		this.tab = new HashMap<String, double[]>();
		
		double[] index = {4.5, 20};
		tab.put("Voiture perso", index);
			
		double[] index2 = {2, 10};
		tab.put("Covoiturage", index2);
			
		double[] index3 = {0.001, 0.22};
		tab.put("Velo", index3);

		double[] index4 = {0.22 , 1};
		tab.put("Transport en commun", index4);
			
		double[] index5 = {0, 20};
		tab.put("Autre", index5);
	}
	
	public HashMap<String, double[]> getTab() {
		return tab;
	}
	
	public double getCntribMin(String cat) {
		return tab.get(cat)[0];
	}
	public double getCntribMax(String cat) {
		return tab.get(cat)[1];
	}

	public boolean existCat(String cat) {
		return tab.containsKey(cat);
	}
}
