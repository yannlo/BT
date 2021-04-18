package classList;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Gestionnaire {
	
	//Attribut
	private String codeG;
	private String nomG;
	private String prenomG;
	private String emailG;
	private String motDePasseG;
	private String contactG;
	
	private static int increment = 1;
	private static String year;
	
	
	public Gestionnaire(String nomG, String prenomG, String emailG, String motDePasseG, String contactG) {
		this.setNomG(nomG);
		this.setPrenomG(prenomG);
		this.setEmailG(emailG);
		this.setMotDePasseG(motDePasseG);
		this.setContactG(contactG);
		
		
		this.codeG = codeFormat();
		
		
	}
	
	public String getCodeG() {
		return codeG;
	}
	
	public String getNomG() {
		return nomG;
	}
	
	public void setNomG(String nomG) {
		this.nomG = nomG;
	}

	public String getPrenomG() {
		return prenomG;
	}

	public void setPrenomG(String prenomG) {
		this.prenomG = prenomG;
	}


	public String getContactG() {
		return contactG;
	}

	public void setContactG(String contactG) {
		this.contactG = contactG;
	}

	public String getMotDePasseG() {
		return motDePasseG;
	}

	public void setMotDePasseG(String motDePasseG) {
		this.motDePasseG = motDePasseG;
	}

	public String getEmailG() {
		return emailG;
	}

	public void setEmailG(String emailG) {
		this.emailG = emailG;
	}
	
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
			matricule = "GES-"+valueYear+"-00"+increment;
			
			increment++;
		}else {
			if(year == valueYear) {
				
				// convestion de la valeur en string
				String value = Integer.toString(increment);
				
				//tranformation de la valeur en tableau
				String[] explode = value.split("##");
				
				
				switch(explode.length) {
				case 1:
					matricule ="GES-"+valueYear+"-00"+value;
					break;
				case 2:
					matricule ="GES-"+valueYear+"-0"+value;
					break;
				case 3:
					matricule ="GES-"+valueYear+"-"+value;
					break;
					
				default:
					matricule ="GES-"+valueYear+"-000";
					break;
				}
				
				increment++;
			}
		}
		
		return matricule;
	}

	
	
	

}
