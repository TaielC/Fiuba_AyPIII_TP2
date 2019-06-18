package algocraft.herramienta.material;

import algocraft.material.*;

public interface MaterialHerramienta {

    boolean equals(MaterialHerramienta material);

    boolean daniaA(MaderaMineral madera);
    boolean daniaA(PiedraMineral piedra);
    boolean daniaA(MetalMineral metal);
    boolean daniaA(DiamanteMineral diamante);
}
