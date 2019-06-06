package algocraft.herramienta;

import algocraft.material.*;

public class Hacha extends Herramienta{

	private MaterialItem material;

	public Hacha(Madera madera) {
		durabilidad = new DurabilidadFactorFuerza(this, madera);
		fuerza = FuerzaHerramientaMadera;
		material = madera;
	}

	public Hacha(Piedra piedra) {
		durabilidad = new DurabilidadFactorFuerza(this, piedra);
		fuerza = FuerzaHachaPiedra;
		material = piedra;
	}

	public Hacha(Metal metal) {
		durabilidad = new DurabilidadFactorFuerza(this, metal);
		fuerza = FuerzaHachaMetal;
		material = metal;
	}

	@Override
	public void golpear(MaterialMineral materialMineral) {
		this.usar();
		materialMineral.serGolpeado(this);
	}
}
