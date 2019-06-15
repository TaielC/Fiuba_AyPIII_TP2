package algocraft.herramienta;

import algocraft.excepciones.HerramientaRotaException;
import algocraft.herramienta.durabilidad.DurabilidadHerramientaFactorFuerza;
import algocraft.herramienta.durabilidad.DurabilidadHerramientaPorUsos;
import algocraft.material.*;

public class Pico extends Herramienta {

	public Pico(MaderaMaterialHerramienta madera) {
		final int DurabilidadPicoMadera = 100;
		final int FuerzaPicoMadera = 2;
		fuerza = FuerzaPicoMadera;
		durabilidadHerramienta = new DurabilidadHerramientaFactorFuerza(DurabilidadPicoMadera, FuerzaPicoMadera);
		material = madera;
	}

	public Pico(PiedraMaterialHerramienta piedra) {
		final int DurabilidadPicoPiedra = 200;
		final int FuerzaPicoPiedra = 4;
		final double FactorDesgastePicoPiedra = 1.5;
		fuerza = FuerzaPicoPiedra;
		durabilidadHerramienta = new DurabilidadHerramientaFactorFuerza(DurabilidadPicoPiedra, FuerzaPicoPiedra/FactorDesgastePicoPiedra);
		material = piedra;
	}

	public Pico(MetalMaterialHerramienta metal) {
		final int DurabilidadPicoMetal = 400;
		final int CantidadUsosPicoMetal = 10;
		final int FuerzaPicoMetal = 12;
		fuerza = FuerzaPicoMetal;
		durabilidadHerramienta = new DurabilidadHerramientaPorUsos(DurabilidadPicoMetal, CantidadUsosPicoMetal);
		material = metal;
	}

	@Override
	public void usar(MaterialMineral materialMineral) {
		if(durabilidadHerramienta.seDesgasto())
			throw new HerramientaRotaException();
		materialMineral.serGolpeado(this);
	}
}
