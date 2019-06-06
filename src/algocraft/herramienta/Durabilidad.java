package algocraft.herramienta;

public abstract class Durabilidad {

    protected double durabilidad;

    public void desgastar(){
        if(durabilidad > 0) { this._desgastar(); }
    }

    protected abstract void _desgastar();

    public double getDurabilidad(){ return durabilidad; }
}
