package algocraft.herramienta;

import algocraft.material.*;

public class Hacha extends Herramienta{

	public Hacha(Madera madera) {
		fuerza = FuerzaHerramientaMadera;
		durabilidad = new DurabilidadFactorFuerza(DurabilidadHerramientaMadera, fuerza);
		material = madera;
	}

	public Hacha(Piedra piedra) {
		fuerza = FuerzaHachaPiedra;
		durabilidad = new DurabilidadFactorFuerza(DurabilidadHerramientaPiedra, fuerza);
		material = piedra;
	}

	public Hacha(Metal metal) {
		fuerza = FuerzaHachaMetal;
		durabilidad = new DurabilidadFactorFuerza(DurabilidadHerramientaMetal, fuerza/FactorDesgasteHachaMetal);
		material = metal;
	}

	@Override
	public void golpear(MaterialMineral materialMineral) {
		this.usar();
		materialMineral.serGolpeado(this);
	}
}
