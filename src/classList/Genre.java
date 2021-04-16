package classList;

public class Genre {
	// Atributs
	private int idGenre;
	private String nomGenre ;
	
	// variable d'incrementation
	static int increment = 1;
	
	// constructeur de genre
	public Genre(String nom) {
		// insertion de la valeur de nomGenre
		this.setNomGenre(nom);
		
		// insertion de la valeur de l'idGenre
		this.idGenre = increment;
		increment++;
		
	}
	// fonction de retour de l'idGenre
	public int getIdGenre() {
		return idGenre;
	}
	
	// fonction de retour de nomGenre
	public String getNomGenre() {
		return nomGenre;
	}
	
	// fonction de modification du nom
	public void setNomGenre(String nomGenre) {
		this.nomGenre = nomGenre;
	}
	
	public String toString() {
		// mise au format d'affichage
		String formatage = "Genre(id: "+ this.idGenre +" ;nom: "+ this.nomGenre +" )";
		return formatage;
	}
}
