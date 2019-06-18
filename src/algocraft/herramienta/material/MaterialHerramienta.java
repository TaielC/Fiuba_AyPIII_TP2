package algocraft.herramienta.material;

import algocraft.material.DiamanteMineral;
import algocraft.material.MaderaMineral;
import algocraft.material.MetalMineral;
import algocraft.material.Piedra;

public interface MaterialHerramienta {

    boolean equals(MaterialHerramienta material);

    boolean daniaA(MaderaMineral maderaMineral);
    boolean daniaA(Piedra piedra);
    boolean daniaA(MetalMineral metalMineral);
    boolean daniaA(DiamanteMineral diamanteMineral);
}
