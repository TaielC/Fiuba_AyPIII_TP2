package AlgoCraft;

public abstract class Herramienta implements Item {
	
	int duracion;
	int fuerza;
	
	public int durabilidad() {
		return duracion;
	}
	
	public int fuerza() {
		return fuerza;
	}
	
	public abstract void usar(Material material);

}
