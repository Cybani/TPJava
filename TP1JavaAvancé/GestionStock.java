import java.util.ArrayList;

public class GestionStock {
	
	private String nomResponsable;
	private ArrayList<Equipement> listeEquipements = new ArrayList<Equipement>() ;
	
	public GestionStock() {
		this.setNomResponsable(" ");
	}
	
	public GestionStock(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}
	
	public void ajouterEquipement(Equipement e1, Ordinateur o1) {
		listeEquipements.add(e1);
		listeEquipements.add(o1);
	}
	
	public int getNbEquipements() {
		return listeEquipements.size();
	}
	
	public void afficherConsole() {
		System.out.println("Equipements :");
		for(int i = 0; i < listeEquipements.size(); i++) {
			(listeEquipements.get(i)).afficherConsole();
		}
	}
	
	public int getNbOrdinateurs() {
		int res = 0;
		for(Object obj : listeEquipements) {
			if(obj instanceof Ordinateur) {
				res += 1;
			}
		}
		return res;
	}
	
	public String getNomResponsable() {
		return nomResponsable;
	}
	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}

}
