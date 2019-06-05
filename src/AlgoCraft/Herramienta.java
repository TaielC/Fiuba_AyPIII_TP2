package AlgoCraft;

public abstract class Herramienta implements Item {
	
	protected int durabilidad;
	protected int fuerza;
	
	public int durabilidad() {
		return durabilidad;
	}
	
	public int fuerza() {
		return fuerza;
	}
	
	public abstract void usar(Material material);

}
