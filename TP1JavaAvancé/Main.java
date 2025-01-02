
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipement e1 = new Equipement();
		Equipement e2 = new Equipement(23,5,1997,200);
		Ordinateur o1 = new Ordinateur();
		Ordinateur o2 = new Ordinateur(17, "Azerty", "Windows", 1,0,2001, 250);
		GestionStock g2 = new GestionStock("Sif");
		System.out.println(e1.getAge());
		System.out.println(e1.getPrixAchat());
		e1.setDateAchat(3,1, 2006);
		System.out.println(e1.getDateAchat());
		e1.afficherConsole();
		e2.afficherConsole();
		o1.afficherConsole();
		o2.afficherConsole();
		g2.ajouterEquipement(e1, o1);
		System.out.println(g2.getNbEquipements());
		g2.afficherConsole();
		System.out.println(g2.getNbOrdinateurs());
	}

}
