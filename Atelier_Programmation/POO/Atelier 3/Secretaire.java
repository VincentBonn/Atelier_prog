/**
 * Classe Secretaire servant �mod�liser les informations contenues dans une Secretaire
 * @author Vincent Bonnemayre
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.GregorianCalendar;

public class Secretaire extends Employe
{
	private ArrayList<Manager> myManager;
	/**
	 * Constructeur de Secretaire
	 * @param p -- personne secretaire
	 * @param new_laDateEmbauche -- la date � laquelle le secretaire est embauch�
	 * @param salaire -- salaire du secretaire
	 */
	private Secretaire(Personne p, GregorianCalendar new_laDateEmbauche, float salaire) {
		super(p, new_laDateEmbauche, salaire);
		myManager = new ArrayList<Manager>();
	}
	/**
	 * Test qui v�rifie si la personne entr�e aura un age valide lors de son embauchement pour cr�er un Secretaire.
	 * @param p -- personne dont la date de naissance va �tre compar�e.	 
	 * @param new_laDateEmbauche -- date d'embauche de la personne.
	 * @return retourne true si la personne peut �tre embauch�e � la date cibl�e, sinon false.
	 */
	public static Secretaire createSecretaire(Personne p, GregorianCalendar new_laDateEmbauche, float salaire)
	{
		Secretaire temp = null;
		if(checkLaDateEmbauche(p,new_laDateEmbauche))
		{
			temp = new Secretaire(p,new_laDateEmbauche,salaire);
		}
		return temp;
	}
	/**
	 * Calcule combien de manager le secretaire a � charge.
	 * @return retourne un entier sup�rieur ou �gal � 0.
	 */
	public int askSizeManager()
	{
		int result;
		if(myManager.isEmpty())
		{
			result = 0;
		}
		else
		{
			result = myManager.size();
		}
		return result;
	}

	/**
	 * Ajoute le manager voulu de la liste de l'instance.
	 * @param m -- le manager � ajouter.
	 */
	public void addManager(Manager m)
	{
		if(askSizeManager()<5)
		{
			myManager.add(m);
		}
	}
	/**
	 * Retire le manager voulu de la liste de l'instance.
	 * @param m -- le manager � retirer.
	 */
	public void removeManager(Manager m)
	{
		myManager.remove(m);
	}
	/**
	 * Pr�pare la pr�sentation des managers dont le secretaire a charge.
	 * @return retourne un string
	 */
	public String askDescriptionManager()
	{
		String temp = "\n";
	    Enumeration<Manager> e = Collections.enumeration(myManager);
	    while(e.hasMoreElements())
	        temp += "Manager: \n"+((Employe) e.nextElement()).askBaseInfo()+"\n\n";
	    return temp;
	}
	/**
	 * Calcule le salaire en fonction du nombre de personne � la charge du secretaire dans l'entreprise.
	 * @return retourne le salaire
	 */
	public float askSalaire() {
		return (float) (salaire+salaire*0.001*askSizeManager());
	}
	/**
	 * Renvoie la description de l'instance de Secretaire;
	 * @return retourne un string.
	 */	
	public String toString()
	{
		return (askBaseInfo()+"\nSalaire : "+askSalaire()+"\nSecretaire, Manager � charges :\n##########"+askDescriptionManager())+"\n##########";
	}
	
}
