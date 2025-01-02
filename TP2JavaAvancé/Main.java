/**
 * @author Baptiste
 */
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//--------Création de 2 objets de type Ordinateur et un qui va nous permettre de gérer le stock-------
		Ordinateur o1 = new Ordinateur();
		Ordinateur o2 = new Ordinateur(17, "Azerty", "Windows", 1,0,2001, 250);
		
		/**
		 * Création de l'ordinateur o3 avec une date érronée pour tester l'exception 
		 */
		
		Ordinateur o3 = new Ordinateur(20, "Azerty", "Windows", -12, 5, 1987, 110);
		
		GestionStock g2 = new GestionStock("Sif");
		
		//--------Affichage dans la console-------
		o1.afficherConsole();
		o2.afficherConsole();
		o3.afficherConsole();
		System.out.println(g2.getNbEquipements());
		g2.afficherConsole();
		System.out.println(g2.getNbOrdinateurs());
	}

}
