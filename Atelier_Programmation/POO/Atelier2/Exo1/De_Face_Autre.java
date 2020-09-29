import java.util.ArrayList;

public class De_Face_Autre extends De
{
	private ArrayList<Object> face_list;
	private int longueur_liste_ini;
	public De_Face_Autre(String try_nom, ArrayList<Object> try_liste_choix)
	{
		super(try_liste_choix.size(),try_nom);
		face_list = new ArrayList<Object>();
		longueur_liste_ini = try_liste_choix.size()-1;
		if(isValid(longueur_liste_ini))
		{
			for (int i=0;i<=longueur_liste_ini;i++)
			{
				face_list.add(try_liste_choix.get(i));
			} 
		}
	}
	public Object lancer()
	{	
		return face_list.get(r.nextInt(face_list.size()));
	}
}
