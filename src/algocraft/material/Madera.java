package algocraft.material;

import algocraft.herramienta.*;

public class Madera extends MaterialMineral implements MaterialItem {

    public Madera(){
        durabilidad = 10;
    }

    public static Madera crear() {
        return new Madera();
    }

    @Override
    public String toString(){
        return "Madera";
    }

    public Herramienta comoHerramienta() {
        return null;
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
    public boolean dania(Diamante diamante) {
        return false;
    }

    @Override
    public MaterialDaniable getComoDaniable() {
        return this;
    }

    @Override
    public int obtenerPosicionHorizontal() {
        return 0;
    }

    @Override
    public int obtenerPosicionVertical() {
        return 0;
    }
}
