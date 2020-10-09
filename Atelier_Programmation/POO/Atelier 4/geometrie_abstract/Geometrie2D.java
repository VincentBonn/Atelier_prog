package geometrie_abstract;

public abstract class Geometrie2D extends Geometrie
{
	public abstract double calculSurface();
	public abstract double calculPerimetre();
	public abstract String toString();
	
	protected abstract String getId();
	/**
	 * Renvoie le volume d'un objet 2D = 0
	 * @return retourne un double qui est le volume de l'objet 2D
	 */	
	protected double calculVolume()
	{
		return 0;
	}
}