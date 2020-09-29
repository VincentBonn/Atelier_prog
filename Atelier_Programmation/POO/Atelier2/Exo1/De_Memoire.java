
public class De_Memoire extends De
{
	private int precedente_valeur = -1;
	public De_Memoire()
	{
		this(NBR_FACE_DEFAULT,("De"+getTotal_de()));
	}
	public De_Memoire(int nbr_face)
	{
		this(nbr_face,("De"+getTotal_de()));
	}
	public De_Memoire(int nbr_face,String try_nom)
	{
		super(nbr_face,try_nom);
	}
	
	public Object lancer()
	{
		int result = r.nextInt(nbfaces);
		while (result == precedente_valeur)
		{
			result = r.nextInt(nbfaces);
		}
		precedente_valeur = result;
		return result;
	}
}
