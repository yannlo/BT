package classList;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Livre {
	
	// Attribut
	private String codeL;
	private int idAuteur;
	private int idGenre;
	private String titreL;
	private int nbPageL;
	
	private static int increment=1;
	private static String year;
	
	// Constructeur de classe
	
	public Livre (int idAuteur, int idGenre, String titreL, int nbPageL) {
		
		// insertion des valeurs
		this.idAuteur = idAuteur;
		this.idGenre = idGenre;
		this.setTitreL(titreL);
		this.setNbPageL(nbPageL);
		
		// creation de l'id
		this.codeL = codeFormat();
	}
	
	
	// fonction getter et setter
	public String getCodeL() {
		return codeL;
	}




	public int getIdAuteur() {
		return idAuteur;
	}




	public int getIdGenre() {
		return idGenre;
	}




	public String getTitreL() {
		return titreL;
	}




	public void setTitreL(String titreL) {
		this.titreL = titreL;
	}




	public int getNbPageL() {
		return nbPageL;
	}




	public void setNbPageL(int nbPageL) {
		this.nbPageL = nbPageL;
	}
	
	// generateur de codeL
	private String codeFormat() {
		/**
		 * Generer un nouveau matricule a la creation d'une classe
		 * int increment a ajouter
		 * 
		 * format: CLS-AA-XXX
		 * 
		 */
		
		// date 
		SimpleDateFormat date = new SimpleDateFormat("yy");
		Date dateRef = new Date();
		
		// enregister la value de la date
		String valueYear = date.format(dateRef);
		year = valueYear;

		//matricule generer
		String matricule = null;
		if(year == null || year != valueYear) {
			year = valueYear;	
			
			increment =1;
			
			//matricule generer
			matricule = "LIV-"+valueYear+"-00"+increment;
			
			increment++;
		}else {
			if(year == valueYear) {
				
				// convestion de la valeur en string
				String value = Integer.toString(increment);
				
				//tranformation de la valeur en tableau
				String[] explode = value.split("##");
				
				
				switch(explode.length) {
				case 1:
					matricule ="LIV-"+valueYear+"-00"+value;
					break;
				case 2:
					matricule ="LIV-"+valueYear+"-0"+value;
					break;
				case 3:
					matricule ="LIV-"+valueYear+"-"+value;
					break;
					
				default:
					matricule ="LIV-"+valueYear+"-000";
					break;
				}
				
				increment++;
			}
		}
		
		
		increment++;
		return matricule;
	}



}
