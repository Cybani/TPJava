package fichier;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		System.out.println("Jusqu'ici tout va bien.");
		
		
		
		// ===== Demo de SeanceTravail =====
		// version "longue"
		SeanceTravail s1 = new SeanceTravail();
		s1.jour = LocalDate.of(2024, 4, 15);
		s1.heureDebut = LocalTime.of(8, 45);
		s1.heureFin = LocalTime.of(10, 30);
		long duree = s1.calculerDuree();
		
		System.out.println("Duree de s1 : "+duree+" minutes");
		
		s1.afficher();
		
		// version "courte"
		SeanceTravail s2 = new SeanceTravail(LocalDate.of(2024, 5, 30), LocalTime.of(18, 30), LocalTime.of(14, 45) );

		System.out.println("Duree de s2 : "+s2.calculerDuree()+" minutes");
		
		s2.afficher();
	}

}
