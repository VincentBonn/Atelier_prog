/**
 * Classe Rectangle servant à modéliser les informations contenues dans un Rectangle
 * @author Vincent Bonnemayre
 */

package geometrie2D;

import geometrie_abstract.Geometrie2D;

public class Rectangle extends Geometrie2D
{
	private static int nombreGeometrie = 0 ;
	private static final String BASE_NAME = "Rectangle";
	private double hauteur;
	private double largeur;
	
	
	/**
	 * Constructeur de rectangle
	 * @param hauteur -- valeur de la hauteur
	 * @param largeur -- valeur de la largeur
	 */
	public Rectangle(double hauteur,double largeur)
	{
		this.hauteur = hauteur;
		this.largeur = largeur;
		identifiant =  (BASE_NAME + creerFinIdentifiant());
	}
	/**
	 * Calcule le périmètre du rectangle.
	 * @return retourne un double étant le périmètre du rectangle.
	 */
	public double calculPerimetre()
	{
		return getHauteur()*2+getLargeur()*2;
	}
	/**
	 * 
	 * Calcule la surface du rectangle.
	 * @return retourne un double étant la surface du rectangle.
	 */
	public double calculSurface()
	{
		return getHauteur()*getLargeur();
	}
	/**
	 * Accesseur de hauteur
	 * @return retourne un double étant la hauteur du rectangle.
	 */
	public double getHauteur()
	{
		return hauteur;
	}
	/**
	 * Accesseur de largeur
	 * @return retourne un double étant la largeur du rectangle.
	 */
	public double getLargeur()
	{
		return largeur;
	}
	/**
	 * Test qui compare une instance de Rectangle avec une instance d'object (override)
	 * @param obj -- object qui va être comparée.	 
	 * @return retourne true si l'object obj entré en paramètre est du même type de l'instance et que ses attributs hauteur et largeur sont identiques, sinon false.
	 */
	public boolean equals(Object obj)
    {
        boolean result = false;
        if(obj instanceof Rectangle)
        {
			result = (((Rectangle) (obj)).getHauteur() == getHauteur() &&
					  ((Rectangle) (obj)).getLargeur() == getLargeur());
        }
        return result;
    }
	/**
	 * Renvoie la description de l'instance du rectangle sous un string (override);
	 * @return retourne un string.
	 */	
	public String toString()
	{
		return ("\nLe Rectangle ayant pour hauteur: "+
	(int)getHauteur()+UNITE+
	" pour largeur: "+
	(int)getLargeur()+UNITE+
	", nommé "+
	identifiant+
	" possède :\nUn périmètre de: " +
	(int)calculPerimetre()+UNITE+
	"\nUne surface de: "+
	(int)calculSurface()+UNITE+"2");
	}
	/**
	 * Donne le numéro d'identifiant lors de la création d'une instance de Rectangle
	 * @return retourne un string contenant le numéro d'identifiant.
	 */
	private String creerFinIdentifiant()
	{
		nombreGeometrie++;
		return "_"+nombreGeometrie;
	}
}
