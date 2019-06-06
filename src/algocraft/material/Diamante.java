package algocraft.material;

import algocraft.herramienta.Hacha;
import algocraft.herramienta.Pico;
import algocraft.herramienta.PicoFino;

public class Diamante extends MaterialMineral {
	
	protected int durabilidad;
	
	public Diamante() {
		durabilidad=100;
	}
	
	public int durabilidad() {
		return durabilidad;
	}
	
	@Override
	public void serGolpeado(Hacha hacha) {}
	
	public void serGolpeado(Pico pico) {}

	@Override
	public void serGolpeado(PicoFino picoFino) {
		durabilidad-=picoFino.fuerza();
	}


	@Override
	public boolean esDaniadoPor(MaterialDaniable material) {
		return material.dania(this);
	}

	@Override
	public boolean dania(Madera madera) {
		return false;
	}

	@Override
	public boolean dania(Piedra piedra) {
		return false;
	}

	@Override
	public boolean dania(Metal metal) {
		return false;
	}

	@Override
	public boolean dania(MetalYPiedra metalYPiedra) {
		return true;
	}

	@Override
	public boolean dania(Diamante diamante) {
		return true;
	}
}
