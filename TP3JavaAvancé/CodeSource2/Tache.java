package fichier;

import java.util.*;

public class Tache {

	protected ArrayList<Developpeur> listeDevs;
	protected ArrayList<SeanceTravail> s;
	protected String nom;
	
	public Tache(String nom) {
		this.nom = nom;
	}

	public long calculerTempsTotal() {
		long res = 0;
		
		for(SeanceTravail seance : s) {
			res += seance.calculerDuree();
		}
		
		return res;
	}

	public void afficherRecap() {
		for(Developpeur d : listeDevs) {
			System.out.println("Tâche attribuée à :"+d.nom);
		}
	}

}