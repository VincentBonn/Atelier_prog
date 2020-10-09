package geometrie2D;

import geometrie_abstract.Geometrie2D;

public class Ellipse extends Geometrie2D
{
	private static int nombreGeometrie = 0 ;
	private static final String BASE_NAME = "Ellipse";
	private double demi_axe_majeur;
	private double demi_axe_mineur;
	
	/**
	 * Constructeur de ellipse
	 * @param demi_axe_majeur -- valeur du demi_axe_majeur
	 * @param demi_axe_mineur -- valeur du demi_axe_mineur
	 */
	public Ellipse(double demi_axe_mineur,double demi_axe_majeur)
	{
		this.demi_axe_mineur = demi_axe_mineur;
		this.demi_axe_majeur = demi_axe_majeur;
	}

	/**
	 * Calcule le périmètre de l'ellipse avec une marge d'erreur <0,01%.
	 * @return retourne un double étant le périmètre de l'ellipse.
	 */
	public double calculPerimetre()
	{
		double a = getDemiAxeMajeur();
		double b = getDemiAxeMineur();
		double h = Math.pow((a - b),2)/Math.pow((a + b),2);
		return Math.PI*(a + b)*(1 +  ((3*h)/(10 + Math.sqrt(4-3*h))) ) ;
	}
	/**
	 * 
	 * Calcule la surface de l'ellipse.
	 * @return retourne un double étant la surface de l'ellipse.
	 */
	public double calculSurface()
	{
		return Math.PI * getDemiAxeMajeur() * getDemiAxeMineur();
	}
	/**
	 * Accesseur de demi_axe_majeur
	 * @return retourne un double étant le demi_axe_majeur de l'ellipse.
	 */
	public double getDemiAxeMajeur()
	{
		return demi_axe_majeur;
	}
	/**
	 * Accesseur de demi_axe_mineur
	 * @return retourne un double étant le demi_axe_mineur de l'ellipse.
	 */
	public double getDemiAxeMineur()
	{
		return demi_axe_mineur;
	}
	/**
	 * Test qui compare une instance de Ellipse avec une instance d'object (override)
	 * @param obj -- object qui va être comparée.	 
	 * @return retourne true si l'object obj entré en paramètre est du même type de l'instance et que ses attributs demi_axe_majeur et demi_axe_mineur sont identiques, sinon false.
	 */
	public boolean equals(Object obj)
    {
        boolean result = false;
        if(obj instanceof Ellipse)
        {
			result = (((Ellipse) (obj)).getDemiAxeMineur() == getDemiAxeMineur() &&
					  ((Ellipse) (obj)).getDemiAxeMajeur() == getDemiAxeMajeur());
        }
        return result;
    }
	/**
	 * Renvoie la description de l'instance de l'ellipse sous un string (override);
	 * @return retourne un string.
	 */	
	public String toString()
	{
		return ("\nL'Ellipse ayant pour demi axe mineur: "+
	(int)getDemiAxeMineur()+UNITE+
	" et pour demi axe majeur: "+
	(int)getDemiAxeMajeur()+UNITE+
	", nommée "+identifiant+
	" possède :\nUn périmètre de: " +
	(int)calculPerimetre()+ UNITE+
	"\nUne surface de: "+
	(int)calculSurface() +UNITE+"2");
	}
	/**
	 * Donne l'identifiant lors de la création d'une instance de Ellipse
	 * @return retourne un string contenant le numéro d'identifiant.
	 */
	protected String getId()
	{
		nombreGeometrie++;
		return BASE_NAME+"_"+nombreGeometrie;
	}
	
}
