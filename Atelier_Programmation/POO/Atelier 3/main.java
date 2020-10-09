/**
 * Classe Main
 * @author Vincent Bonnemayre
 */
import java.util.GregorianCalendar;

public class main {

	public static void main(String[] args) {
        Adresse adr1 = new Adresse(4,"Beau fromage","20250","Corte");
        Adresse adr2 = new Adresse(4,"Volcan","00000","Mars");
        
        GregorianCalendar gc1 = new GregorianCalendar(1999,9,30);
        GregorianCalendar gc2 = new GregorianCalendar(2002,2,05);
        GregorianCalendar gc3 = new GregorianCalendar(2015,10,05);
        GregorianCalendar gc4 = new GregorianCalendar(2015,9,30);
        GregorianCalendar gc5 = new GregorianCalendar(2018,9,30);
        

		Personne p1 = new Personne("KOKO","Michel", gc1, adr1);
		Personne p2 = new Personne("KOKOKO","Michelo", gc1, adr1);
		Personne p3 = new Personne("KOKOTTINE","Michelle", gc1, adr1);
		Personne p4 = new Personne("KOKOTTO","Michelien", gc1, adr1);
		Personne p5 = new Personne("KOKOKU","Micheleon", gc1, adr1);
		Personne p6 = new Personne("L'eponge","Bob", gc1, adr1);
		
		System.out.print("\nLe System.err.print() a tendance à ne pas afficher à la bonne position le message d'erreur\n");
        System.out.println("\nCréation d'un employé KOKO Michel, né le 1999/09/30, tentative d'embauche le 2002/02/05 (une erreur d'age est attendue) :\n");
		Employe e1 = Employe.createEmploye(p1,gc2,1250);
        System.out.println("\nCréation d'un employé KOKO Michel, né le 1999/09/30, tentative d'embauche le 2015/02/05 (une erreur d'age est attendue) :\n");
		Employe e2 = Employe.createEmploye(p2,gc3,12500);
        System.out.println("\nCréation d'une secretaire KOKOTTINE Michelle, née le 1999/09/30, tentative d'embauche le 2015/9/30 (Aucune erreur n'est attendue) :\n");
		Secretaire s1 = Secretaire.createSecretaire(p3,gc4,1500);
		
		System.out.println("Test de la surcharge de toString d'une personne (p1):\n"+p1.toString());
		
		System.out.println("\nKOKO Michel est la même personne que KOKOTTINE Michelle ? : " + p1.equals(p3));
		
		
		// Si une variable de type Employe est crée mais que les valeurs entrées en paramètres ne sont pas valides, il n'y aura pas
		// d'instance de Employe associée. Appeler une fonction d'instance sur la variables provoquera une erreur.
		// Il faudrait idéalement vérifier lors de l'appel de la fonction
		
		if(e2 != null)
		{
			System.out.print("\nTest de la surcharge de toString d'une personne (p2):\n" + e2.toString());
		}
		Secretaire s2 = Secretaire.createSecretaire(p6,gc4,1500);
		Manager m1 = Manager.createManager(p1,gc5 , 3000, s1);
		Manager m2 = Manager.createManager(p4,gc5 , 3000, s1);
		Manager m3 = Manager.createManager(p5,gc5 , 3000, s1);
		
		System.out.println("\n"+s1);
		
		System.out.print("\nChangement de secrétaire d'un manager\n");
		m3.setSecretaire(s2);
		System.out.println("\n"+s1);
		
		System.out.println("\n"+s2);
		
		System.out.print("\nTest de la surcharge de toString d'un manager (m3):\n" + m3.toString());
		
	}

}
