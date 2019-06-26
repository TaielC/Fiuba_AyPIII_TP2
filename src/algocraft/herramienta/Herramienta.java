package algocraft.herramienta;

import algocraft.excepciones.HerramientaRotaException;
import algocraft.herramienta.durabilidad.DurabilidadHerramienta;
import algocraft.materialherramienta.MaterialHerramienta;
import algocraft.materialmineral.*;

public abstract class Herramienta {
	
	protected DurabilidadHerramienta durabilidadHerramienta;
	protected int fuerza;
	protected MaterialHerramienta material;

	public abstract void usar(MaterialMineral materialMineral);

	public void golpear(MaderaMineral maderaMineral){
		durabilidadHerramienta.desgastar();
		if(durabilidadHerramienta.seDesgasto())
			throw new HerramientaRotaException();
	}

	public void golpear(PiedraMineral piedraMineral){
		durabilidadHerramienta.desgastar();
		if(durabilidadHerramienta.seDesgasto())
			throw new HerramientaRotaException();
	}

	public void golpear(MetalMineral metalMineral){
		durabilidadHerramienta.desgastar();
		if(durabilidadHerramienta.seDesgasto())
			throw new HerramientaRotaException();
	}

	public void golpear(DiamanteMineral diamanteMineral){
		durabilidadHerramienta.desgastar();
		if(durabilidadHerramienta.seDesgasto())
			throw new HerramientaRotaException();
	}

	// GETTERS
	public double durabilidad() { return durabilidadHerramienta.getDurabilidad(); }

	public int fuerza() {
		return fuerza;
	}

	public MaterialHerramienta material(){
		return material;
	}
}
