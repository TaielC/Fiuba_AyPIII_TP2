package algocraft.materialmineral;

import algocraft.herramienta.*;
import algocraft.juego.Posicion;
import algocraft.materialherramienta.MaterialHerramienta;
import algocraft.materialinventario.DiamanteMaterialInventario;
import algocraft.materialinventario.MaterialInventario;

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

	@Override
	public MaterialInventario obtenerMaterialInventario() {
		return new DiamanteMaterialInventario();
	}
}
