package algocraft.material;

import algocraft.herramienta.*;
import algocraft.juego.Posicion;


public class Piedra extends MaterialMineral {

    public Piedra(Posicion posicion){
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
        return material.dania(this);
    }
}
