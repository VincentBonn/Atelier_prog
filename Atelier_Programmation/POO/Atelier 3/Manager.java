/**
 * Classe Manager servant �mod�liser les informations contenues dans un Manager
 * @author Vincent Bonnemayre
 */
import java.util.GregorianCalendar;

public class Manager extends Employe
{
	private Secretaire s;
	/**
	 * Constructeur de Manager
	 * @param p -- personne manager
	 * @param new_laDateEmbauche -- la date � laquelle le manager est embauch�
	 * @param salaire -- salaire du manager
	 * @param s -- secretaire associ� au manager
	 */
	private Manager(Personne p, GregorianCalendar new_laDateEmbauche, float salaire,Secretaire s)
	{
		super(p, new_laDateEmbauche, salaire);
		this.s = s;
		s.addManager(this);
	}
	/**
	 * Test qui v�rifie si la personne entr�e aura un age valide lors de son embauchement, et si un secretaire est disponible pour cr�er un Manager.
	 * @param p -- personne dont la date de naissance va �tre compar�e.	 
	 * @param new_laDateEmbauche -- date d'embauche de la personne.
	 * @pram s -- secretaire dont on doit v�rifier la disponibilit�.
	 * @return retourne true si la personne peut �tre embauch�e � la date cibl�e, sinon false.
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
	 * Change l'actuel secretaire avec celui pass� en param�tre si possible.
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
		return (askBaseInfo()+"\nSalaire : "+askSalaire() +" ann�e d'anciennet� : "+calculAnnuite()+"\n\nSecretaire en charge de ce manager: " + s.askBaseInfo());
	}
}
