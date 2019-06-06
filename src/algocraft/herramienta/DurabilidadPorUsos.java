package algocraft.herramienta;

import algocraft.material.Metal;

public class DurabilidadPorUsos extends Durabilidad {

    private int usos;

    public DurabilidadPorUsos(Pico pico, Metal Metal){
        durabilidad = 400;
        usos = 10;
    }

    @Override
    protected void _desgastar() {
        usos -=1;
        if(usos == 0) durabilidad = 0;
    }
}
