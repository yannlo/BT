package classList;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Classe {
	
	// atribut
	private String codeCL;
	private String libelleCL ;
	
	// variable d'incrementation
	private static int increment = 1;
	private static String year = null;
	
	// constructeur de classe
	public Classe(String libelle) {
		// insertion de la valeur de libelleCL
		this.setLibelleCL(libelle);
		
		// insertion de la valeur de codeCL
		this.codeCL = codeFormat();
		
	}
	// fonction de retour de codeCL
	public String getCodeCL() {
		return this.codeCL;
	}
	
	// fonction de retour de libelleCL
	public String getLibelleCL() {
		return this.libelleCL;
	}
	
	// fonction de modification du libelle
	public void setLibelleCL(String libelle) {
		this.libelleCL = libelle;
	}
	
	public String toString() {
		// mise au format d'affichage
		String formatage = "Classe(code: "+ this.codeCL +" ;nom: "+ this.libelleCL +" )";
		return formatage;
	}
	
	// genrer le format de codeCL
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
		//matricule generer
		String matricule = null;
		if(year == null) {
			year = valueYear;	
			
			increment =1;
			
			//matricule generer
			matricule = "CLS-"+valueYear+"-00"+increment;
			
			increment++;
		}else {
			if(year == valueYear) {
				
				// convestion de la valeur en string
				String value = Integer.toString(increment);
				
				//tranformation de la valeur en tableau
				String[] explode = value.split("##");
				
				
				switch(explode.length) {
				case 1:
					matricule ="CLS-"+valueYear+"-00"+value;
					break;
				case 2:
					matricule ="CLS-"+valueYear+"-0"+value;
					break;
				case 3:
					matricule ="CLS-"+valueYear+"-"+value;
					break;
					
				default:
					matricule ="CLS-"+valueYear+"-000";
					break;
				}
				
				increment++;
			}
		}
		
		return matricule;
	}


}
