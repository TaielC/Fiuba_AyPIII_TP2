package algocraft.herramienta;

public abstract class Durabilidad {

    protected double durabilidad;

    public abstract void desgastar();

    public double getDurabilidad(){ return durabilidad; }

    public boolean seDesgastoTotalmente() {
        return durabilidad <= 0;
    }
}
