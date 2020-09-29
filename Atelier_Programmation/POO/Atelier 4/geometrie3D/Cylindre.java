package geometrie3D;

import geometrie_abstract.Geometrie3D;

public class Cylindre extends Geometrie3D
{
	private static int nombreGeometrie = 0 ;
	private static final String BASE_NAME = "Cylindre";
	private double hauteur;
	private double rayon;
	
	
	/**
	 * Constructeur de Cylindre
	 * @param hauteur -- valeur de la hauteur
	 * @param rayon -- valeur du rayon
	 */
	public Cylindre(double hauteur,double rayon)
	{
		this.hauteur = hauteur;
		this.rayon = rayon;
		identifiant =  (BASE_NAME + creerFinIdentifiant());
	}
	/**
	 * 
	 * Calcule la surface du cylindre.
	 * @return retourne un double étant la surface du cylindre.
	 */
	public double calculSurface()
	{
		
		return (getRayon()*getRayon()*Math.PI)*2 + (getRayon()*Math.PI*2)*getHauteur() ;
	}
	/**
	 * Calcule le volume du cylindre.
	 * @return retourne un double étant le volume du cylindre.
	 */
	protected double calculVolume()
	{
		return (Math.PI * Math.pow(getRayon(), 2) * getHauteur());
	}
	/**
	 * Accesseur de hauteur
	 * @return retourne un double étant la hauteur du cylindre.
	 */
	public double getHauteur()
	{
		return hauteur;
	}
	/**
	 * Accesseur de rayon
	 * @return retourne un double étant le rayon du cylindre.
	 */
	public double getRayon()
	{
		return rayon;
	}
	/**
	 * Test qui compare une instance de Cylindre avec une instance d'object (override)
	 * @param obj -- object qui va être comparée.	 
	 * @return retourne true si l'object obj entré en paramètre est du même type de l'instance et que ses attributs hauteur et rayon sont identiques, sinon false.
	 */
	public boolean equals(Object obj)
    {
        boolean result = false;
        if(obj instanceof Cylindre)
        {
			result = (((Cylindre) (obj)).getHauteur() == getHauteur() &&
					  ((Cylindre) (obj)).getRayon() == getRayon());
        }
        return result;
    }
	/**
	 * Renvoie la description de l'instance du Cylindre sous un string (override);
	 * @return retourne un string.
	 */	
	public String toString()
	{
		return ("\nLe Cylindre ayant pour hauteur: "+
	(int)getHauteur()+
	" pour rayon: "+
	(int)getRayon()+UNITE+
	", nommé "+
	identifiant+
	" possède :\nUne surface de: "+
	(int)calculSurface()+UNITE+"2"+
	"\nUn volume de :"+
	(int)calculVolume()+UNITE+"3");
	}
	/**
	 * Donne le numéro d'identifiant lors de la création d'une instance de Cylindre
	 * @return retourne un string contenant le numéro d'identifiant.
	 */
	private String creerFinIdentifiant()
	{
		nombreGeometrie++;
		return "_"+nombreGeometrie;
	}
}