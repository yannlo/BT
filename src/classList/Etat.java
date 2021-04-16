package classList;

public class Etat {
	// Atributs
	private int idEtat;
	private String nomEtat ;
	
	// variable d'incrementation
	static int increment = 1;
	
	// constructeur d'etat
	public Etat(String nom) {
		// insertion de la valeur de nomEtat
		this.setNomEtat(nom);
		
		// insertion de la valeur de l'idEtat
		this.idEtat = increment;
		increment++;
		
	}
	// fonction de retour de l'idEtat
	public int getIdEtat() {
		return idEtat;
	}
	
	// fonction de retour de nomEtat
	public String getNomEtat() {
		return nomEtat;
	}
	
	// fonction de modification du nom
	public void setNomEtat(String nomEtat) {
		this.nomEtat = nomEtat;
	}
	
	public String toString() {
		// mise au format d'affichage
		String formatage = "Etat(id: "+ this.idEtat +" ;nom: "+ this.nomEtat +" )";
		return formatage;
	}
}
