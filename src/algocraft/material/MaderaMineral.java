package algocraft.material;

import algocraft.herramienta.*;
import algocraft.herramienta.material.MaterialHerramienta;

public class MaderaMineral extends MaterialMineral  {

    public MaderaMineral(){
        durabilidad = 10;
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
        return material.daniaA(this);
    }
}
