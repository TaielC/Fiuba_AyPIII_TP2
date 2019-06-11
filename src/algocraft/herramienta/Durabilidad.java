package algocraft.herramienta;

import algocraft.excepciones.DurabilidadEsCeroException;

public abstract class Durabilidad {

    protected double durabilidad;

    public void desgastar() throws DurabilidadEsCeroException {
        if(durabilidad <= 0) { throw new DurabilidadEsCeroException(); }
        this._desgastar();
    }

    protected abstract void _desgastar();

    public double getDurabilidad(){ return durabilidad; }
}
