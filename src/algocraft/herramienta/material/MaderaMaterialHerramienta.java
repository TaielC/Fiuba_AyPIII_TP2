package algocraft.herramienta.material;

import algocraft.material.DiamanteMineral;
import algocraft.material.MaderaMineral;
import algocraft.material.MetalMineral;
import algocraft.material.PiedraMineral;

public class MaderaMaterialHerramienta implements MaterialHerramienta {

    @Override
    public boolean equals(MaterialHerramienta material) {
        return material instanceof MaderaMaterialHerramienta;
    }

    @Override
    public boolean daniaA(MaderaMineral maderaMineral) {
        return true;
    }

    @Override
    public boolean daniaA(PiedraMineral piedraMineral) {
        return true;
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
