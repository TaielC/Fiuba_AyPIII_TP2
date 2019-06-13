package algocraft.herramienta;

import algocraft.material.*;

public class Pico extends Herramienta {

	public Pico(Madera madera) {
		fuerza = FuerzaHerramientaMadera;
		durabilidad = new DurabilidadFactorFuerza(DurabilidadHerramientaMadera, fuerza);
		material = madera.getComoDaniable();
	}

	public Pico(Piedra piedra) {
		fuerza = FuerzaPicoPiedra;
		durabilidad = new DurabilidadFactorFuerza(DurabilidadHerramientaPiedra, fuerza/FactorDesgastePicoPiedra);
		material = piedra.getComoDaniable();
	}

	public Pico(Metal metal) {
		fuerza = FuerzaPicoMetal;
		durabilidad = new DurabilidadPorUsos(DurabilidadHerramientaMetal, CantidadUsosPicoMetal);
		material = metal.getComoDaniable();
	}


	@Override
	public String toString(){
		return "PicoDe"+material.toString();
	}

	@Override
	public void usar(MaterialMineral materialMineral) {
		materialMineral.serGolpeado(this);
	}
}
