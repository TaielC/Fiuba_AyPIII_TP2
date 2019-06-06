package algocraft.herramienta;

import algocraft.Item;
import algocraft.material.*;

public abstract class Herramienta implements Item {

	final int DurabilidadHerramientaMadera = 100;
	final int DurabilidadHerramientaPiedra = 200;
	final int DurabilidadHerramientaMetal = 400;
	final int CantidadUsosPicoMetal = 10;
	final int DurabilidadPicoMetalYPiedra = 1000;
	final int FuerzaHerramientaMadera = 2;
	final int FuerzaHachaPiedra = 5;
	final int FuerzaPicoPiedra = 4;
	final int FuerzaHachaMetal = 10;
	final int FuerzaPicoMetal = 12;
	final int FuerzaPicoMetalYPiedra = 20;
	final double FactorDesgasteHachaMetal = 2;
	final double FactorDesgastePicoPiedra = 1.5;
	final double PorcentajeDesgastePicoMetalYPiedra = 0.1;
	
	protected Durabilidad durabilidad;
	protected int fuerza;
	protected MaterialDaniable material;

	public double durabilidad() {
		return durabilidad.getDurabilidad();
	}
	
	public int fuerza() {
		return fuerza;
	}
	
	public abstract void golpear(MaterialMineral materialMineral);

	public void usar(){
		durabilidad.desgastar();
	}

	public MaterialDaniable material(){
		return material;
	}
}
