package algocraft.herramienta;

import algocraft.material.*;

public class PicoFino extends Herramienta {

    public PicoFino(){
        final int DurabilidadPicoFino = 1000;
        final int FuerzaPicoFino = 20;
        final double PorcentajeDesgastePicoFino = 0.1;
        fuerza = FuerzaPicoFino;
        durabilidad = new DurabilidadPorcentual(DurabilidadPicoFino, PorcentajeDesgastePicoFino);
    }
    @Override
    public void usar(MaterialMineral materialMineral) {
        materialMineral.serGolpeado(this);
    }

    @Override
    public void golpear(Madera madera) {
        // El PicoFino no se desgasta contra Madera.
    }

    @Override
    public void golpear(Piedra piedra) {
        // El PicoFino no se desgasta contra Piedra.
    }

    @Override
    public void golpear(Metal metal) {
        // El PicoFino no se desgasta contra Metal.
    }

    @Override
    public void golpear(Diamante diamante) { durabilidad.desgastar(); }
}
