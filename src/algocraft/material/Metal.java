package algocraft.material;

import algocraft.herramienta.*;

public class Metal extends MaterialMineral {

    public Metal(){
        durabilidad = 50;
    }

    @Override
    public void serGolpeado(Hacha hacha) { hacha.golpear(this); }

    @Override
    public void serGolpeado(Pico pico) {
        if(this.esDaniadoPor(pico.material())) {
            durabilidad -= pico.fuerza();
        }
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
