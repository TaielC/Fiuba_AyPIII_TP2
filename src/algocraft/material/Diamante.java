package algocraft.material;

import algocraft.herramienta.*;

public class Diamante extends MaterialMineral {

	public Diamante() {
		durabilidad=100;
	}
	
	@Override
	public String toString(){
		return "Diamante";
	}

	@Override
	public void serGolpeado(Hacha hacha) { hacha.golpear(this); }

	@Override
	public void serGolpeado(Pico pico) { pico.golpear(this); }

	@Override
	public void serGolpeado(PicoFino picoFino) {
		durabilidad -= picoFino.fuerza();
		picoFino.golpear(this);

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
	public boolean dania(Diamante diamante) {
		return true;
	}
}
