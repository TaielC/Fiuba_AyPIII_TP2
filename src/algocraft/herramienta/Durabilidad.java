package algocraft.herramienta;

import algocraft.excepciones.ExcepcionDurabilidadEsCero;

public abstract class Durabilidad {

    protected double durabilidad;

    public void desgastar() throws ExcepcionDurabilidadEsCero {
        if(durabilidad <= 0) { throw new ExcepcionDurabilidadEsCero(); }
        this._desgastar();
    }

    protected abstract void _desgastar();

    public double getDurabilidad(){ return durabilidad; }
}
