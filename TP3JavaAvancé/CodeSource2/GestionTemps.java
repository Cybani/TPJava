package fichier;

import java.util.*;

public class GestionTemps {

	protected ArrayList<Developpeur> listeDevs;
	protected ArrayList<Tache> listeTaches;


	public Developpeur ajouterDev(String nom) {
		for(Developpeur d : listeDevs) {
			if(d.nom == nom) {
				System.out.println("Ce dev existe deja");
				return null;
			}
		}
		Developpeur d = new Developpeur(nom);
		listeDevs.add(d);
		return d;
	}


	public Tache ajouterTache(String nom) {
		for(Tache t : listeTaches) {
			if(t.nom == nom) {
				System.out.println("Cette tache est déjà attribuée");
				return null;
			}
		}
			Tache tache = new Tache(nom);
			listeTaches.add(tache);
			return tache;
	}


	public boolean attribuerTacheDev(Developpeur dev, Tache tac) {
		return true;
	}

	public long calculerTempsTotalDev() {
		return 0;
	}

	public void afficherRecapTaches() {
	}

}