import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Equipement {

	private Calendar dateAchat;
	private int age;// en jours
	private float prixAchat;


	
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
	
	public Equipement(int jour, int mois, int annee, float prixA) {
		this.prixAchat = prixA;
		this.dateAchat = new GregorianCalendar(annee, mois-1, jour);
		this.age = this.majAge();
	}
	
	public void afficherConsole() {
		System.out.println("Equipement :");
		System.out.println("- date d'achat : "+ getDateAchat());
		System.out.println("- âge : "+ getAge()+ "jours");
		System.out.println("- prix : "+ getPrixAchat()+ "€");
		
	}

	
	public int majAge() {
		
		dateAchat = getDate();
		Calendar aujourdhui = new GregorianCalendar();
		long diffMillis = aujourdhui.getTimeInMillis()-dateAchat.getTimeInMillis();
		age = (int)(1.0*diffMillis / (1000.0 * 60.0 * 60.0 * 24.0));
		
		return age;
	}
	
	public void setDateAchat(Calendar dateAchat) {
		dateAchat = this.dateAchat;
		age = majAge();
	}
	
	
	public Date getDateAchat() {
		return dateAchat.getTime();
	}
	
	public Calendar getDate() {
		return dateAchat;
	}
	
	
	public void setDateAchat(int jour, int mois, int annee) {
		this.dateAchat = new GregorianCalendar(annee, mois-1, jour);
		age = this.majAge();
	}

	public int getAge() {
		return age;
	}

	

	public float getPrixAchat() {
		return prixAchat;
	}



	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}

	
	
}
