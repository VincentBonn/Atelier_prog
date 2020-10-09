package geometrie3D;

import geometrie_abstract.Geometrie3D;

public class Sphere extends Geometrie3D
{
	private static int nombreGeometrie = 0 ;
	private static final String BASE_NAME = "Sphere";
	private double rayon;
	
	
	/**
	 * Constructeur de Sphere
	 * @param rayon -- valeur du rayon
	 */
	public Sphere(double rayon)
	{
		this.rayon = rayon;
	}
	/**
	 * Calcule la surface de la sphere.
	 * @return retourne un double �tant la surface de la sphere.
	 */
	public double calculSurface()
	{
		
		return Math.pow(getRayon(), 2)*(Math.PI)*4;
	}
	/**
	 * Calcule le volume de la sphere.
	 * @return retourne un double �tant le volume de la sphere.
	 */
	protected double calculVolume()
	{
		return (Math.PI * 4 * Math.pow(getRayon(), 3))/3;
	}
	/**
	 * Accesseur de rayon
	 * @return retourne un double �tant le rayon de la sphere.
	 */
	public double getRayon()
	{
		return rayon;
	}
	/**
	 * Test qui compare une instance de Sphere avec une instance d'object (override)
	 * @param obj -- object qui va �tre compar�e.	 
	 * @return retourne true si l'object obj entr� en param�tre est du m�me type de l'instance et que son attribut rayon est identique, sinon false.
	 */
	public boolean equals(Object obj)
    {
        boolean result = false;
        if(obj instanceof Sphere)
        {
			result = ((Sphere) (obj)).getRayon() == getRayon();
        }
        return result;
    }
	/**
	 * Renvoie la description de l'instance de la sphere sous un string (override);
	 * @return retourne un string.
	 */	
	public String toString()
	{
		return ("\nLa Sphere ayant pour rayon: "+
	(int)getRayon()+UNITE+
	", nomm�e "+
	identifiant+
	" poss�de :\nUne surface de: "+
	(int)calculSurface()+UNITE+"2"+
	"\nUn volume de: "+
	(int)calculVolume()+UNITE+"3");
	}
	/**
	 * Donne l'identifiant lors de la cr�ation d'une instance de Sphere
	 * @return retourne un string contenant le num�ro d'identifiant.
	 */
	protected String getId()
	{
		nombreGeometrie++;
		return BASE_NAME+"_"+nombreGeometrie;
	}
}