package AlgoCraft;

public abstract class Herramienta implements Item {
	
	protected Durabilidad durabilidad;
	protected int fuerza;

	public double durabilidad() {
		return durabilidad.getDurabilidad();
	}
	
	public int fuerza() {
		return fuerza;
	}
	
	public abstract void usar(Material material);

	public abstract void desgastar();

}
