/**
 * Classe Entier servant à modéliser les informations contenues dans un Entier
 * @author Vincent Bonnemayre
 */
public class Entier
{
	protected int valeur = 0;
	protected final int borne_haute;
	protected final int borne_basse;
	protected static final int DEFAULT_VALUE = 0;
	
	public Entier(int try_borne_basse,int try_borne_haute)
	{
		this(DEFAULT_VALUE,try_borne_basse,try_borne_haute);
	}
	
	public Entier(int try_valeur,int try_borne_basse,int try_borne_haute)
	{
		if(try_borne_basse < try_borne_haute)
		{
			borne_haute = try_borne_haute;
			borne_basse = try_borne_basse;
		}
		else
		{
			borne_haute = try_borne_basse;
			borne_basse = try_borne_haute;
		}
		setValeur(try_valeur);
	}
	
	public void setValeur(int new_valeur)
	{
		if(isValid(new_valeur))
		{
			valeur = new_valeur;
		}
	}
	
	public int getValeur()
	{
		return valeur;
	}
	
	public void tryIncrement()
	{
		setValeur(getValeur()+1);
	}
	
	public void tryIncrement(int n)
	{
		setValeur(getValeur()+n);
	}
	
	public boolean isValid(int try_valeur)
	{
		return (try_valeur <= borne_haute && try_valeur >= borne_basse);
	}
	
	public int getBorneHaute()
	{
		return borne_haute;
	}
	
	public int getBorneBasse()
	{
		return borne_basse;
	}
	
	public String toString()
	{
		return ("Valeur = "+getValeur()+" Borne basse = "+getBorneBasse()+" Borne haute = "+ getBorneHaute());
	}
	
	public boolean equals(Object obj)
	{
		boolean resultat = false;
		if(obj instanceof Entier) 
		{
			Entier object_a_comparer = (Entier)obj;
			resultat = (object_a_comparer.getValeur() == valeur && object_a_comparer.getBorneBasse() == borne_basse && object_a_comparer.getBorneHaute() == borne_haute);
		}
		return resultat;
	}
}
