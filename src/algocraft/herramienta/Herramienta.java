package algocraft.herramienta;

import algocraft.Item;
import algocraft.material.*;

public abstract class Herramienta implements Item {
	
	protected Durabilidad durabilidad;
	protected int fuerza;
	protected MaterialDaniable material;

	public double durabilidad() {
		return durabilidad.getDurabilidad();
	}
	
	public int fuerza() {
		return fuerza;
	}

	public Herramienta comoHerramienta(){
		return this;
	}

	public abstract void usar(MaterialMineral materialMineral);

	public void golpear(Madera madera){ durabilidad.desgastar(); }

	public void golpear(Piedra piedra){ durabilidad.desgastar(); }

	public void golpear(Metal metal){ durabilidad.desgastar(); }

	public void golpear(Diamante diamante){ durabilidad.desgastar(); }

	public MaterialDaniable material(){
		return material;
	}
}
