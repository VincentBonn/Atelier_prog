/**
 * Classe Employe servant �mod�liser les informations contenues dans un employe
 * @author Vincent Bonnemayre
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employe
{
	private static final int AGE_MINIMAL = 16;
	private static final int AGE_MAXIMAL = 65;
	protected Personne p;
	protected float salaire;
	protected GregorianCalendar laDateEmbauche;
	/**
	 * Constructeur de Employe
	 * @param p -- personne employ�e
	 * @param new_laDateEmbauche -- la date � laquelle l'employ� est embauch�
	 * @param salaire -- salaire de l'employ�
	 */
	protected Employe(Personne p, GregorianCalendar new_laDateEmbauche, float salaire)
	{
		this.p = p;
		this.laDateEmbauche = new_laDateEmbauche;
		this.salaire = salaire;
	}
	/**
	 * V�rifie les variables entr�es en param�tre pour savoir si elles sont valides pour la cr�ation d'un employ�.
	 * @param p -- personne employ�e
	 * @param new_laDateEmbauche -- la date � laquelle l'employ� est embauch�
	 * @param salaire -- salaire de l'employ�
	 * @return retourne un object Employe initialis� avec les valeurs entr�es en param�tre si elles sont valides, sinon un objet Employe null (non instanci�).
	 */
	public static Employe createEmploye(Personne p,GregorianCalendar new_laDateEmbauche, float salaire)
	{
		Employe temp = null;
		if(checkLaDateEmbauche(p,new_laDateEmbauche))
		{
			temp = new Employe(p,new_laDateEmbauche,salaire);
		}
		return temp;
	}
	/**
	 * Test qui v�rifie si la personne entr�e aura un age valide lors de son embauchement.
	 * @param p -- personne dont la date de naissance va �tre compar�e.	 
	 * @param new_laDateEmbauche -- date d'embauche de la personne.
	 * @return retourne true si la personne peut �tre embauch�e � la date cibl�e, sinon false.
	 */
	public static boolean checkLaDateEmbauche(Personne p, GregorianCalendar new_laDateEmbauche)
	{
		boolean result = true;
		GregorianCalendar tropvieux = (GregorianCalendar) p.getDateNaissance().clone();
		GregorianCalendar tropjeune = (GregorianCalendar) p.getDateNaissance().clone();
		tropvieux.add(GregorianCalendar.DAY_OF_MONTH,((int)(365.25 * AGE_MAXIMAL)));
		tropjeune.add(GregorianCalendar.DAY_OF_MONTH,((int)(365.25 * AGE_MINIMAL)));
		if(new_laDateEmbauche.after(tropvieux) || new_laDateEmbauche.before(tropjeune))
		{
			if(new_laDateEmbauche.before(tropjeune))
			{
				System.err.print("Probl�me d'age : Trop jeune");
			}
			else
			{
				System.err.print("Probl�me d'age : Trop vieux");
			}
			result = false;
		}
		return result;
	}
	/**
	 * Augmente le salaire d'un certains pourcentage. Une valeur n�gative ne sera pas prise en compte.
	 * @param percent -- pourcentage d'augmentation du salaire.
	 */
	public void augmenterLeSalaire(float percent)
	{
		if(percent>0)
		{
			setSalaire(getSalaire()*(1+percent/1));
		}
	}
	/**
	 * Modificateur de Salaire
	 * @param new_salaire -- nouveau salaire
	 */
	public void setSalaire(float new_salaire)
	{
		if(new_salaire>0)
		{
			salaire = new_salaire;
		}
	}
	/**
	 * Renvoie la description de l'instance de Personne sans le salaire et le statut;
	 * @return retourne un string.
	 */	
	public String askBaseInfo()
	{
		return (p.toString() +" \nDate d'embauche : "+getLaDateEmbauche().get(Calendar.YEAR) + "-" + getLaDateEmbauche().MONTH + "-" + getLaDateEmbauche().DAY_OF_MONTH );
	}
	
	/**
	 * Renvoie la description de l'instance de Employe sous un string;
	 * @return retourne un string.
	 */	
	public String toString()
	{
		return (askBaseInfo() + "\nSalaire : "+getSalaire()+"\nEmploy�");
	}
	/**
	 * Accesseur de Salaire
	 * @return retourne le salaire
	 */
	public float getSalaire() {
		return salaire;
	}
	/**
	 * Accesseur de laDateEmbauche
	 * @return retourne la date d'embauche
	 */
	public GregorianCalendar getLaDateEmbauche() {
		return laDateEmbauche;
	}
	/**
	 * Calcul le nombre d'ann�e de travail de l'employ� (arrondi au sup�rieur)
	 * @return retourne le total d'ann�e de travail
	 */
	public int calculAnnuite()
	{
		GregorianCalendar today = new GregorianCalendar();
		int diff = today.get(Calendar.YEAR) - getLaDateEmbauche().get(Calendar.YEAR) +1;
		return diff;
		
	}

}
