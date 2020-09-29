
/**
 * Classe Personne servant à modéliser les informations contenues dans une personne
 * @author nivet_m and Vincent Bonnemayre
 *
 */
import java.util.*;


public class Personne
{
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private Adresse adresse = ADRESSE_INCONNUE;
    private static int totalPersonne = 0;
    
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse)
	{
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		totalPersonne ++;
	}
	/** 
	 * Constructeur de Personne
	 * @param leNom -- le nom de la personne
	 * @param lePrenom -- le prénom de la personne
	 * @param j -- le jour de naissance
	 * @param m -- le mois de naissance
	 * @param a -- l'année de naissance
	 * @param numero -- le n° de la rue
	 * @param rue -- la rue
	 * @param code_postal -- le code postal de l'adresse
	 * @param ville -- la ville ou la personne habite
	 */ 
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville)
	{
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}
	
	/**
     * Accesseur de nom
	 * @return retourne le nom
	 */
	public String getNom()
	{
		return nom;
	}
	/**
	 * Accesseur de prenom
	 * @return retourne le prenom
	 */
	public String getPrenom()
	{
		return prenom;
	}
	/**
	 * Accesseur de dateNaissance
	 * @return retourne la date de naissance
	 */
	public GregorianCalendar getDateNaissance()
	{
		return dateNaissance;
	}
	/**
	 * Accesseur de adresse
	 * @return retourne l'adresse
	 */
	public Adresse getAdresse()
	{
		return adresse;
	}
	/**
	 * Modificateur de adresse
	 * @param adresse -- nouvelle adresse 	 
	 */
	public void setAdresse(Adresse a)
	{
		adresse=a;
	}
	/**
	 * Test qui compare l'age entre deux personnes
	 * @param personne -- personne dont la date de naissance va être comparée.	 
	 * @return retourne true si la date entrée en paramètre est avant celle de la date de naissance de l'instance, sinon false.
	 */
	public boolean plusAgee(Personne p)
	{
		return dateNaissance.after(p.getDateNaissance());
	}
	/**
	 * Test qui compare l'age entre deux personnes
	 * @param personne1 -- personne 1 dont la date de naissance va être comparée.	 
	 * @param personne2 -- personne 2 dont la date de naissance va être comparée.
	 * @return retourne true si la date de naiisance de la personne en paramètre est avant celle de la date
	 *  de naissance de la personne de l'instance, sinon false.
	 */
	public static boolean plusAgeQue(Personne p1,Personne p2)
	{
		return p1.getDateNaissance().after(p2.getDateNaissance());
	}
	/**
	 * Accesseur de totalPersonne
	 * @return retourne le total de personne existantes
	 */
	public int getTotalPersonne()
	{
		return totalPersonne;
	}
	/**
	 * Test qui compare une instance de Personne avec une instance d'object (override)
	 * @param obj -- object qui va être comparée.	 
	 * @return retourne true si l'object obj entré en paramètre est du même type de l'instance et que ses attributs nom, prenom et dateNaissance sont identiques, sinon false.
	 */	
	public boolean equals(Object obj)
    {
        boolean result = false;
        if(obj instanceof Personne)
        {
			result = (((Personne) (obj)).getNom().equals(nom) &&
					  ((Personne) (obj)).getPrenom().equals(prenom) &&
					  ((Personne) (obj)).getDateNaissance().equals(dateNaissance));
        }
        return result;
    }
	/**
	 * Renvoie la description de l'instance de Personne sous un string;
	 * @return retourne un string.
	 */	
	public String toString()
	{
		String result="\nNom : "+nom+"\n"
		+"Prénom : "+prenom+"\n"+
		"Adresse : "+
		adresse.toString()+
		"\nNé(e) le : "+
		dateNaissance.get(Calendar.YEAR)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.DAY_OF_MONTH);

		return result;
	}
}

    
   
   