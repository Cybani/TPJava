/**
 * @author Baptiste
 */
public class Ordinateur extends Equipement{
	
	private float tailleEcran;
	private String clavier;
	private String systeme;
	
	/**
	 * Création du constructeur par défaut
	 */
	
	public Ordinateur() {
		this.setTailleEcran(24);
		this.setClavier("Azerty");
		this.setSysteme("Windows");
	}
	
	/**
	 * Création du constructeur
	 * @param tailleEcran > 0
	 * @param clavier Non vide
	 * @param systeme Non vide
	 * @param jour 0<j<31
	 * @param mois 0<m<12
	 * @param annee 0<a<2024
	 * @param prixA 0<p<10000
	 * @throws IllegalArgumentException tailleEcran <= 0
	 * @throws IllegalArgumentException clavier == ""
	 * @throws IllegalArgumentException systeme == ""
	 */
	
	public Ordinateur(float tailleEcran, String clavier, String systeme, int jour, int mois, int annee, float prixA) {
		super(jour, mois, annee, prixA);
		if(tailleEcran <= 0) {
			throw new IllegalArgumentException("La taille de l'écran doit être supérieur à 0");
		}
		if(clavier == "") {
			throw new IllegalArgumentException("Le nom du clavier doit être renseigné");
		}
		if(systeme == "") {
			throw new IllegalArgumentException("Le nom du systeme doit être renseigné");
		}
		this.tailleEcran = tailleEcran;
		this.clavier = clavier;
		this.systeme = systeme;
	}
	
	/**
	 * Affiche ce que l'on veut dans la console
	 */
	
	public void afficherConsole() {
		System.out.println("Ordinateur :");
		System.out.println("- date d'achat :"+getDateAchat()+"("+getAge()+"jours)");
		System.out.println("- prix :"+getPrixAchat()+"€");
		System.out.println("- tailleEcran : "+ getTailleEcran());
		System.out.println("- clavier : "+ getClavier());
		System.out.println("- système : "+ getSysteme());
	}
	
//--------Création des getter et setter-------
	
	/**
	 * @return tailleEcran
	 */

	public float getTailleEcran() {
		return tailleEcran;
	}
	
	/**
	 * doit être supérieur à 0
	 * @param tailleEcran
	 */
	public void setTailleEcran(float tailleEcran) {
		this.tailleEcran = tailleEcran;
	}
	
	
	/**
	 * @return clavier
	 */
	
	public String getClavier() {
		return clavier;
	}
	
	/**
	 * Ne doit pas être vide
	 * @param clavier
	 * @throws IllegalArgumentException clavier == ""
	 */
	
	public void setClavier(String clavier) {
		if(clavier == "") {
			throw new IllegalArgumentException("Le nom du clavier doit être renseigné");
		}
		this.clavier = clavier;
	}
	
	/**
	 * @return systeme
	 */

	public String getSysteme() {
		return systeme;
	}
	
	/**
	 * Ne doit pas être vide
	 * @param systeme
	 * @throws IllegalArgumentException systeme == ""
	 */

	public void setSysteme(String systeme) {
		if(systeme == "") {
			throw new IllegalArgumentException("Le nom du systeme doit être renseigné");
		}
		this.systeme = systeme;
	}

}
