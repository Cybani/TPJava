import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Baptiste
 */

public abstract class Equipement {

	private Calendar dateAchat;
	private int age;// en jours
	private float prixAchat;

	//--------Création du constructeur par défaut-------
	
	public Equipement() {
		// dateAchat par défaut
		dateAchat = new GregorianCalendar(2022,0,31); // 31 janvier 2020
				
		// --------  calcul de l'age -------
		Calendar aujourdhui = new GregorianCalendar();
		// age en millisecondes
		long diffMillis = aujourdhui.getTimeInMillis()-dateAchat.getTimeInMillis();
		
		// conversion en jours
		age = (int)(1.0*diffMillis / (1000.0 * 60.0 * 60.0 * 24.0));
		// ------  fin calcul de l'age -----
		
		System.out.println("date achat :  " + dateAchat.getTime()); // exemple d'afficahge
		
	}
	
	//--------Création du constructeur-------
	
	/**
	 * Les paramètres doivents être positifs
	 * @param jour 0<j<31
	 * @param mois 0<m<12
	 * @param annee 0<a<2024
	 * @param prixA 0<p<10000
	 * @throws IllegalArgumentException prixAchat < 0
	 * @throws IllegalArgumentException jour < 0 || jour > 31)||(mois < 0 || mois > 12)||(annee < 0 || annee > 2024 
	 */
	
	public Equipement(int jour, int mois, int annee, float prixA) {
		if(prixAchat < 0) {
			throw new IllegalArgumentException("Le prix doit être supérieur à 0");
		}
		if((jour < 0 || jour > 31)||(mois < 0 || mois > 12)||(annee < 0 || annee > 2024)) {
			throw new IllegalArgumentException("La date ne correspond pas");
		}
		this.prixAchat = prixA;
		this.dateAchat = new GregorianCalendar(annee, mois-1, jour);
		this.age = this.majAge();
	}
	
	//--------Création de la méthode abstraite afficherConsole -------
	
	public abstract void afficherConsole();

	//--------Création de la méthode de mise à jour de l'âge-------
	
	public int majAge() {
		
		dateAchat = getDate();
		Calendar aujourdhui = new GregorianCalendar();
		long diffMillis = aujourdhui.getTimeInMillis()-dateAchat.getTimeInMillis();
		age = (int)(1.0*diffMillis / (1000.0 * 60.0 * 60.0 * 24.0));
		
		return age;
	}
	
//--------Création des setter et getter-------
	
	/**
	 * dateAchat doit être positif
	 * @param dateAchat
	 */
	
	public void setDateAchat(Calendar dateAchat) {
		dateAchat = this.dateAchat;
		age = majAge();
	}
	
	/**
	 * @return La date d'achat
	 */
	
	public Date getDateAchat() {
		return dateAchat.getTime();
	}
	
	/**
	 * @return La date d'achat
	 */
	
	public Calendar getDate() {
		return dateAchat;
	}
	
	/**
	 * Aucuns des paramètres ne doivent être négatifs
	 * @param jour
	 * @param mois
	 * @param annee
	 * @throws IllegalArgumentException jour < 0 || jour > 31)||(mois < 0 || mois > 12)||(annee < 0 || annee > 2024
	 */

	public void setDateAchat(int jour, int mois, int annee) {
		if((jour < 0 || jour > 31)||(mois < 0 || mois > 12)||(annee < 0 || annee > 2024)) {
			throw new IllegalArgumentException("La date ne correspond pas");
		}
		this.dateAchat = new GregorianCalendar(annee, mois-1, jour);
		age = this.majAge();
	}
	
	/**
	 * @return L'âge
	 */
	
	public int getAge() {
		return age;
	}

	
	/**
	 * @return Le prix d'achat
	 */
	public float getPrixAchat() {
		return prixAchat;
	}


	/**
	 * prixAchat doit être positif
	 * @param prixAchat
	 * @throws IllegalArgumentException prixAchat <= 0
	 */
	public void setPrixAchat(float prixAchat) {
		if(prixAchat <= 0) {
			throw new IllegalArgumentException("Le prix doit être supérieur à 0");
		}
		this.prixAchat = prixAchat;
	}

	
	
}
