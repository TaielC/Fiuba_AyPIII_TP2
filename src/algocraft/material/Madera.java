package algocraft.material;

import algocraft.herramienta.*;
import algocraft.juego.Posicion;

public class Madera extends MaterialMineral  {

    public Madera(Posicion posicion){
        durabilidad = 10;
        posicionMaterial = posicion;
    }

    @Override
    public void serGolpeado(Hacha hacha) {
        durabilidad -= hacha.fuerza();
        hacha.golpear(this);
    }

    @Override
    public void serGolpeado(Pico pico) { pico.golpear(this); }

    @Override
    public void serGolpeado(PicoFino picoFino) { picoFino.golpear(this); }

    @Override
    public boolean esDaniadoPor(MaterialHerramienta material) {
        return material.dania(this);
    }

}
