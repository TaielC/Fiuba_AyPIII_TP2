package algocraft.materialmineral;

import algocraft.herramienta.*;
import algocraft.juego.Posicion;
import algocraft.juego.ObjetoUbicable;
import algocraft.materialherramienta.MaterialHerramienta;
import algocraft.materialinventario.MaterialInventario;

public abstract class MaterialMineral implements ObjetoUbicable{

    protected int durabilidad;
    protected Posicion posicionMaterial;

    public abstract void serGolpeado(Hacha hacha);

    public abstract void serGolpeado(Pico pico);

    public abstract void serGolpeado(PicoFino picoFino);

    public abstract boolean esDaniadoPor(MaterialHerramienta material);

    public int durabilidad() {
        return durabilidad;
    }

    @Override
    public Posicion getPosicion() {
        return this.posicionMaterial;
    }

    @Override
    public void setPosicion(Posicion posicion) {
        posicionMaterial = posicion;
    }

    public boolean seRompio(){
        return durabilidad <= 0;
    }

    public abstract MaterialInventario obtenerMaterialInventario();
}