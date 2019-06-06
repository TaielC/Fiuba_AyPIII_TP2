package algocraft.herramienta;

import algocraft.material.*;

public class Pico extends Herramienta{

	public Pico(Madera madera) {
		durabilidad = new DurabilidadFactorFuerza(this, madera);
		fuerza = FuerzaHerramientaMadera;
		material = madera.getComoDaniable();
	}

	public Pico(Piedra piedra) {
		durabilidad = new DurabilidadFactorFuerza(this, piedra);
		fuerza = FuerzaPicoPiedra;
		material = piedra.getComoDaniable();
	}

	public Pico(Metal metal) {
		durabilidad = new DurabilidadPorUsos(this, metal);
		fuerza = FuerzaPicoMetal;
		material = metal.getComoDaniable();
	}

	public Pico(MetalYPiedra metalYPiedra){
		durabilidad = new DurabilidadPorcentual(this, metalYPiedra);
		fuerza = FuerzaPicoMetalYPiedra;
		material = metalYPiedra.getComoDaniable();
	}

	@Override
	public void golpear(MaterialMineral materialMineral) {
		if(material.esDaniadoPor(materialMineral)) { this.usar(); }
		materialMineral.serGolpeado(this);
	}
}
