package algocraft.material;

import algocraft.herramienta.*;
import algocraft.juego.Posicion;
import algocraft.herramienta.material.MaterialHerramienta;

public class PiedraMineral extends MaterialMineral {

    public PiedraMineral(Posicion posicion){
        durabilidad = 30;
        posicionMaterial = posicion;
    }

    @Override
    public void serGolpeado(Hacha hacha) { hacha.golpear(this); }

    @Override
    public void serGolpeado(Pico pico) {
        durabilidad -= pico.fuerza();
        pico.golpear(this);
    }

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
    public String getString() {
        return "Piedra";
    }
}
