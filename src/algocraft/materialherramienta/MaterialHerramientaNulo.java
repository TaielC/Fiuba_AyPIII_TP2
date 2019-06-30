package algocraft.materialherramienta;

import algocraft.materialmineral.DiamanteMineral;
import algocraft.materialmineral.MaderaMineral;
import algocraft.materialmineral.MetalMineral;
import algocraft.materialmineral.PiedraMineral;

public class MaterialHerramientaNulo implements MaterialHerramienta {

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
