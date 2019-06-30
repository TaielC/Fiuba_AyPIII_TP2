package algocraft.herramienta;

import algocraft.materialherramienta.MaterialHerramientaNulo;
import algocraft.materialmineral.MaterialMineral;

public class HerramientaNula extends Herramienta {

    public HerramientaNula(){
        durabilidadHerramienta = null;
        fuerza = 0;
        material = new MaterialHerramientaNulo();
    }

    @Override
    public void usar(MaterialMineral materialMineral) {
        // No hace nada.
    }
}
