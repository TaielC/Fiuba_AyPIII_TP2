package algocraft.herramienta.material;

import algocraft.material.*;

public class PiedraMaterialHerramienta implements MaterialHerramienta {

    @Override
    public boolean equals(MaterialHerramienta material) {
        return material instanceof PiedraMaterialHerramienta;
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
        return true;
    }

    @Override
    public boolean daniaA(DiamanteMineral diamanteMineral) {
        return false;
    }
}
