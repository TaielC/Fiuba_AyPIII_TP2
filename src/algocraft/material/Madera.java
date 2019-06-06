package algocraft.material;

import algocraft.herramienta.Hacha;
import algocraft.herramienta.Pico;
import algocraft.herramienta.PicoFino;

public class Madera extends MaterialMineral implements MaterialItem {

    protected int durabilidad;

    public Madera(){
        durabilidad = 10;
    }

    @Override
    public void serGolpeado(Hacha hacha) {
        if(this.esDaniadoPor(hacha.material())) {
            durabilidad -= hacha.fuerza();
        }
    }

    @Override
    public void serGolpeado(Pico pico) {}

    public int durabilidad(){
        return durabilidad;
    }

    @Override
    public boolean esDaniadoPor(MaterialDaniable material) {
        return material.dania(this);
    }

    @Override
    public boolean dania(Madera madera) {
        return true;
    }

    @Override
    public boolean dania(Piedra piedra) {
        return true;
    }

    @Override
    public boolean dania(Metal metal) {
        return false;
    }

    @Override
    public boolean dania(MetalYPiedra metalYPiedra) {
        return false;
    }

    @Override
    public boolean dania(Diamante diamante) {
        return false;
    }

    @Override
    public MaterialDaniable getComoDaniable() {
        return this;
    }
}
