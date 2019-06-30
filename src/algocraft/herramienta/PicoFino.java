package algocraft.herramienta;

import algocraft.herramienta.durabilidad.DurabilidadHerramientaPorcentual;
import algocraft.materialherramienta.MaterialHerramientaNulo;
import algocraft.materialmineral.*;

public class PicoFino extends Herramienta {

    public PicoFino(){
        final int DurabilidadPicoFino = 1000;
        final int FuerzaPicoFino = 20;
        final double PorcentajeDesgastePicoFino = 0.1;
        fuerza = FuerzaPicoFino;
        durabilidadHerramienta = new DurabilidadHerramientaPorcentual(DurabilidadPicoFino, PorcentajeDesgastePicoFino);
        material = new MaterialHerramientaNulo();
    }
    @Override
    public void usar(MaterialMineral materialMineral) {
        materialMineral.serGolpeado(this);
    }

    @Override
    public void golpear(MaderaMineral maderaMineral) {
        // El PicoFino no se desgasta contra MaderaMineral.
    }

    @Override
    public void golpear(PiedraMineral piedraMineral) {
        // El PicoFino no se desgasta contra PiedraMineral.
    }

    @Override
    public void golpear(MetalMineral metalMineral) {
        // El PicoFino no se desgasta contra MetalMineral.
    }
}
