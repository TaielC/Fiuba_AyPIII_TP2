package algocraft.herramienta;

import algocraft.excepciones.HerramientaRotaException;
import algocraft.herramienta.durabilidad.DurabilidadHerramientaFactorFuerza;
import algocraft.materialherramienta.MaderaMaterialHerramienta;
import algocraft.materialherramienta.MetalMaterialHerramienta;
import algocraft.materialherramienta.PiedraMaterialHerramienta;
import algocraft.materialmineral.*;

public class Hacha extends Herramienta {

	public Hacha(MaderaMaterialHerramienta madera) {
		final int DurabilidadHachaMadera = 100;
		final int FuerzaHachaMadera = 2;
		fuerza = FuerzaHachaMadera;
		durabilidadHerramienta = new DurabilidadHerramientaFactorFuerza(DurabilidadHachaMadera, FuerzaHachaMadera);
		material = madera;
	}

	public Hacha(PiedraMaterialHerramienta piedra) {
		final int DurabilidadHachaPiedra = 200;
		final int FuerzaHachaPiedra = 5;
		fuerza = FuerzaHachaPiedra;
		durabilidadHerramienta = new DurabilidadHerramientaFactorFuerza(DurabilidadHachaPiedra, FuerzaHachaPiedra);
		material = piedra;
	}

	public Hacha(MetalMaterialHerramienta metal) {
		final int DurabilidadHachaMetal = 400;
		final int FuerzaHachaMetal = 10;
		final double FactorDesgasteHachaMetal = 2;
		fuerza = FuerzaHachaMetal;
		durabilidadHerramienta = new DurabilidadHerramientaFactorFuerza(DurabilidadHachaMetal, FuerzaHachaMetal/FactorDesgasteHachaMetal);
		material = metal;
	}

	@Override
	public void usar(MaterialMineral materialMineral) {
		materialMineral.serGolpeado(this);
	}

}
