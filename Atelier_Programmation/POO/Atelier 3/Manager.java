/**
 * Classe Manager servant à modéliser les informations contenues dans un Manager
 * @author Vincent Bonnemayre
 */
import java.util.GregorianCalendar;

public class Manager extends Employe
{
	private Secretaire s;
	/**
	 * Constructeur de Manager
	 * @param p -- personne manager
	 * @param new_laDateEmbauche -- la date à laquelle le manager est embauché
	 * @param salaire -- salaire du manager
	 * @param s -- secretaire associé au manager
	 */
	private Manager(Personne p, GregorianCalendar new_laDateEmbauche, float salaire,Secretaire s)
	{
		super(p, new_laDateEmbauche, salaire);
		this.s = s;
		s.addManager(this);
	}
	/**
	 * Test qui vérifie si la personne entrée aura un age valide lors de son embauchement, et si un secretaire est disponible pour créer un Manager.
	 * @param p -- personne dont la date de naissance va être comparée.	 
	 * @param new_laDateEmbauche -- date d'embauche de la personne.
	 * @pram s -- secretaire dont on doit vérifier la disponibilité.
	 * @return retourne true si la personne peut être embauchée à la date ciblée, sinon false.
	 */
	public static Manager createManager(Personne p,GregorianCalendar new_laDateEmbauche, float salaire,Secretaire s)
	{
		Manager temp = null;
		if(checkLaDateEmbauche(p,new_laDateEmbauche) && s.askSizeManager()<5)
		{
			temp = new Manager(p,new_laDateEmbauche,salaire,s);
		}
		return temp;
	}
	/**
	 * Change l'actuel secretaire avec celui passé en paramètre si possible.
	 */
	public void setSecretaire(Secretaire s)
	{
		if(s.askSizeManager()<5)
		{
			this.s.removeManager(this);
			s.addManager(this);
			this.s = s;
		}
	}
	/**
	 * Calcule le salaire en fonction du temps de travail dans l'entreprise.
	 * @return retourne le salaire
	 */
	public float askSalaire()
	{
		return (float) (salaire + (salaire * calculAnnuite() * 0.05));
	}
	/**
	 * Renvoie la description de l'instance de Manager;
	 * @return retourne un string.
	 */	
	public String toString()
	{
		return (askBaseInfo()+"\nSalaire : "+askSalaire() +" année d'ancienneté : "+calculAnnuite()+"\n\nSecretaire en charge de ce manager: " + s.askBaseInfo());
	}
}
