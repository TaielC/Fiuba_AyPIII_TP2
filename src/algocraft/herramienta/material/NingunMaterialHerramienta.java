package algocraft.herramienta.material;

import algocraft.material.DiamanteMineral;
import algocraft.material.MaderaMineral;
import algocraft.material.MetalMineral;
import algocraft.material.PiedraMineral;

public class NingunMaterialHerramienta implements MaterialHerramienta {

    @Override
    public boolean equals(MaterialHerramienta material) {
        return material instanceof NingunMaterialHerramienta;
    }

    @Override
    public boolean daniaA(MaderaMineral maderaMineral) {
        return false;
    }

    @Override
    public boolean daniaA(PiedraMineral piedraMineral) {
        return false;
    }

    @Override
    public boolean daniaA(MetalMineral metalMineral) {
        return false;
    }

    @Override
    public boolean daniaA(DiamanteMineral diamanteMineral) {
        return false;
    }
}
