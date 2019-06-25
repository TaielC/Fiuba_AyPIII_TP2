package algocraft.herramienta;

import algocraft.materialherramienta.NingunMaterialHerramienta;
import algocraft.materialmineral.MaterialMineral;

public class NingunaHerramienta extends Herramienta {

    public NingunaHerramienta(){
        durabilidadHerramienta = null;
        fuerza = 0;
        material = new NingunMaterialHerramienta();
    }

    @Override
    public void usar(MaterialMineral materialMineral) {
        // No hace nada.
    }
}
