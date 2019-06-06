package algocraft.herramienta;

import algocraft.material.MaterialItem;
import algocraft.material.MetalYPiedra;

public class DurabilidadPorcentual extends Durabilidad {

    private double porcentaje;

    public DurabilidadPorcentual(Pico pico, MetalYPiedra metalYPiedra) {
        durabilidad = 1000;
        porcentaje = 0.1; 
    }

    @Override
    protected void _desgastar() {
        durabilidad -= durabilidad*porcentaje;
    }
}
