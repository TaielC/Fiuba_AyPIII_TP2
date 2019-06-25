package algocraft.materialmineral;

import algocraft.herramienta.Hacha;
import algocraft.herramienta.Pico;
import algocraft.herramienta.PicoFino;
import algocraft.juego.ObjetoUbicable;
import algocraft.juego.Posicion;
import algocraft.materialherramienta.MaterialHerramienta;

public class NingunMaterialMineral extends MaterialMineral {

    @Override
    public void serGolpeado(Hacha hacha) {
        // No ocurre nada.
    }

    @Override
    public void serGolpeado(Pico pico) {
        // No ocurre nada.
    }

    @Override
    public void serGolpeado(PicoFino picoFino) {
        // No ocurre nada.
    }

    @Override
    public boolean esDaniadoPor(MaterialHerramienta material) {
        return false;
    }

    @Override
    public void setPosicion(Posicion posicion) {
        this.posicionMaterial = posicion;
    }
}
