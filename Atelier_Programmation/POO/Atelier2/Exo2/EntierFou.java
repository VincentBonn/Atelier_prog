/**
 * Classe EntierFou servant à modéliser les informations contenues dans un EntierFou
 * @author Vincent Bonnemayre
 */
import java.util.Random;

public class EntierFou extends Entier
{
	private static Random r = new Random();
	private int niveau_folie;
	public EntierFou(int try_borne_basse,int try_borne_haute,int folie)
	{
		super(DEFAULT_VALUE,try_borne_basse, try_borne_haute);
		niveau_folie = folie;
	}
	
	public int getNiveauFolie()
	{
		return niveau_folie;
	}
	
	public void tryIncrement()
	{
		setValeur(getValeur() + r.nextInt(niveau_folie + 1));
	}
	
	public String toString()
	{
		return ("Valeur = "+getValeur()+" Borne basse = "+getBorneBasse()+" Borne haute = "+ getBorneHaute()+" Niveau Folie = "+ getNiveauFolie());
	}
	
	public boolean equals(Object obj)
	{
		boolean resultat = false;
		if(obj instanceof EntierFou) 
		{
			EntierFou object_a_comparer = (EntierFou)obj;
			resultat = (object_a_comparer.getNiveauFolie() == niveau_folie &&  object_a_comparer.getValeur() == valeur && object_a_comparer.getBorneBasse() == borne_basse && object_a_comparer.getBorneHaute() == borne_haute);
		}
		return resultat;
	}
}
