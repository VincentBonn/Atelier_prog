package geometrie_abstract;

public abstract class Geometrie
{
	public final String identifiant = getId();
	public static final String UNITE ="cm";
	
	/**
	 * Incrémente le compteur du nombre de géometries existantes puis envoie la fin de l'identifiant.
	 * @return retourne un string étant la fin de l'identifiant de forme "_n" avec n numéro de la géometrie
	 */

	protected abstract double calculSurface();
	protected abstract String getId();
	protected abstract double calculVolume();
	public abstract String toString();
	
	public static boolean plusGrandeSurfaceQue(Object obj1, Object obj2)
	{
		boolean result = false;
		if(obj1 instanceof Geometrie && obj2 instanceof Geometrie)
		{
			result =  (((Geometrie)(obj1)).calculSurface() > ((Geometrie)(obj2)).calculSurface());
		}
		return result;
	}
	public static boolean plusGrandVolumeQue(Object obj1, Object obj2)
	{
		boolean result = false;
		if(obj1 instanceof Geometrie && obj2 instanceof Geometrie)
		{
			result =  (((Geometrie)(obj1)).calculVolume() > ((Geometrie)(obj2)).calculVolume());
		}
		return result;
	}
}
