package classList;

public class Auteur {
	
	// Atributs
	private int idAuteur;
	private String nomAuteur ;
	
	// variable d'incrementation
	static int increment = 1;
	
	// constructeur d'auteur
	public Auteur(String nom) {
		// insertion de la valeur de nomAuteur
		this.setNomAuteur(nom);
		
		// insertion de la valeur de l'idAuteur
		this.idAuteur = increment;
		increment++;
		
	}
	// fonction de retour de l'idAuteur
	public int getIdAuteur() {
		return idAuteur;
	}
	
	// fonction de retour de nomAuteur
	public String getNomAuteur() {
		return nomAuteur;
	}
	
	// fonction de modification du nom
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	
	public String toString() {
		// mise au format d'affichage
		String formatage = "Auteur(id: "+ this.idAuteur +" ;nom: "+ this.nomAuteur +" )";
		return formatage;
	}

}
