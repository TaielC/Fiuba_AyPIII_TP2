package algocraft.materialmineral;

import algocraft.herramienta.*;
import algocraft.juego.Posicion;
import algocraft.materialherramienta.MaterialHerramienta;

public class MetalMineral extends MaterialMineral {

    public MetalMineral(Posicion posicion){
        durabilidad = 50;
        posicionMaterial = posicion;
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
        return material.daniaA(this);
    }


    @Override
    public String getString() {
        return "Metal";
    }
}
