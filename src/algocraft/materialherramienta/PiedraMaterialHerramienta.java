package algocraft.materialherramienta;

import algocraft.materialmineral.*;

public class PiedraMaterialHerramienta implements MaterialHerramienta {

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
