package algocraft.material;

import algocraft.herramienta.Hacha;
import algocraft.herramienta.Pico;
import algocraft.herramienta.PicoFino;

public class Piedra extends MaterialMineral implements MaterialItem{

    private int durabilidad;

    @Override
    public void serGolpeado(Hacha hacha) {}

    @Override
    public void serGolpeado(Pico pico) {
        if(this.esDaniadoPor(pico.material())) {
            durabilidad -= pico.fuerza();
        }
    }

    @Override
    public int durabilidad() {
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
        return true;
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
