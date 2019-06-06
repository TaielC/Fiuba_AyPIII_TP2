package algocraft.herramienta;

import algocraft.material.*;

public class Pico extends Herramienta{

	public Pico(Madera madera) {
		durabilidad = new DurabilidadFactorFuerza(this, madera);
		fuerza = FuerzaHerramientaMadera;
		material = madera;
	}

	public Pico(Piedra piedra) {
		durabilidad = new DurabilidadFactorFuerza(this, piedra);
		fuerza = FuerzaPicoPiedra;
		material = piedra;
	}

	public Pico(Metal metal) {
		durabilidad = new DurabilidadPorUsos(this, metal);
		fuerza = FuerzaPicoMetal;
		material = metal;
	}

	public Pico(MetalYPiedra metalYPiedra){
		durabilidad = new DurabilidadPorcentual(this, metalYPiedra);
		fuerza = FuerzaPicoMetalYPiedra;
		material = metalYPiedra;
	}

	@Override
	public void golpear(MaterialMineral materialMineral) {
		MaterialDaniable materialDaniable = material.getComoDaniable();
		if(materialDaniable.esDaniadoPor(materialMineral)) { this.usar(); }
		materialMineral.serGolpeado(this);
	}
}
