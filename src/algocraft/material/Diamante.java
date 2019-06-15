package algocraft.material;

import algocraft.herramienta.*;

public class Diamante extends MaterialMineral {

	public Diamante() {
		durabilidad=100;
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
	public boolean esDaniadoPor(MaterialHerramienta material) {
		return material.daniaA(this);
	}
}
