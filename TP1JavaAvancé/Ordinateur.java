public class Ordinateur extends Equipement{
	
	private float tailleEcran;
	private String clavier;
	private String systeme;
	
	public Ordinateur() {
		this.setTailleEcran(24);
		this.setClavier("Azerty");
		this.setSysteme("Windows");
	}
	
	public Ordinateur(float tailleEcran, String clavier, String systeme, int jour, int mois, int annee, float prixA) {
		super(jour, mois, annee, prixA);
		this.tailleEcran = tailleEcran;
		this.clavier = clavier;
		this.systeme = systeme;
	}
	
	
	public void afficherConsole() {
		System.out.println("Ordinateur :");
		System.out.println("- date d'achat :"+getDateAchat()+"("+getAge()+"jours)");
		System.out.println("- prix :"+getPrixAchat()+"€");
		System.out.println("- tailleEcran : "+ getTailleEcran());
		System.out.println("- clavier : "+ getClavier());
		System.out.println("- système : "+ getSysteme());
	}

	public float getTailleEcran() {
		return tailleEcran;
	}

	public void setTailleEcran(float tailleEcran) {
		this.tailleEcran = tailleEcran;
	}

	public String getClavier() {
		return clavier;
	}

	public void setClavier(String clavier) {
		this.clavier = clavier;
	}

	public String getSysteme() {
		return systeme;
	}

	public void setSysteme(String systeme) {
		this.systeme = systeme;
	}

}
