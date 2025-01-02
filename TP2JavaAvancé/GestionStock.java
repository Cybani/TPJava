import java.util.ArrayList;

/**
 * @author Baptiste
 */

public class GestionStock {
	
	private String nomResponsable;
	private ArrayList<Equipement> listeEquipements = new ArrayList<Equipement>() ;
	
	/**
	 * Création du constructeur par défaut
	 */
	
	public GestionStock() {
		this.setNomResponsable(" ");
	}
	
	/**
	 * Ne doit pas être vide
	 * @param nomResponsable
	 * @thrpws IllegalArgumentException nomResponsable == ""
	 */
	
	public GestionStock(String nomResponsable) {
		if(nomResponsable == "") {
			throw new IllegalArgumentException("Le nom doit être renseigné");
		}
		this.nomResponsable = nomResponsable;
	}
	
	/**
	 * Ajouter les equipements dans une liste définie précédement
	 * @param e1
	 * @param o1
	 */
	
	public void ajouterEquipement(Equipement e1, Ordinateur o1) {
		listeEquipements.add(e1);
		listeEquipements.add(o1);
	}
	
	/**
	 * 
	 * @return la taille de la liste
	 */
	
	public int getNbEquipements() {
		return listeEquipements.size();
	}
	
	/**
	 * Affiche ce que l'on souhaite dans la console
	 */
	
	public void afficherConsole() {
		System.out.println("Equipements :");
		for(int i = 0; i < listeEquipements.size(); i++) {
			(listeEquipements.get(i)).afficherConsole();
		}
	}
	
	/**
	 * @return le nombre d'ordinateurs dans la liste
	 */
	
	public int getNbOrdinateurs() {
		int res = 0;
		for(Object obj : listeEquipements) {
			if(obj instanceof Ordinateur) {
				res += 1;
			}
		}
		return res;
	}
	
//--------Création des setter et getter-------
	
	/**
	 * @return Le nom du responsable
	 */
	
	public String getNomResponsable() {
		return nomResponsable;
	}
	
	/**
	 * Ne doit pas être vide
	 * @param nomResponsable
	 * @throws IllegalArgumentException nomResponsable == ""
	 */
	
	public void setNomResponsable(String nomResponsable) {
		if(nomResponsable == "") {
			throw new IllegalArgumentException("Le nom doit être renseigné");
		}
		this.nomResponsable = nomResponsable;
	}

}
