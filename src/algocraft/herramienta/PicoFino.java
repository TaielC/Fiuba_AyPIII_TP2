package algocraft.herramienta;

import algocraft.material.*;

public class PicoFino extends Herramienta {

    public PicoFino(){
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
