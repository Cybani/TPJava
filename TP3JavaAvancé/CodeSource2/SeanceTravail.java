package fichier;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class SeanceTravail {

	protected LocalDate jour;
	protected LocalTime heureDebut;
	protected LocalTime heureFin;
	protected ArrayList<Developpeur> dev;
	protected ArrayList<Tache> tac;
	protected String lieuTravail;
	protected boolean estValidee;
	protected boolean enLigne;
	//-------------------------------------------------------------------------
	// Constructeurs
	//-------------------------------------------------------------------------	
	public SeanceTravail() {
		jour = LocalDate.now();		
		heureDebut = LocalTime.now(); 
		heureFin = LocalTime.now();
	}
	
	public SeanceTravail(LocalDate j) {
		jour = j;		
		heureDebut = LocalTime.now(); 
		heureFin = LocalTime.now();
	}	
	
	public SeanceTravail(LocalDate j, LocalTime deb) {
		jour = j;		
		heureDebut = deb; 
		heureFin = LocalTime.now();
	}	
	
	public SeanceTravail(LocalDate j, LocalTime deb, LocalTime fin) {
		jour = j;		
		heureDebut = deb; 
		heureFin = fin;
	}	
	

	
	//-------------------------------------------------------------------------
	// Méthodes
	//-------------------------------------------------------------------------		
	
	// Durée de la séance de travail
	// Retourne : 
	//   -1 si pas de durée calculable : une des deux heures manque, ou heureFin < heureDebut
	//   un temps en minutes sinon
	public long calculerDuree() {
		long res = -1;
		
		if (heureDebut!=null && heureFin!=null) {
			Duration d=Duration.between(heureDebut,heureFin);
			
			if (d.toMinutes()<0) 
				return -1;
			else 
				return d.toMinutes();
		}
		
		return res;
	}
	
	
	public void afficher() {
		System.out.println("Séance : ");
		System.out.println(jour.format(DateTimeFormatter.ofPattern("E dd/MM/yyyy")));
		System.out.println(" - "+heureDebut.format(DateTimeFormatter.ofPattern("HH:mm")));
		System.out.println("..."+heureFin.format(DateTimeFormatter.ofPattern("HH:mm")));
		System.out.println("=> "+calculerDuree());
	}

}