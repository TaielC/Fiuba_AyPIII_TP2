package algocraft.herramienta;

import algocraft.herramienta.durabilidad.DurabilidadHerramienta;
import algocraft.material.*;

public abstract class Herramienta {
	
	protected DurabilidadHerramienta durabilidadHerramienta;
	protected int fuerza;
	protected MaterialHerramienta material;

	public abstract void usar(MaterialMineral materialMineral);

	public void golpear(Madera madera){	durabilidadHerramienta.desgastar(); }

	public void golpear(Piedra piedra){ durabilidadHerramienta.desgastar(); }

	public void golpear(Metal metal){ durabilidadHerramienta.desgastar(); }

	public void golpear(Diamante diamante){ durabilidadHerramienta.desgastar(); }

	// GETTERS
	public double durabilidad() { return durabilidadHerramienta.getDurabilidad(); }

	public int fuerza() {
		return fuerza;
	}

	public MaterialHerramienta material(){
		return material;
	}
}
