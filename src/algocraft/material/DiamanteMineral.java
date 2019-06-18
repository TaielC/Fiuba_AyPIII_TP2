package algocraft.material;

import algocraft.herramienta.*;
import algocraft.juego.Posicion;
import algocraft.herramienta.material.MaterialHerramienta;

public class DiamanteMineral extends MaterialMineral {

	public DiamanteMineral(Posicion posicion) {
		durabilidad = 100;
		posicionMaterial = posicion;
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
