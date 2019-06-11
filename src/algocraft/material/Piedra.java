package algocraft.material;

import algocraft.herramienta.*;

public class Piedra extends MaterialMineral implements MaterialItem{

    public Piedra(){ durabilidad = 30; }

    @Override
    public String toString(){
        return "Piedra";
    }

    @Override
    public void serGolpeado(Hacha hacha) {}

    @Override
    public void serGolpeado(Pico pico) {
        if(this.esDaniadoPor(pico.material())) {
            durabilidad -= pico.fuerza();
        }
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
