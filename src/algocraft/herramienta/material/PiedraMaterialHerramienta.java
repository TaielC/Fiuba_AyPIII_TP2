package algocraft.herramienta.material;

import algocraft.material.DiamanteMineral;
import algocraft.material.MaderaMineral;
import algocraft.material.MetalMineral;
import algocraft.material.Piedra;

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
    public boolean daniaA(Piedra piedra) {
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
