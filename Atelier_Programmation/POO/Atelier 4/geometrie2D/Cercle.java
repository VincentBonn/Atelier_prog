/**
 * Classe Cercle servant à modéliser les informations contenues dans un Cercle
 * @author Vincent Bonnemayre
 */
package geometrie2D;

import geometrie_abstract.Geometrie2D;

public class Cercle extends Geometrie2D
{
	private static int nombreGeometrie = 0 ;
	private static final String BASE_NAME = "Cercle";
	private double rayon;
	
	/**
	 * Constructeur de cercle
	 * @param demi_axe_majeur -- valeur du rayon du cercle
	 */
	
	public Cercle(double rayon)
	{
		this.rayon = rayon;
		identifiant =  (BASE_NAME + creerFinIdentifiant());
	}
	/**
	 * Calcule le périmètre du cercle.
	 * @return retourne un double étant le périmètre du cercle.
	 */
	public double calculPerimetre()
	{
		return getRayon() * Math.PI * 2;
	}
	
	/**
	 * Calcule la surface du cercle.
	 * @return retourne un double étant la surface du cercle.
	 */
	
	public double calculSurface()
	{
		return getRayon()*getRayon()*Math.PI;
	}
	
	/**
	 * Accesseur de rayon
	 * @return retourne un double étant le rayon du cercle.
	 */
	
	public double getRayon()
	{
		return rayon;
	}
	
	/**
	 * Test qui compare une instance de Cercle avec une instance d'object (override)
	 * @param obj -- object qui va être comparée.	 
	 * @return retourne true si l'object obj entré en paramètre est du même type de l'instance et que son attribut rayon est identique, sinon false.
	 */
	
	public boolean equals(Object obj)
    {
        boolean result = false;
        if(obj instanceof Cercle)
        {
			result = (((Cercle) (obj)).getRayon() == getRayon());
        }
        return result;
    }
	
	/**
	 * Renvoie la description de l'instance de Cercle sous un string (override);
	 * @return retourne un string.
	 */	
	
	public String toString()
	{
		return ("\nLe Cercle de rayon :"+
	(int)getRayon()+UNITE+
	", nommé "+
	identifiant+
	" possède :\nUn périmètre de: "+
	(int)calculPerimetre()+UNITE+
	"\nUne surface de: "+
	(int)calculSurface()+UNITE+"2");
	}
	/**
	 * Donne le numéro d'identifiant lors de la création d'une instance de Cercle
	 * @return retourne un string contenant le numéro d'identifiant.
	 */
	private String creerFinIdentifiant()
	{
		nombreGeometrie++;
		return "_"+nombreGeometrie;
	}
	
}
