package algocraft;

import algocraft.herramienta.Herramienta;

public class ItemVacio implements Item {

    @Override
    public String toString() {
        return "Vacio";
    }

    @Override
    public Herramienta comoHerramienta() {
        return null;
    }
}
