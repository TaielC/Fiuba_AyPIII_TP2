package algocraft.herramienta;

import algocraft.excepciones.HerramientaRotaException;
import algocraft.material.*;

public class Pico extends Herramienta {

	public Pico(MaderaMaterialHerramienta madera) {
		final int DurabilidadPicoMadera = 100;
		final int FuerzaPicoMadera = 2;
		fuerza = FuerzaPicoMadera;
		durabilidad = new DurabilidadFactorFuerza(DurabilidadPicoMadera, FuerzaPicoMadera);
		material = madera;
	}

	public Pico(PiedraMaterialHerramienta piedra) {
		final int DurabilidadPicoPiedra = 200;
		final int FuerzaPicoPiedra = 4;
		final double FactorDesgastePicoPiedra = 1.5;
		fuerza = FuerzaPicoPiedra;
		durabilidad = new DurabilidadFactorFuerza(DurabilidadPicoPiedra, FuerzaPicoPiedra/FactorDesgastePicoPiedra);
		material = piedra;
	}

	public Pico(MetalMaterialHerramienta metal) {
		final int DurabilidadPicoMetal = 400;
		final int CantidadUsosPicoMetal = 10;
		final int FuerzaPicoMetal = 12;
		fuerza = FuerzaPicoMetal;
		durabilidad = new DurabilidadPorUsos(DurabilidadPicoMetal, CantidadUsosPicoMetal);
		material = metal;
	}


	@Override
	public String toString(){
		return "PicoDe"+material.toString();
	}

	@Override
	public void usar(MaterialMineral materialMineral) {
		if(durabilidad.seDesgastoTotalmente())
			throw new HerramientaRotaException();
		materialMineral.serGolpeado(this);
	}
}
