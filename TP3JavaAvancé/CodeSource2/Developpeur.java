package fichier;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Developpeur extends SeanceTravail{

	protected ArrayList<Tache> tachesAttribuees;
	protected ArrayList <SeanceTravail> s;
	protected String nom;
	
	public Developpeur(String nom) {
		this.nom = nom;
	}
	
	public String afficherInfos() {
		String res = "";
		
		res += "Développeur : "+nom;
		
		return res;
	}
	
	
	public long calculerTempsTotal() {
		long res = 0;
		
		for(SeanceTravail seance : s) {
			for(Tache t : seance.tac) {
				if(!tachesAttribuees.contains(t)) {
					return -1;
				}
				res += t.calculerTempsTotal();
			}
		}
		
		return res;
	}

	public long calculerTempsTache(Tache t) {
		
		long res = 0;
		
		res += t.calculerTempsTotal();
		
		return res;
	}

	public void afficherRecapTaches() {
		for(SeanceTravail seance : s) {
			for(Tache t : seance.tac) {
				seance.afficher();
			}
		}

	}

}