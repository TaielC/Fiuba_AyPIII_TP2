package algocraft.material;

import algocraft.herramienta.*;
import algocraft.herramienta.material.MaterialHerramienta;

public class Piedra extends MaterialMineral {

    public Piedra(){ durabilidad = 30; }

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
}
