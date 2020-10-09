package geometrie_abstract;

public abstract class Geometrie3D extends Geometrie{
	
	public abstract String toString();
	protected abstract double calculSurface();
	protected abstract double calculVolume();
	protected abstract String getId();
}
