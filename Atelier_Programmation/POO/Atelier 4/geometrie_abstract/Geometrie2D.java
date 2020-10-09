package geometrie_abstract;

public abstract class Geometrie2D extends Geometrie
{
	public abstract double calculSurface();
	public abstract double calculPerimetre();
	public abstract String toString();
	protected abstract String getId();
}