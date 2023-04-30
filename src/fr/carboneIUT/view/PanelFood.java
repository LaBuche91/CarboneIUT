package fr.carboneIUT.view;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.carboneIUT.controller.ControllerButtons;
import fr.carboneIUT.model.ModelFood.Meal;
import fr.carboneIUT.presentation.Presentation;

public class PanelFood extends JPanel{
	
	JTextField veganText = new JTextField();
	JTextField vegeText = new JTextField();
	JTextField boeufText = new JTextField();
	JTextField autreText = new JTextField();
	JLabel error = new JLabel();
	
	private static final long serialVersionUID = 1L;
	
	public PanelFood(Presentation u) {
		// TODO Auto-generated constructor stub
		super();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel trans = new JLabel("Indiquez le nombre de repas de chaque type pris par semaine");

        JLabel veganLabel = new JLabel("Vegan");
        JLabel vegeLabel = new JLabel("Vegetarien");
        JLabel boeufLabel = new JLabel("A base de boeuf");
        JLabel autreLabel = new JLabel("A base d'une autre viande ou d'un poisson");

        //on met tous a 0 par defaut
        veganText.setText("0");
        vegeText.setText("0");
        boeufText.setText("0");
        autreText.setText("0");
        
		add(trans);
		add(veganLabel);
		add(veganText);
		add(vegeLabel);
		add(vegeText);
		add(boeufLabel);
		add(boeufText);
		add(autreLabel);
		add(autreText);
		
		//label erreur
		add(error);
		
		JButton bNext = new JButton("Suivant");
		add(bNext);
		
		bNext.addActionListener(new ControllerButtons(u, "food"));
		//panel => controller => UIMain => PanelMain
	}
	
	public String getTextByMeal(Meal m) {
		switch(m) {
		case VEGAN:
			return veganText.getText();
		case VEGETARIEN:
			return vegeText.getText();
		case AUTRE_VIANDE_POISSON:
			return autreText.getText();
		case BOEUF :
			return boeufText.getText();
		default :
			return null;
		}
	}
	
	public JTextField getAutreText() {
		return autreText;
	}
	public JTextField getBoeufText() {
		return boeufText;
	}
	
	public JTextField getVeganText() {
		return veganText;
	}

	public JTextField getVegeText() {
		return vegeText;
	}
	
	public JLabel getLabelErreur() {
		return this.error;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setActionListener(ControllerButtons b) {
		
	}

}
