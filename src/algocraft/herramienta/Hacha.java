package algocraft.herramienta;

import algocraft.material.*;

public class Hacha extends Herramienta {

	public static Herramienta crear(Madera madera){
		return new Hacha(madera);
	}

	public Hacha(Madera madera) {
		final int DurabilidadHachaMadera = 100;
		final int FuerzaHachaMadera = 2;
		fuerza = FuerzaHachaMadera;
		durabilidad = new DurabilidadFactorFuerza(DurabilidadHachaMadera, FuerzaHachaMadera);
		material = madera;
	}

	public Hacha(Piedra piedra) {
		final int DurabilidadHachaPiedra = 200;
		final int FuerzaHachaPiedra = 5;
		fuerza = FuerzaHachaPiedra;
		durabilidad = new DurabilidadFactorFuerza(DurabilidadHachaPiedra, FuerzaHachaPiedra);
		material = piedra;
	}

	public Hacha(Metal metal) {
		final int DurabilidadHachaMetal = 400;
		final int FuerzaHachaMetal = 10;
		final double FactorDesgasteHachaMetal = 2;
		fuerza = FuerzaHachaMetal;
		durabilidad = new DurabilidadFactorFuerza(DurabilidadHachaMetal, FuerzaHachaMetal/FactorDesgasteHachaMetal);
		material = metal;
	}

	@Override
	public String toString(){
		return "HachaDe"+material.toString();
	}

	@Override
	public void usar(MaterialMineral materialMineral) {
		materialMineral.serGolpeado(this);
	}

}
