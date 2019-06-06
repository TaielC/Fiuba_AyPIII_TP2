package algocraft.herramienta;

import algocraft.material.*;

public class PicoFino extends Herramienta {
/*

    public PicoFino(){
        durabilidad = new DurabilidadPorcentual(this);
        fuerza = 20;
    }
*/

    @Override
    public void golpear(MaterialMineral materialMineral) {
        materialMineral.serGolpeado(this);

    }

}
