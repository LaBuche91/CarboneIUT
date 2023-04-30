package fr.carboneIUT.model;


public class ModelTransport {

	dataTransport data;
	Model m;
	
	public ModelTransport(Model m) {
		this.m = m;
		this.data = new dataTransport();
	}
	
	public void ajouter(String cat) {
		if(!data.existCat(cat))return;
		
		System.out.println("Ajout " + cat + " :");
		System.out.println(data.getCntribMin(cat));
		System.out.println(data.getCntribMax(cat));
		
		m.ajouterMin( data.getCntribMin(cat) );
		m.ajouterMax( data.getCntribMax(cat) );
	}
	
	//public modele() {}
}

