
public class De_Pipe extends De
{
	private final int minimum_value;
	public De_Pipe(int nbr_face,String try_nom,int valeur_pipee)
	{
		super(nbr_face,try_nom);
		if(this.isValid(valeur_pipee))
		{
			minimum_value = valeur_pipee;
		}
		else
		{
			minimum_value = 0;
		}
	}
	public De_Pipe(int nbr_face,String try_nom)
	{
		this(nbr_face,try_nom,0);
	}
	public int getMinimum_Value()
	{
		return minimum_value;
	}
	public boolean equals(Object obj)
	{
		boolean resultat = false;
		if(obj instanceof De_Pipe) 
		{
			De_Pipe object_a_comparer = (De_Pipe)obj;
			resultat = (object_a_comparer.getNb_Faces() == nbfaces && object_a_comparer.getNom() == nom && object_a_comparer.getMinimum_Value() == minimum_value);
		}
		return resultat;
	}
	
	public Object lancer()
	{
		return (r.nextInt(nbfaces - minimum_value) + minimum_value);
	}
}
