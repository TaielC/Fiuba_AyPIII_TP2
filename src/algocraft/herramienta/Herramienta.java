package algocraft.herramienta;

import algocraft.herramienta.durabilidad.DurabilidadHerramienta;
import algocraft.herramienta.material.MaterialHerramienta;
import algocraft.material.*;

public abstract class Herramienta {
	
	protected DurabilidadHerramienta durabilidadHerramienta;
	protected int fuerza;
	protected MaterialHerramienta material;

	public abstract void usar(MaterialMineral materialMineral);

	public void golpear(MaderaMineral maderaMineral){	durabilidadHerramienta.desgastar(); }

	public void golpear(Piedra piedra){ durabilidadHerramienta.desgastar(); }

	public void golpear(MetalMineral metalMineral){ durabilidadHerramienta.desgastar(); }

	public void golpear(DiamanteMineral diamanteMineral){ durabilidadHerramienta.desgastar(); }

	// GETTERS
	public double durabilidad() { return durabilidadHerramienta.getDurabilidad(); }

	public int fuerza() {
		return fuerza;
	}

	public MaterialHerramienta material(){
		return material;
	}
}
