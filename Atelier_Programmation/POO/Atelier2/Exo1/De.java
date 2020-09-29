import java.util.*;
public class De {
	
	protected final static int NBR_FACE_MIN = 3;
	protected final static int NBR_FACE_MAX = 120;
	protected final static int NBR_FACE_DEFAULT = 6;
	protected static Random r = new Random();
	protected int nbfaces;
	protected String nom;
	private static int total_de = 0;
	
	public De()
	{
		this(NBR_FACE_DEFAULT,"De"+total_de);
	}

	public De(int nbr_face)
	{
		this(nbr_face,"De"+total_de);
	}
	
	public De(int nbr_face,String try_nom)
	{
		total_de++;
		if(try_nom == null || try_nom.isEmpty())
		{
			nom = "De"+total_de;
		}
		else
		{
			nom = try_nom;
		}
		if (NBR_FACE_MIN <= nbr_face && nbr_face <= NBR_FACE_MAX)
		{
			setNb_Faces(nbr_face);
		}
		else
		{
			System.err.print("Erreur, nombre de face invalide");
		}
	}
	
	public int getNb_Faces()
	{
		return nbfaces;
	}
	
	public void setNb_Faces(int nbfaces)
	{
		this.nbfaces = nbfaces;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public Object lancer()
	{
		return (int)r.nextInt(nbfaces+1);
		//return (int)(Math.random() * (nbfaces+1));
	}
	
	public int lancer(int nbr_lancer)
	{
		int meilleur_lancer = 0;
		int nouvelle_valeur;
		for (int i=0 ; i<nbr_lancer ; i++)
		{
			nouvelle_valeur = (int) lancer();
		    if(nouvelle_valeur>meilleur_lancer)
		    {
		    	meilleur_lancer = nouvelle_valeur;
		    }
		}
		return meilleur_lancer;
	}
	
	public static int getTotal_de()
	{
		return total_de;
	}
	
	public String toString()
	{
		return ("Nom: "+getNom()+", Nombre faces: "+getNb_Faces());
		
	}
	
	public boolean equals(Object obj)
	{
		boolean resultat = false;
		if(obj instanceof De) 
		{
			De object_a_comparer = (De)obj;
			resultat = (object_a_comparer.getNb_Faces() == nbfaces && object_a_comparer.getNom() == nom);
		}
		return resultat;
	}
	
	public boolean isValid(int valeur)
	{
		return(valeur<this.getNb_Faces() && valeur >0);
	}
}
